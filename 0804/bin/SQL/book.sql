/* 상품(책) 정보 테이블 */
create table book2 (
  bookid    int  not null  auto_increment  primary key, /* 책 고유번호 */
  bookname  varchar(30) not null,   /* 책이름 */
  publisher varchar(20) not null,   /* 출판사 */
  price     int not null        /* 책가격(정가) */
);

-- drop table book2;
desc book2;

/* 주문자(고객) 테이블 */
create table customer2 (
  custid  int  not null  auto_increment primary key,   /* 고객 아이디 */
  name    varchar(20) not null,       /* 고객명 */
  address varchar(30) not null,       /* 고객주소 */
  phone   varchar(15)           /* 고객 연락서 */
);

-- drop table customer2;
desc customer2;

/* 주문 테이블 */
create table orders2 (
  orderid   int not null auto_increment primary key,  /* 주문 고유번호 */
  custid    int not null,     /* 고객(주문자) 아이디 */
  bookid    int not null,       /* 책 고유번호 */
  saleprice int not null,       /* 책 가격(판매가) */
  orderdate timestamp       /* 책 주문날자 */
);

-- drop table orders2;
desc orders2;

show tables;

-- Book(책정보)
INSERT INTO Book2 VALUES(1, '축구의 역사', '굿스포츠', 7000);
INSERT INTO Book2 VALUES(2, '축구아는 여자', '나무수', 13000);
INSERT INTO Book2 VALUES(3, '축구의 이해', '대한미디어', 22000);
INSERT INTO Book2 VALUES(4, '골프 바이블', '대한미디어', 35000);
INSERT INTO Book2 VALUES(5, '피겨 교본', '굿스포츠', 8000);
INSERT INTO Book2 VALUES(6, '역도 단계별기술', '굿스포츠', 6000);
INSERT INTO Book2 VALUES(7, '야구의 추억', '이상미디어', 20000);
INSERT INTO Book2 VALUES(8, '야구를 부탁해', '이상미디어', 13000);
INSERT INTO Book2 VALUES(9, '올림픽 이야기', '삼성당', 7500);
INSERT INTO Book2 VALUES(10, 'Olympic Champions', 'Pearson', 13000);
INSERT INTO Book2 VALUES(11, '가나다', '삼성당', 17500);
INSERT INTO Book2 VALUES(12, '포토샵CS6', '제우미디어', 25000);
INSERT INTO Book2 VALUES(13, '아시안게임 이야기', '스포츠북', 19500);
INSERT INTO Book2 VALUES(14, '우리들 이야기', '우리출판사', 5000);

-- Customer(고객정보)
INSERT INTO Customer2 VALUES (1, '박지성', '영국 맨체스타', '000-5000-0001');
INSERT INTO Customer2 VALUES (2, '김연아', '대한민국 서울', '000-6000-0001');  
INSERT INTO Customer2 VALUES (3, '장미란', '대한민국 강원도', '000-7000-0001');
INSERT INTO Customer2 VALUES (4, '추신수', '미국 클리블랜드', '000-8000-0001');
INSERT INTO Customer2 VALUES (5, '박세리', '대한민국 대전',  NULL);
INSERT INTO Customer2 VALUES (6, '이순신', '대한민국 아산',  NULL);

-- Orders(주문정보) 데이터 생성
INSERT INTO Orders2 VALUES (1, 1, 1, 6000, '2019-07-01'); 
INSERT INTO Orders2 VALUES (2, 1, 3, 21000, '2019-02-03');
INSERT INTO Orders2 VALUES (3, 2, 5, 8000, '2019-05-03'); 
INSERT INTO Orders2 VALUES (4, 3, 6, 6000, '2019-06-04'); 
INSERT INTO Orders2 VALUES (5, 4, 7, 20000, '2019-11-05');
INSERT INTO Orders2 VALUES (6, 1, 2, 12000, '2019-09-07');
INSERT INTO Orders2 VALUES (7, 4, 8, 13000, '2019-03-07');
INSERT INTO Orders2 VALUES (8, 3, 10, 12000, '2019-07-08'); 
INSERT INTO Orders2 VALUES (9, 2, 10, 7000, '2019-05-09'); 
INSERT INTO Orders2 VALUES (10, 3, 8, 13000, '2019-06-10');

select * from book2;
select * from customer2;
select * from orders2;

/* 책 테이블의 모든 출판사의 이름을 출력하세요 */
select publisher from book2;

/* 책 테이블의 모든 출판사의 이름을 한번씩만 출력하세요 */
select distinct publisher from book2;

/* 책 테이블의 책 가격이 1만원에서 2만원 사이값을 출력하세요*/
select * from book2 where price >=10000 and price <=20000;
select * from book2 where price between 10000 and 20000;

