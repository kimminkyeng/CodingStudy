show tables;

create table BookOrder (
  idx int not null auto_increment primary key,
  mid varchar(20) not null,
  pwd varchar(20) not null,
  name varchar(20) not null,
  address varchar(20) not null,
  Book varchar(20) not null
);

desc BookOrder;

insert into BookOrder values (default, 'hkd1234','1234','홍길동','서울','아홉살인생');
insert into BookOrder values (default,'kms1234','1234','김말숙','분당','더잡');
insert into BookOrder values (default,'kim1234','2222','김민경','청주','하늘과 바람과 별과 시');

select * from BookOrder;
select * from BookOrder where name='홍길순';
select * from BookOrder where name like '%나무%';

delete from BookOrder where name='';

drop table BookOrder;