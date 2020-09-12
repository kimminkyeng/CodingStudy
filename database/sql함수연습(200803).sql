select * from test1;

--  갯수를 구하는 함수? count()
select count(*) from test1;

-- 합계를 구하는 함수? sum()
-- 전체 레코드의 포인트 합계를 구하시오?
select sum(point) as 전체포인트합계 from test1;

-- 성별이 여자인 자료의 포인트 합계는?
select sum(point) as 여자포인트합계 from test1 where gender='여자';

-- 각 성별에 따른 개수와 포인트 합계를 구하시오?
select gender,count(*) ,sum(point) 포인트 from test1 group by gender;

-- 평균을 구하는 함수? avg()
-- 여자의 포인트 평균은?
select avg(point) 여자포인트평균 from test1 where gender='여자';

-- 각 성별에 따른 포인트 평균을 구하시오?
select gender, avg(point) from test1 group by gender;

-- 최대값을 구하시오? max()
-- 각 성별의 최고령자를 구하시오?
select max(age) from test1;

-- 최소값을 구하시오? min()
-- 각 성별의 최연소자를 구하시오?
select min(age) from test1;
-- select name,min(age) from test1;
select name, age from test1 order by age limit 0,1;

/* 수치함수 */
-- 반올림 : round() , round(소수이하자리수)
select round(123.456);
select round(56.789);
select round(123.456, 1);  -- 소수이하 2번째자리에서 반올림하여 첫째자리까지 구한다.
select round(123.456, -1); -- 정부수 첫째자리에서 반올림한다.

-- 절삭시키는 함수 : truncate()
select truncate(123.456,0);
select truncate(456.789,0);
select truncate(123.456,1);
select truncate(123.456,-1);

-- 무조건 올림 : ceil(), 무조건 내림 : floor()
select ceil(123.456);
select ceil(456.789);
select ceil(-123.456);
select ceil(-456.789);

select floor(123.456);
select floor(456.789);
select floor(-123.456);
select floor(-456.789);

-- 나이의 평균을 구하되 소수이하는 버리시오.
select avg(age) from test1;
select floor(avg(age)) from test1;

-- 절대값(양수값으로 표현) : abs()
select abs(1234);
select abs(-1234);
select (123-456);
select abs(123-456);

select name, abs(age-1) from test1;

-- 나머지 함수 :  mod(정수1, 정수2)
select mod(10, 3);
-- 10 / 3 의 몫은?
select floor(10/3);

select floor(10/3), mod(10,3);

-- 지수(승수)함수 : power(n1, n2) - 밑수가 n1, 지수가 n2
-- 2^5 = ?
select power(2,5) as '2^5';


/* 문자함수 */
-- 영문 대/소문자로 표시? upper(), lower()
select upper('sEoUl');
select lower('sEoUl');
select upper('WelCome To Korea!!!');
select lower('WelCome To Korea!!!');

-- 문자열의 길이를 구하시오? length()
select length('seoul');
select idx,name,length(name) from test1;
select length('seo울');

-- 문자의 결합함수 : concat(문자열1, 문자열2, 문자열2...)
select concat('a','b','c');
select concat('성명 : ', name) from test1;

-- 지정된 문자열 반환 : substr(char, pos, len)
-- char문자중 pos번째 문자부터 len길이만큼 잘라서 반환한다.
select substr('Welcome to Korea', 3, 7);  -- 결과 : lcome t
select substr('961020-1234567', 8, 1);
select name,substr(birth, 1, 4) from test1;
select name, birth from test1;   -- 년도 출력
-- 0        1         2
-- 12345678901234567890
-- 2020-07-30 20:15:09
select name, substr(birth, 6, 2) from test1;  -- '월'을 출력
select name, substr(birth, 9, 2) from test1;  -- '일'을 출력
select name, substr(birth, 15, 2) from test1;  -- '분'을 출력

-- test1테이블의 name필드중 '성'과 '이름'을 분리시켜 출력하시오?('성'은 첫번째 글자로 처리)
select name from test1;
select substr(name,1,1), substr(name,2) from test1;
select concat("성 : ",substr(name,1,1), ",  이름 : ", substr(name,2)) from test1;

-- 중간위치의 값을 출력 ? mid  , mid(문자열, 시작위치, 추출크기)
-- 이름중에서 2번째 글자를 출력?
select name, mid(name, 2, 1) from test1;

-- instr함수 : 문자열중 특정 문자가 존재하는가?
select instr('Welcome to Korea', ' ');