/* book테이블에서 '굿스포츠'와'대한미디어' 출판사의 목록을 보여주시오*/
select * from book2 where publisher='굿스포츠' or publisher='대한미디어';
select * from book2 where publisher='굿스포츠' or publisher='대한미디어' order by publisher;
select * from book2 where publisher in ('굿스포츠','대한미디어') order by publisher;

/* book테이블에서 '굿스포츠'와'대한미디어' 출판사를 제외한 목록을 보여주시오*/
select * from book2 where publisher not in('굿스포츠','대한미디어') order by publisher;

/* book테이블의 책제목중 '축구'라는 문구가 들어있는 책 목록을 출력하시오.*/
select * from book2 where bookname like '%축구%';

/* book테이블의 책제목중 첫글자는 모든문자가 와도 관계없고, 세번째글자는 '의'로 시작하는 책 이름을 출력하시오.*/
select * from book2 where bookname like '__의%';

/* book테이블에서, '축구'에 관한 도서중 1만원 이상인 도서를 출력하시오.*/
select * from book2 where price >=10000 and bookname like '%축구%';

/* book테이블에서, 책 가격이 2만원 이하인 책을 출력하되, 출판사 오름차순, 출판사가 같으면 책 이름 내림차순 출력하시오.*/
select * from book2 where price <=20000 order by publisher, bookname desc;

/* 고객이 주문한 도서의 총 가격/평균가격/최고가격/최저가격을 출력하시오.*/
select sum(saleprice), avg(saleprice), max(saleprice), min(saleprice) from orders2;
select format(sum(saleprice),0) 합계, format(avg(saleprice),0) 평균, format(max(saleprice),0) 최대, format(min(saleprice),0) 최소 from orders2;

/* 주문이 들어온 총 건수는? */
select count(*) from orders2;

/* 고객별로 주문한 도서의 총수량과 총판매액을 구하시오.*/
select count(*) as 총수량, sum(saleprice) as 총판매액 from orders2 group by custid;
select custid as 고객번호, count(*) as 총수량, sum(saleprice) as 총판매액 from orders2 group by custid;

/* 가격이 만원 이상인 도서를 구매한 고객에 대하여, 고객별 주문 도서의 총 수량을 구하시오*/
select custid 고객번호, count(*) as 총수량 from orders2 where saleprice >=10000 group by custid;

/* 가격이 8천원 이상인 도서를 구매한 고객에 대하여, 고객별 주문 도서의 총 수량을 구하시오*/
/* 단, 두권이상 구매한 고객만을 대상으로 처리하시오.*/
select custid 고객번호, count(*) 총수량 from orders2 where saleprice >=8000 group by custid having count(*) >=2;

/* 내부 조인 */
/* 고객(customer2)테이블을 주문(orders2)테이블과 연결해서 함께 출력하시오.*/
select * from customer2, orders2;
select * from customer2 cc, orders2 oo;

/*고객과 해당고객이 주문한 책들의 자료를 출력하시오*/
select * from customer2 cc, orders2 oo where cc.custid=oo.custid;
select * from customer2 cc, orders2 oo where cc.custid=oo.custid order by cc.custid;

/*고객의 이름과 해당 고객이 주문한 도서의 판매가격을 출력하시오*/
select cc.name, oo.saleprice from customer2 cc, orders2 oo where cc.custid=oo.custid;
select cc.name, oo.saleprice from customer2 cc, orders2 oo where cc.custid=oo.custid order by cc.name, oo.saleprice desc; 

/*고객별로 주문한 모든 도서의 총 판매액(총 구입액)을 구하여 고객별로 오름차순, 같을시는 가격 내림차순으로 출력하시오.*/
select cc.name, sum(oo.saleprice) from customer2 cc, orders2 oo where cc.custid=oo.custid group by cc.custid order by cc.name, oo.saleprice desc;

/*고객의 이름과 고객이 주문한 도서의 이름을 검색하시오.*/
select cc.name, bb.bookname from customer2 cc, book2 bb, orders2 oo where cc.custid=oo.custid and oo.bookid = bb.bookid order by cc.name;

/*도서가격이 2만원 이상인 도서를 주문한 고객의 이름과 도서명을 출력하시오. */
select cc.name, bb.bookname from customer2 cc, book2 bb, orders2 oo where cc.custid=oo.custid and oo.bookid = bb.bookid and oo.saleprice >=20000 order by cc.name;

/* 외부조인 */
/* 도서를 구매하지 않은 고객을 포함해서 고객의 이름과 고객이 주문한 도서의 판매가격을 검색하시오. */
select cc.name, oo.saleprice from customer2 cc left outer join orders2 oo
  on cc.custid=oo.custid order by cc.name; -- left outer join은 왼쪽테이블(customer2)을 기준으로 반대쪽 테이블 처리.
  
select cc.name, oo.saleprice from customer2 cc right outer join orders2 oo
  on cc.custid=oo.custid order by cc.name; -- right outer join은 오른쪽테이블(orders2)을 기준으로 테이블 처리.(책을 안산 박세리와 이순신이 제외되어 출력됨.)
  
