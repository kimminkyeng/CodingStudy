/* 테이블명 : hakkwa (학과) */
create table hakkwa(
  code int not null primary key, /* 학과 코드*/
  name varchar(20)               /* 학과명 */
);

insert into hakkwa values (101,'경영학과');
insert into hakkwa values (102,'건축학과');
insert into hakkwa values (103,'컴퓨터공학과');
insert into hakkwa values (104,'회계학과');

select * from hakkwa;
/* drop table hakkwa; */

/* 테이블명 : student (학생) */
create table student(
  stu_id int not null auto_increment primary key, /* 학생고유번호*/
  name varchar(20) not null,                      /* 학생이름 */
  hakkwa_code int,                                /* 학과코드(외래키설정)*/
  foreign key(hakkwa_code) references hakkwa(code)/* 학과테이블의 code를 학생테이블의 외래키(hakkwa_code)로 설정함*/
  on update cascade     /* 관련 테이블의 정보가 변경되면 현재 테이블의 정보도 변경된다. */
  on delete set null    /* 관련 테이블의 정보가 지워지면 현재 테이블의 필드가 null로 채워진다. */
);

insert into student values (default,'홍길동',101);
insert into student values (default,'김말숙',102);
insert into student values (default,'이기자',103);
insert into student values (default,'강감찬',104);
insert into student values (default,'오사랑',101);

select * from student;
/* drop table student; */

select * from hakkwa;
select * from student;

update student set hakkwa_code=105 where stu_id=2; 
update student set hakkwa_code=103 where stu_id=2; 
update student set hakkwa_code=102 where stu_id=2;

update hakkwa set code=201 where code=102;

/* 제약조건 확인 */
/* 현재 시스템의 모든 제약조건을 확인 */
select * from information_schema.table_constraints;

/* 특정 데이터베이스에 설정된 제약조건 확인 */
select * from information_schema.table_constraints where constraint_schema='javadb';

/* 특정 DB의 테이블의 제약조건 확인 */
select * from information_schema.table_constraints where table_name='hakkwa';
select * from information_schema.table_constraints where table_name='student';


/* 외래키의 제약조건을 삭제(student의 외래키 삭제). 삭제후 특정 DB의 테이블의 제약조건 재확인 */
alter table student drop foreign key student_ibfk_1;
alter table student add constraint hakkwa_code foreign key(code) references hakkwa(code); /**/

/* 기본키를 삭제하면 에러가 난다. 왜냐하면 stu_id는 auto_increment로 설정되어 있기 때문에.*/ 
alter table student drop primary key;

/* student테이블의 stu_id의 primary key속성을 지우기 위해 auto_increment속성을 변경한다. */
alter table student modify stu_id int;
desc student;
/*재실행*/
alter table student drop primary key;
select * from information_schema.table_constraints where table_name='student';

/* primary key 추가 */
alter table student add primary key(stu_id);
/*재실행*/
select * from information_schema.table_constraints where table_name='student';

/* 학과테이블의 건축학과(코드:201) 삭제 하기전에 학과테이블, 학생테이블 삭제. 그리고 다시 재생성후 삭제처리.*/
delete from hakkwa where code=101; /*홍길동과 오사랑 학생의 hakkwa_code 가 null로 나타난다.*/

/*---------------------------------------------------------------------------------------*/
/* 테이블명 : student (학생) */
create table student2(
  stu_id int not null auto_increment primary key, /* 학생고유번호*/
  name varchar(20) not null,                      /* 학생이름 */
  hakkwa_code int,                                /* 학과코드(외래키설정)*/
  foreign key(hakkwa_code) references hakkwa(code)/* 학과테이블의 code를 학생테이블의 외래키(hakkwa_code)로 설정함*/
  on update cascade     /* 관련 테이블의 정보가 변경되면 현재 테이블의 정보도 변경된다. */
  on delete restrict    /* 관련 테이블의 정보가 지워지면 현재 테이블의 필드가 null로 채워진다. */
);

insert into student2 values (default,'홍길동',102);
insert into student2 values (default,'김말숙',102);
insert into student2 values (default,'이기자',103);
insert into student2 values (default,'강감찬',104);
insert into student2 values (default,'오사랑',102);

select * from student2;
select * from hakkwa;
/* drop table student2; */
update hakkwa set code=105 where code=102; /*102 code 건축학과를 105 code로 변경.*/
delete from hakkwa where code=105; /*on delete restrict 설정했기때문에 삭제가 안되어 에러남.*/
delete from hakkwa where code=102;