show tables;

/* 택백 목록 */
create table courier (
  idx  int not null auto_increment,             /* 고유번호 */
  part    varchar(20) not null,                 /* 분류 */
  arrival datetime    not null default now(),   /* 도착일자 */
  product varchar(50) not null,                 /* 택배물품명 */
  receive varchar(20) not null,                 /* 받는사람 */
  send    varchar(20) not null,                 /* 보낸사람 */
  cost    int         not null default 0,       /* 택배비용(보관비용) */
  save_idx int not null,                        /* 보관함 고유번호 */
  bigo    text,                                 /* 기타 사항 */
  primary key (idx, product)
);
drop table courier;

select * from courier order by idx desc;
select * from courier where receive like '%홍%' order by idx desc;
select arrival from courier group by arrival order by idx desc;
delete from courier where idx=10;
delete from courier where idx>10;

insert into courier values (default,'기타','2020-08-30','기타','관리자','관리자',2500,1,'관리자 사물함입니다.');
insert into courier values (default,'전자제품','2020-08-30','렌턴','홍길동','이기자',2500,2,'취급주의');
insert into courier values (default,'생활용품','2020-08-31','비누','홍길동','김말숙',0,3,'');
insert into courier values (default,'기타','2020-08-30','클래식기타','홍길동','이기자',5000,4,'본인에게 직접 전달요망');
insert into courier values (default,'식품류','2020-08-31','김치','김말숙','강감찬',2500,5,'냄새주의');
insert into courier values (default,'생활용품','2020-08-31','라면','김말숙','소나기',2500,6,'건조한곳에 보관하세요');
insert into courier values (default,'생활용품','2020-08-30','바구니','김말숙','강감찬',0,7,'섞이지 않게 주의하세요.');
insert into courier values (default,'기타','2020-08-31','모종삽','이수동','꽃밭에',3000,8,'날카로우니 취급주의');

/* 택배물 위치 저장 */
create table courier_save (
  idx   int  not null,                         /* 보관함 고유번호 */
  state varchar(10) not null default '보관중',   /* 보관함 상태(0:비었음/1:보관중/2:수리중) */
  customer_idx  int,                           /* 고객 고유번호 */
  customer_name varchar(20),                   /* 고객 성명 */
  primary key (idx)
);
  --foreign key(customer_idx) references courier(idx)
  --on update cascade       /* courier테이블의 자료를 삭제하면 courier_check테이블의 내용도 갱신된다. */
  --on delete cascade
drop table courier_save;

select * from courier_save order by idx desc;
select count(idx) from courier_save where state='보관중';

insert into courier_save values (1,'보관중',1,'관리자');
insert into courier_save values (2,'보관중',2,'홍길동');
insert into courier_save values (3,'보관중',3,'홍길동');
insert into courier_save values (4,'보관중',4,'홍길동');
insert into courier_save values (5,'보관중',5,'김말숙');
insert into courier_save values (6,'보관중',6,'김말숙');
insert into courier_save values (7,'보관중',7,'김말숙');
insert into courier_save values (8,'보관중',8,'이수동');
insert into courier_save (idx,state,customer_idx) values (9,"비었음",1);
insert into courier_save (idx,state,customer_idx) values (10,"비었음",1);
insert into courier_save (idx,state,customer_idx) values (11,"비었음",1);
insert into courier_save (idx,state,customer_idx) values (12,"비었음",1);
insert into courier_save (idx,state,customer_idx) values (13,"비었음",1);
insert into courier_save (idx,state,customer_idx) values (14,"비었음",1);
insert into courier_save (idx,state,customer_idx) values (15,"비었음",1);
insert into courier_save (idx,state,customer_idx) values (16,"비었음",1);
insert into courier_save (idx,state,customer_idx) values (17,"비었음",1);
insert into courier_save (idx,state,customer_idx) values (18,"비었음",1);
insert into courier_save (idx,state,customer_idx) values (19,"비었음",1);
insert into courier_save (idx,state,customer_idx) values (20,"비었음",1);


/* 택배 수령 확인 */
create table courier_check (
  idx int not null auto_increment,      /* 고유번호 */
  courier_idx int not null,             /* 택배목록 고유번호 */
  check_man varchar(20) not null,       /* 수령자 */
  check_date datetime default now(),    /* 수령일자 */
  bigo  text,                           /* 기타 사항 */
  primary key(idx),
  foreign key(courier_idx) references courier(idx)
  on update cascade       /* courier테이블의 자료를 삭제하면 courier_check테이블의 내용도 갱신된다. */
  on delete cascade
);
drop table courier_check;

