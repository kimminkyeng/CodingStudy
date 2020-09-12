show tables;

create table test1 (
  seq  int not null auto_increment,
  name varchar(20) not null,
  email varchar(50),
  primary key(seq)
);
-- Alt+x : 지정된 범위의 명령 수행
-- Alt+s : 명령어 끝에서 수행시 해당줄의 명령만 수행처리함.

insert into test1 values (default, '홍길동', 'hkd1234@naver.com');
insert into test1 values (default, '홍길자', 'hkj1234@naver.com');
insert into test1 values (default, '홍길오', 'hkw1234@naver.com');
insert into test1 values (default, '김말숙', 'kms1234@naver.com');
insert into test1 values (default, '강하늘', 'khn1234@naver.com');
insert into test1 (name) values ('가나다');

select * from test1;

update test1 set email='khn1234@gmail.com' where name='강하늘';

alter table test1 add column gender char(1) default 'm';

update test1 set gender='f' where name in ('김말숙','강하늘','홍길자');

create table test2 select * from test1; -- test1 테이블을 test2 테이블로 복사한다.

-- test2번 테이블이 없으면 test1번 테이블을 복사하여 test2 테이블로 생성한다.
create table if not exists test2 select * from test1;


select * from test2;
alter table test2 add column age int default 20;
alter table test1 add column addr varchar(20);

update test2 set age=age+10 where seq=2 or seq=4 or seq=6;
update test2 set age=age-2 where gender='f';
update test1 set addr='서울' where seq=2 or seq=4 or seq=6;
update test1 set addr='청주' where gender='f' and age<20; -- age가 test1에 없어서 계속 에러남.

select name, max(age) from test2 where gender='f';
select name, age from test2 where gender='f'; order by age desc limit 0,1;

-- 서브쿼리 사용(1.필드절 2.from절 3.where절)
select name, email from test2 where gender in;
(select gender from test2 where gender='f');

select * from test2 where gender='f';
select name, (select email from test2 where name='홍길동') from test2;

select name, email from (select * from test2 where gender='f') as aa;

select a.name, a.email, b.age from test1 as a, test2 as b; -- test1은 a. test2는 b로 지정함.
select a.name, a.addr, b.age from test1 as a, test2 as b;

-- 중복자료의 처리 : union
select name, email from test1 union (select name, email from test2); -- 동일한 자료는 1개만 출력.
select name, email from test1 union all (select name, email from test2); -- 전체 테이블의 내용을 출력.

-- update test1 set addr='청주' where gender='f' and age<20;



select * from test1;
select * from test2;

