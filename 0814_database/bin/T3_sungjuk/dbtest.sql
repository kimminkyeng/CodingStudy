show tables;

select * from test1; -- 결과 보는 키 : alt+s.

desc test1;

create table sungjuk (
  idx    int not null auto_increment, /* 고유번호*/
  hakbun int not null,                /*학번*/
  name   varchar(20) not null,        /*성명*/
  kor    int not null default 0,      /*국어점수*/
  eng    int not null default 0,      /*영어점수*/
  mat    int not null default 0,      /*수학점수*/
  tot    int not null default 0,      /*총점*/
  avg    int not null default 0,      /*평균*/
  grade  char(1),                     /*학점*/
  wdate  timestamp default now(),     /*시험본 날짜*/
  primary key(idx, hakbun)            /*기본키(고유번호, 학번)*/
);

desc sungjuk;

insert into sungjuk () values ();

select * from sungjuk; -- 마우스로 블럭하고 Alt+x 하면 결과테이블 볼수있다.