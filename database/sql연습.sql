use kbs;

create table test1 (
  idx   int         not null  auto_increment primary key, /* 고유번호 */
  name  varchar(20) not null,                    /* 성명 */
  age   int         default 20,					 /* 나이 */
  birth datetime    default now()                /* 생일 */
);

show tables;
/* Ctrl+Enter : 한줄 명령 실행 */
/* Ctrl + Shift + Enter : 지정된 범위의 명령 모두 실행 */
insert into test1 (name) values ('홍길동');
insert into test1 (name,birth) values ('홍길동','2020-5-10');
insert into test1 (name,age) values ('홍길동',30);
insert into test1 values (default,'김말숙',25,default);
insert into test1 values (default,'이기자',33,'2000-1-1');
insert into test1 values (default,'강감찬',42,'2001-4-3');
insert into test1 values (default,'이사랑',30,'1997-4-1');
insert into test1 values (default,'오하늘',37,'1990-2-5');
insert into test1 values (default,'소나무',21,'2002-6-6');
insert into test1 values (default,'고인돌',35,'2004-11-25');

select * from test1;
select * from test1 order by idx;
select * from test1 order by idx desc;
select * from test1 order by name;
select name from test1;
select name, birth from test1;
select name as 성명, birth 생일 from test1;

-- 테이블의 구조변경....alter
-- 테이블에 필드 추가(alter table 테이블명 add column 컬럼명 타입(길이) 옵션;)
-- 문제) test1테이블에 성별(gender, char(2), null허용, 기본값 없음) 추가하시오.
alter table test1 add column gender char(2);
desc test1;
-- 필드 변경 : alter table 테이블명 modify column 변경할컬럼명 타입...
-- 문제) gender필드의 기본값을 '여자'로 설정?
alter table test1 modify column gender char(2) default '여자';
desc test1;

-- 필드명 변경 : alter table 테이블명 change column 기본컬럼명 변경할컬럼명;
-- 문제) gender필드를 sex로 변경하시오?
alter table test1 change column gender sex char(2);

-- 필드명 삭제 : alter table 테이블명 drop column 삭제할컬럼명;
-- 문제) sex필드를 삭제하시오.
alter table test1 drop column sex;

-- 테이블 이름 바꾸기 : alter table 원본테이블명 rename 새로운테이블명;
alter table test2 rename test1;

show tables;
desc test1;
alter table test1 add column gender char(2) default '여자';
select * from test1;

-- 조건을 지정한 검색? where절과 조건을 사용한다.
-- '홍길동'을 검색?
select * from test1 where name='홍길동';
-- 나이가 30세 이상을 검색?
select * from test1 where age>=30;
-- 나이가 30세~40세까지(포함) 검색?(between ~ and)
select * from test1 where age>=30 and age<=40;
select name, age from test1 where age between 30 and 40;

-- 30세 홍길동을 검색?
select * from test1 where name='홍길동' and age=30;

-- 여자 중에서 생일일이 2000년 이전에 출생한 여자들을 검색?
select * from test1 where gender='여자' and birth<'2000-01-01';

-- 나이가 20대 이거나 40대 인 자료를 검색?
select * from test1 where (age>=20 and age<=29) or (age>=40 and age<=49);

-- 여자이거나 30대 출력?
select * from test1 where gender='여자' or (age>=30 and age<40);
-- 포함(일치)하는 자료의 검색(in)
-- '홍길동','이기자','오하늘'을 검색?
select * from test1 where name in ('홍길동','이기자','오하늘');

-- 특정 문자열이 포함된 자료 검색?(like %)
-- '홍'씨 성을 가진 사람만 출력?
select * from test1 where name like '홍%';

-- '동'으로 끝나는 이름을 가진 사람만 출력?
select * from test1 where name like '%동';

-- 이름중에서 '오'를 가지고 있는 사람은?
select * from test1 where name like '%오%';

-- name필드중 이름이 3자리인 '홍'씨성을 가진 사람을 출력하시오?
select * from test1 where name like '홍__';

-- 자료 수정 명령 : update 테이블명 set 필드명=변경할내용;
