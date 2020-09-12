use sample;
create table book(
	    bookid int NOT NULL ,            -- 책 고유번호
    	bookname VARCHAR(15) NOT NULL,   -- 책 이름
    	publisher VARCHAR(15) NOT NULL,  -- 책 출판사
	    price int NOT NULL               -- 책 가격(정가)
     );
-- drop table book;

     /*주문 테이블*/
     create table orders(
	    orderid int NOT NULL ,       -- 주문 고유번호
    	custid VARCHAR(15) NOT NULL, -- 주문자의 고유번호
	    bookid int NOT NULL ,        -- 책 고유번호 (내생각에 기본 키 임을 예상됨)
    	saleprice int NOT NULL,      -- 책 할인가격
	    price int NOT NULL,          -- 실제 판매가격
	    orderdate  DATEtime          -- 주문날짜
     );
-- drop table orderss;     

/*고객 테이블*/     
create table Customer(
	    custid int NOT NULL ,         -- 고객 고유번호(주문자 고유번호)
    	name VARCHAR(15) NOT NULL,    -- 고객 성명
    	address VARCHAR(15) NOT NULL, -- 고객 주소
	    phone VARCHAR(15) NOT NULL    -- 고객 전화번호
     );
     -- drop table Customer;
desc customer;
     
INSERT INTO Book VALUES(1, '축구의 역사', '굿스포츠', 7000);
INSERT INTO Book VALUES(2, '축구아는 여자', '나무수', 13000);
INSERT INTO Book VALUES(3, '축구의 이해', '대한미디어', 22000);
INSERT INTO Book VALUES(4, '골프 바이블', '대한미디어', 35000);
INSERT INTO Book VALUES(5, '피겨 교본', '굿스포츠', 8000);
INSERT INTO Book VALUES(6, '역도 단계별기술', '굿스포츠', 6000);
INSERT INTO Book VALUES(7, '야구의 추억', '이상미디어', 20000);
INSERT INTO Book VALUES(8, '야구를 부탁해', '이상미디어', 13000);
INSERT INTO Book VALUES(9, '올림픽 이야기', '삼성당', 7500);
INSERT INTO Book VALUES(10, '올림픽 챔피언스', 'Pearson', 13000);
    
INSERT INTO Customer VALUES (1, '박지성', '영국 맨체스타', '000-5000-0001');
INSERT INTO Customer VALUES (2, '김연아', '대한민국 서울', '000-6000-0001');  
INSERT INTO Customer VALUES (3, '장미란', '대한민국 강원도', '000-7000-0001');
INSERT INTO Customer VALUES (4, '추신수', '미국 클리블랜드', '000-8000-0001');
INSERT INTO Customer VALUES (5, '박세리', '대한민국 대전',  '111-0000-1234');


INSERT INTO orders VALUES (1, 1, 1, 6000, 6800, '2017-07-03'); 
INSERT INTO orders VALUES (2, 1, 3, 21000, 35000,  '2017-07-03');
INSERT INTO orders VALUES (3, 2, 5, 8000, 8800, '2017-07-03'); 
INSERT INTO orders VALUES (4, 3, 6, 6000, 6600, '2017-07-04'); 
INSERT INTO orders VALUES (5, 4, 7, 20000, 25000, '2017-07-05');
INSERT INTO orders VALUES (6, 1, 2, 12000, 19000, '2017-07-07');
INSERT INTO orders VALUES (7, 4, 8, 13000, 20000,  '2017-07-07');
INSERT INTO orders VALUES (8, 3, 10, 12000, 18000, '2017-07-08'); 
INSERT INTO orders VALUES (9, 2, 10, 7000, 10000, '2017-07-09'); 
INSERT INTO orders VALUES (10, 3, 8, 13000, 14500, '2017-07-10');
select * from orders;
desc orders;

alter table orders drop column price;

show tables;
desc sample;

select * from book;
select * from orders;
select * from customer;

-- order 테이블의 판매가격이 만원 이상인 도서를 구매한 고객에 대하여 주문 도서의 총 수량을 구하시오.
select custid, count(*) as 도서수량 from orders where price>=10000 group by custid;

-- orders 테이블의 판매가격이 만원 이상인 도서를 구매한 고객에 대하여 주문 도서의 총 수량을 구하시오.(단 2권 이상만 출력하시오.)
select custid, count(*) as 도서수량 from orders where price>=10000
       group by custid having count(*)>=2;
       
-- 고객테이블을 주문테이블과 조건없이 결합해 본다.
select * from customer, orders;
select * from customer cc, orders oo; -- 앞으로는 윗줄 아닌 여기줄처럼 작성하면됨.
select * from book as bb, orders oo;

-- 고객과 해당 고객이 주문한 자료를 고객번호순으로 출력해 본다.
select * from customer cc, orders oo where cc.custid=oo.custid order by cc.custid;

-- 고객의 이름과 해당 고객이 주문한 도서의 판매가격을 출력하시오.
select name, oo.price from customer cc, orders oo where cc.custid=oo.custid;

-- 고객별로 주문한 모든 도서의 총 판매액을 구하시오.(고객별로 오름차순 정렬)
select name, sum(price) from customer cc, orders oo where cc.custid=oo.custid
       group by cc.name order by cc.name;       
       
-- 고객의 이름과 고객이 주문한 도서의 이름을 출력 하시오.(단, 고객 이름순으로 출력) : Inner Join(은 안에다 쓰지 않음)
select cc.name, bb.bookname from customer cc, orders oo, book bb 
  where cc.custid=oo.custid and oo.bookid=bb.bookid order by cc.name;
  
-- 도서를 구매하지 않은 고객을 포함하여 고객의 이름과 고객이 주문한 도서의 도서이름과 판매가격을 출력 하시오.(단, 고객명 순으로 출력) : Outer Join
/* select cc.name, oo.price, bb.bookname from customer cc left outer join orders oo -- 주문테이블의 바깥쪽 집합.
  on cc.custid=oo.custid order by cc.name;*/
  -- left join 안쓰는 경우
select cc.name, oo.bookid from customer cc, orders oo where cc.custid=oo.custid order by cc.name;
  -- left join 쓰는 경우 (왼쪽 기준)
select cc.name, oo.bookid from customer cc left join orders oo 
  on cc.custid=oo.custid order by cc.name;
-- right join 쓰는 경우 (오른쪽 기준)
select cc.name, oo.bookid from customer cc right join orders oo
  on cc.custid=oo.custid order by cc.name;

-- 도서중에서 가장 비싼 도서의 책이름은?
select bookname from book where price = (select max(price) from book);

-- 도서를 구매한적이 있는 고객의 이름을 출력하시오.(이름은 오름차순)
select name from customer where custid in (select custid from orders); 