/* sub query(부속질의) */
/* 도서 목록중에서 가장 비싼 도서의 이름을 출력하시오.*/
select bookname from book2 where price = (select max(price) from book2);

/* 도서 목록중에서 가장 비싼 도서의 이름과 가격을 출력하시오.*/
select bookname, price from book2 where price = (select max(price) from book2); -- 서브쿼리 연산자 중,'='는 결과가 한개일때 사용

/* 도서를 구매한 적이 있는 고객의 이름을 출력하시오. */
select cc.name from customer2 cc where cc.custid in (select custid from orders2); -- 서브쿼리 연산자 중,'in' 혹은 'not in'은 결과가 한개일때 사용

/* '대한미디어'에서 출판한 도서를 구매한 고객의 이름을 출력하시오.*/
select cc.name from customer2 cc where custid in (select custid from orders2 where bookid in (select bookid from book2 where publisher='대한미디어'));

/* 출판사별로 출판사의 평균도서 가격보다 비싼 도서명을 구하시오.*/
select bb.publisher, bb.price, bb.bookname from book2 bb where bb.price > (select avg(bb2.price) from book2 bb2 where bb.publisher=bb2.publisher);

/*문제풀이*/
/*1.(1)박지성이 구매한 도서의 출판사 수. distinct 는 같은걸 묶어버리는 함수.*/
select count(distinct bb.publisher) from book2 bb, orders2 oo where oo.bookid=bb.bookid and oo.custid=(select custid from customer where name='박지성');

/*1.(2)박지성이 구매한 도서의 이름, 가격, 정가와 판매가격의 차이*/
select bb.bookname, bb.price, oo.saleprice, (bb.price-oo.saleprice) from book2 bb, orders2 oo where oo.bookid=bb.bookid and oo.custid=(select custid from customer where name='박지성');

/*1.(3) 박지성이 구매하지 않은 도서의 이름*/
/*책 목록중에서 박지성이 구매한 도서 아이디*/
select oo.bookid from orders2 oo where oo.custid = (select custid from customer2 where name='박지성');

/*앞의 결과를 가지고 책의 이름을 구하시오.*/
select bb.bookname from book2 bb where bb.bookid in(select oo.bookid from orders2 oo where oo.custid = (select custid from customer2 where name='박지성'));

/*앞의 자료에서 '박지성'이 구매하지 않은 도서의 이름*/
select bb.bookname from book2 bb where bb.bookid not in(select oo.bookid from orders2 oo where oo.custid = (select custid from customer2 where name='박지성'));

/*2.(4) 주문하지 않은 고객의 이름(부속질의 사용) */
/*주문한 고객의 아이디 검색*/
select distinct custid from orders2;
/* 주문하지 않은 고객의 이름*/
select cc.name from customer2 cc where cc.custid not in (select distinct custid from orders2);

/*2.(5) 주문 금액의 총액과 주문의 평균 금액 */
/*주문금액의 총액*/
select sum(saleprice) as 총액, avg(saleprice) as 평균 from orders2;
select format(sum(saleprice),0) as 총액, format(avg(saleprice),0) as 평균 from orders2;

/*2. (6) 고객의 이름과 고객별 구매액 합계*/
select cc.name, sum(oo.saleprice) as 구매액 from customer2 cc, orders2 oo where cc.custid=oo.custid group by cc.name;

/*2. (7) 고객의 이름과 고객이 구매한 도서 목록*/
select cc.name, bb.bookname from customer2 cc, book2 bb, orders oo where bb.bookid=oo.bookid and cc.custid=oo.custid order by cc.name;

/*2. (8) 도서의 가격(Book 테이블)과 판매가격(Orders 테이블)의 차이가 가장 많은 주문*/
select bb.bookname, max(bb.price-oo.saleprice) from book2 bb, orders2 oo where bb.bookid=oo.bookid;

/*2. (9) 도서의 판매액 평균보다 자신의 구매액 평균이 더 높은 고객의 이름*/
/*도서의 판매액 평균*/
select format(avg(saleprice),0) from orders2;
/*고객별 평균 구매액*/
select name, format(avg(oo.saleprice),0) from customer2 cc, orders2 oo where cc.custid=oo.custid group by name;
/*도서의 판매액 평균보다 자신의 구매액 평균이 더 높은 고객의 이름*/
select name from (select name, format(avg(oo.saleprice),0) aa from customer2 cc, orders2 oo where cc.custid=oo.custid group by name) as temp where temp.aa > (select format(avg(saleprice),0) from orders2);
select name, format(avg(oo.saleprice),0) 고객별구매액 from customer2 cc, orders2 oo where cc.custid=oo.custid group by name having 고객별구매액 > (select format(avg(saleprice),0) from orders2);