-- 'Welcome to Korea'의 입력내용중 첫번째 문장(단어)만을 출력?
select substr('Welcome to Korea',1,instr('Welcome to Korea',' ')-1);

-- left(), right(), mid()
select left('Welcome to Korea', 5);  -- 왼쪽부터 5개의 문자를 추출

select right('Welcome to Korea', 5);  -- 오른쪽부터 5개의 문자을 추출

-- substring() - substr()과 같은 의미
select substring('Welcome to Korea',1,5); -- 첫번째부터 5번째 문자 추출
select substring('Welcome to Korea',-5);  -- 뒤에서 5개의 문자열 추출
select substring('Welcome to Korea',-5, 3); -- 뒤쪽 5번째부터 3개 추출

-- 문자열의 치환 : replace(str, char1, char2) : 문자열(str)중에서 특정문자(char1)를
--       지정문자(char2)로 치환한다.
-- 문자열에 공백이 발생시에 '_'글자로 대신한다?
select replace('Welcome to Korea',' ','_');


-- 날짜 함수(날짜:now() , year(), month(), day())
select now();

select year(now());

select month(now());

select day(now());

select year(now()), month(now()), day(now());
select concat(year(now()),'년',month(now()),'월',day(now()),'일');
select concat(name," 생일은? ", year(birth),'년 ',month(birth),'월 ',day(birth),'일') from test1;

-- 시(hour()) / 분(minute()) / 초(second())
select hour(now());
select minute(now());
select second(now());

select concat(hour(now()),'시 ',minute(now()),'분 ',second(now()),'초');

-- 요일(dayname() / (week())
select dayname(now()); -- 현재 요일을 영어로 출력한다.
select week(now()); -- 현재가 올해 몇번째 주인가?

-- 월을 문자열로 반환(monthname())
select monthname(now());

-- 날짜 형식을 지정한 출력 : date_format(날짜, format)
-- %기호
/* 형식기호:
  y : 년도2자리  , Y : 년도 4자리
  m : 월을 숫자로 , M : 월을 문자로
  d : 날짜형식
  W : 영문 요일   , a : 짧은 영문이름
  H : 시(24시간) , l : 시(12시간제)
  i : 분        , s : 초
*/
select date_format(now(),'%Y-%m-%d');  -- yyyymmdd형식
select date_format(now(),'%y-%m-%d');
select date_format(now(),'%y-%M-%d');
select date_format(now(),'%Y-%M-%d');
select date_format(now(),'%y-%m-%d');
select date_format(now(),'%y-%m-%d');
select date_format(now(),'%y-%m-%d %W');
select date_format(birth,'%y-%m-%d %W') from test1 where name='홍길동';
select date_format(now(),'%y-%m-%d %a');
select date_format(birth,'%y-%m-%d %a') from test1 where name='홍길동';
select date_format(now(),'%H:%i:%s');
select date_format(now(),'%l:%i:%s');
select date_format(now(),'%r');
select date_format(now(),'%Y-%m-%d');  -- yyyymmdd
select date_format(now(),'%Y-%c-%e');  -- yyyymd
select date_format(birth,'%Y-%c-%e') from test1;

-- 현재 날짜? now() / sysdate() / current_timestamp()
select now();
select sysdate();
select current_timestamp();

-- 날짜 연산(date_add(기존날짜, 계산수치값)) - interval명령어와 함께사용
-- intervar뒤의 옵션? year, month, day, hour, minute, second
select now();
select date_add(now(), interval 1 day);
select date_add(now(), interval -1 day);
select date_add(now(), interval -1 hour);
select date_add(now(), interval 24 hour);
select date_add(now(), interval -10 second);

-- 달의 마지막 일자? last_day()
select last_day(now());
select last_day('2020-2-1');
select last_day(birth) from test1 where name='홍길동';

-- select now() + 1;
-- 날짜 차이 계산하기(to_days())
select to_days(now()) - to_days('2020-7-3');
select to_days(now()) - to_days(date_add(now(), interval -5 day));

-- 날짜 차이 계산(날짜비교) : datediff()
select datediff(now(),'2020-8-1');
select datediff(now(),date_add(now(), interval -5 day));

-- 날짜 차이 계산(단위를 부여) : timestampdiff
-- year/month/day/week(주)/hour/minute/second/quarter(분기)
select timestampdiff(month, '2020-1-1', now());
select timestampdiff(quarter, '2020-1-1', now());

-- 천단위마다 쉼표표시 : format(필드명, 소수이하 자리수)
select format(1234567, 0);
select format(1234567.1234, 2);

