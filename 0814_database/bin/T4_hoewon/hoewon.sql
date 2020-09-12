show tables;

create table hoewon (
  idx int not null auto_increment, /*고유번호*/
  hid varchar(20) not null,        /*회원 아이디*/
  pwd varchar(20) not null,        /*비밀번호*/
  name varchar(20) not null,       /*회원성명*/
  gender varchar(2) not null,      /*성별*/
  job varchar(10) default '기타',   /*직업*/
  address varchar(10),             /*지역(주소)*/
  joinday datetime default now(),  /*회원가입일자*/
  primary key(idx, hid)            /*기본키 : idx(고유번호),hid(회원아이디)*/
);

desc hoewon;
/*drop table hoewon*/
/*delete from hoewon*/

select * from hoewon order by idx desc;