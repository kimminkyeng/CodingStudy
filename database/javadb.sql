use javaDb;

create table memberTest(
m_id varchar(20) not null,
pwd varchar(20) not null,
name varchar(20) not null,
age int default 20,
gender char(2) default 'm',
birthday datetime,
address varchar(50)
);

show tables;

insert into memberTest value ('m1','1234','김민경','32','g','1989-08-02','청주');
