use kbs;

create table test1 (
   idx int not null auto_increment primary key, /* 고유번호 */
   name varchar(20) not null,       /*성명*/
   age int default 20,              /*나이*/
   birth datetime default now()    /* 생일*/
   );
   
show tables;

insert into test1 (name) values ('홍길동');
insert into test1 (name,birth) values ('홍길동','2020-5-10');
insert into test1 (name,age) values ('홍길동',30);
insert into test1 values (default,'김말숙',25,default);
insert into test1 values (default,'이기자',33,'2020-1-1');
insert into test1 values (default,'강감찬',42,'2001-4-3');
insert into test1 values (default,'이사랑',30,'1997-4-1');
insert into test1 values (default,'오하늘',37,'1990-2-5');
insert into test1 values (default,'소나무',21,'2002-6-6');
insert into test1 values (default,'고인돌',35,'2004-11-25');

select * from test1;
select * from test1 order by idx;
select * from test1 order by idx desc; /*desc는 내림차순*/
select * from test1 order by name;
select name from test1;
select name, birth from test1;
select name as 성명, birth 생일 from test1;

-- 테이블의 구조변경... alter DDL 언어
-- 테이블에 필드 추가(alter table 테이블명 add 컬럼명 타입(길이) 옵션;)
-- 문제) test1테이블에 성별(gender char(2) null허용, 기본값 없음) 추가하시오.alter
alter table test1 add column gender char(2);
desc test1;
-- 필드 변경 : alter table 테이블명 modify column 변경할컬럼명 타입...
-- 문제) gender필드의 기본값을'여자'로 설정하시오.
alter table test1 modify column gender char(2) default '여자';
desc test1;

-- 필드명 변경: alter table 테이블명 change column 기본컬럼명 변경할컬럼명;
-- 문제) gender필드를 sex로 변경하시오.
alter table test1 change column gender sex char(2);

-- 필드명 삭제 : alter table 테이블명 drop column 삭제할컬럼명;
-- 문제) sex필드를 삭제하시오.
alter table test1 drop column sex;

-- 테이블 이름 바꾸기 : alter table 원본테이블명 rename 새로운 테이블명;
alter table test2 rename test1;

show tables;
desc test1;
alter table test1 add column gender char(2) default '여자';
select * from test1;

-- 조건을 지정한 검색 : where 절과 조건을 사용한다.
-- '홍길동'을 검색하세요.
select * from test1 where name='홍길동';

-- 나이가 30세 이상을 검색하세요.
select * from test1 where age>=30;

-- 나이가 30세~40세까지 포함하여 검색하세요.
select * from test1 where age>=30 and age<=40;
select name, age from test1 where age between 30 and 40;

-- 30세 홍길동을 검색하세요.
select * from test1 where name='홍길동' and age=30;

-- 여자 중에서 생일이 2000년 이전에 출생한 여자를 검색하세요.
select * from test1 where gender='여자' and birth<'2000-01-01';

-- 나이가 20대 이거나 40대인 자료를 검색하세요.
select * from test1 where (age>=20 and age<30) or (age>=40 and age<50) and gender='여자';

-- 포함(일치)하는 자료의 검색(in)
-- '홍길동','이기자','오하늘'을 검색하세요.
select * from test1 where name in ('홍길동','이기자','오하늘');

-- 특정 문자열이 포함된 자료를 검색하세요.(like와 % 연산자 포함해서 사용)
-- '홍'씨 성을 가진 사람만 출력하세요.
select * from test1 where name like '홍%';

-- '동'으로 끝나는 이름을 가진 사람만 출력하세요.
select * from test1 where name like '%동';

-- 이름중에서 '말'을 가지고 있는 사람만 출력하세요.
select * from test1 where name like '%말%';

-- name 필드에서 이름이 3자리인 '홍'씨성을 가진 사람을 보여주시오.
select * from test1 where name like '홍__';

-- 자료 수정 명령 : update 테이블명 set 필드명1=변경할내용1, 필드명2=변경할내용2, 필드명3=변경할내용3.....'where 조건식'<-이걸 매번 적어야함.(중요);
-- '홍길동'의 생일을 출력하시오.
select idx,name, birth from test1 where name='홍길동';

-- idx 3번의 이름을 '한햇빛'으로 변경하세요.
update test1 set name='한햇빛' where idx=3;

-- 남자 나이를 한살씩 증가시키세요.
update test1 set age=age+1 where gender='남자';

-- point 필드를 추가하세요.

alter table test1 add column point int default 0;
desc test1;

-- 생일이 2000년 이전에 태어난 사람에 대하여 point에 100점을 주세요.
update test1 set point = point + 100 where birth<'2000-1-1';

-- 여자이면서 생일이 2020년에 출생한 사람의 포인트를 50 증가시켜주세요.
update test1 set point = point + 50 where gender = '여자' and birth>='2020-1-1' and birth<='2020-12-31';
update test1 set point = point + 50 where gender = '여자' and birth between '2020-1-1' and '2020-12-31';
update test1 set point = point - 50 where gender = '여자' and birth between '2020-1-1' and '2020-12-31';

/* CRUD */
/*레코드의 삭제 : delete from 테이블명 where 조건절...*/
-- 강감찬 자료를 삭제하시오.
delete from test1 where name='강감찬';

-- '가나다' 남자 27세 생일 2000-05-05 point=10 자료를 추가하시오.(행 1개 추가(회원 추가)시 insert로 작성시작)
insert into test1 values (default,'가나다',27,'2000-05-05','남자',10);

-- 남자 / 여자 순으로 출력하세요.
select * from test1 order by gender;

-- 자료를 처음부터 5개만 출력하세요.(limit 뒤에는 시작인덱스번지, 출력갯수)
select * from test1 limit 0, 5;  -- 5건씩 출력시 1페이지.
select * from test1 limit 5, 5;  -- 5건씩 출력시 2페이지.
select * from test1 limit 10, 5; -- 5건씩 출력시 3페이지.

-- 여자 자료만 5건을 출력하세요.
select * from test1 where gender='여자' limit 0, 5;

-- 여자 자료만 5건을 나이 내림차순으로 출력하세요.
select * from test1 where gender='여자' order by age desc limit 0, 5;

-- 나이가 3번째로 많은 사람은?
select * from test1 order by age desc limit 2,1;
-- (리스트 중 140번째 줄 사람이 진짜로 3번째인지 확인!!)
select * from test1 order by age desc;

-- 성별 그룹을 한번씩만 출력하시오.(중복배제 명령어: distinct 필드명)
select distinct gender from test1;

-- 갯수를 세어주는 함수는? count()
-- 문제) test1 테이블의 모든 레코드의 갯수는?
select count(*) from test1;
select count(idx) as 인원수 from test1;

-- 성별이 남자인 인원수는?
/*select count(*) from test1 where gender='남자';*/
select count(gender) as 남자인원수 from test1 where gender='남자';

-- 집계하는 명령어는? group by 필드명...
-- 중복되지 않는 성별을 출력하세요.
select distinct gender as 성별 from test1;
select gender from test1 group by gender;

-- 남자와 여자의 인원수를 각각 출력하세요.
select gender as 성별, count(gender) as 인원수 from test1 group by gender;

-- 성별의 가지(종류)수는?
select count(distinct gender) from test1; /*gender는 남자, 여자 두개이니 결과는 2.*/

-- 성별의 종류가 '남자' 인것을 검색하세요.
select gender from test1 where gender like '남%' group by gender;

select gender from test1 group by gender having gender like '남%';
