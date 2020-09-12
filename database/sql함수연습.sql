select * from test1;

-- 갯수를 구하는 함수. count()
select count(*) from test1;

-- 합계를 구하는 함수. sum()
-- 전체 레코드의 포인트 합계를 구하시오.
select sum(point) as 전체포인트합계 from test1;

-- 성별이 여자인 자료의 포인터 합계를 구하시오.
select sum(point) as 성별이여자인자료의포인트합계 from test1 where gender='여자';

-- 각 성별에 따른 포인트 합계를 구하시오.
select gender, sum(point) as 성별에따른포인트합계 from test1 group by gender;

-- 평균을 구하는 함수. avg()
-- 여자의 포인트 평균은?
select gender, avg(point) as 여자포인트평균 from test1 where gender='여자';

-- 각 성별에 따른 포인트 평균을 구하시오.
select gender, avg(point) as 성별에따른포인트평균 from test1 group by gender;

-- 최대값을 구하시오. max()
-- 각 성별에 따른 포인트 최대값을 구하시오.
select gender, max(point) as 성별에따른포인트최대값 from test1 group by gender;

-- 최소값을 구하시오. min()
-- 각 성별에 따른 포인트 최소값을 구하시오.
select gender, min(point) as 성별에따른포인트최소값 from test1 group by gender;

-- 각 성별의 최고령자를 구하시오.
select max(age) from test1;

-- 각 성별의 최연소자를 구하시오.
select min(age) from test1;
select name, age from test1 order by age limit 0,1;

-- 남자의 최연소자와 이름을 구하시오.
select name, min(age) from test1 where gender='남자';

/* 수치함수 */
-- 반올림함수 round() , round(소수이하자리수)
select round(123.456);
select round(56.789);
select round(123.456, 1); -- 소수이하 2번째자리에서 반올림하여 첫째자리까지 구한다.
select round(123.456, -1); -- 정수부 첫째자리에서 반올림한다.

-- 절삭함수 truncate()
select truncate(123.456,0);
select truncate(456.789,0);
select truncate(123.456,1);
select truncate(123.456,-1);

-- 무조건 올림함수 ceil(), 무조건 내림함수 floor()
select ceil(123.456); /*결과 : 124*/
select ceil(456.789); /*결과 : 457*/
select ceil(-123.456); /*결과 : -123*/
select ceil(-456.789); /*결과 : -456*/


select floor(123.456); /*결과 : 123*/
select floor(456.789); /*결과 : 456*/
select floor(-123.456); /*결과 : -124*/
select floor(-456.789); /*결과 : -457*/

-- 나이의 평균을 구하되 소수이하 올리시오.
select ceil(avg(age)) from test1;

-- 나이의 평균을 구하되 소수이하는 버리시오.
select floor(avg(age)) from test1;


-- 절대값(양수값으로 표현) 함수 abs()
select abs(1234);
select abs(-1234); /*결과 1234*/
select (123-456);
select abs(123-456); /*abs는 두개의 '차'. 결과값이 abs(-333) -> -(-333). 즉 결과는 333.*/

select name, abs(age-1) from test1;

-- 나머지 함수 : mod(정수1, 정수2)
select mod(10,3); /* 결과는 1.*/

/* 문자 함수*/
-- 영문 대문자로 표시해주세요. upper함수 사용.(<-> lower)
select upper('apple');
select upper('welcome to korea');

-- 영문 소문자로 표시해주세요.
select lower('COMPUTER');
select lower('WELCOME TO CHONGJU');

-- 문자열의 길이를 구하시오. length()
select length('seoul');
select idx, name, length(name) from test1; /*한글 한문자에 3바이트로 인식한다.*/
select length('seo울'); /*결과 : (영문은 한문자에 1바이트) 6. */

-- 문자의 결합함수 concat(문자열1, 문자열2, 문자열3,....)
select concat('a','b','c');
select concat('성명 : ', name) from test1;

-- 지정된 문자열 반환함수 substr(char, pos, len)
-- char문자중 position 번째 문자부터 length 길이만큼 잘라서 반환한다.
select substr('welcome to korea', 3,7); -- 문자길이는 공백도 포함한다. /*결과 : lcome t*/
select substr('951020-1234567', 8, 1); /*결과 : 1.*/
select substr(birth, 1, 4) from test1;
select name,substr(birth, 1, 6) from test1;
select name, birth from test1;
select name, substr(birth, 6, 2) from test1; -- '월'을 출력
select name, substr(birth, 9, 2) from test1; -- '일'을 출력
select name, substr(birth, 15, 2) from test1; -- '분'을 출력
select name, substr(birth, 18, 2) from test1; -- '초'를 출력
select name, substr(birth, 12) from test1; -- 성명과 출생시간을 출력하시오.

-- 포함시켜주는 함수. instr(str, chr) : 문자열(str)중에서 특정문자를 찾아 위치반환.
-- 아래 문자열중에서 o자의 위치는?
select instr('welcome to', 'o');

-- 왼쪽 공백문자 무시 함수. ltrim()
select ltrim('        welcom to');

-- 오른쪽 공백문자 무시 함수. rtrim()
select rtrim('welcom to                   ');
select concat('  welcome    ','     to     ','    korea    ');
select concat(rtrim('  welcome    '),'     to     ',ltrim('    korea    '));

-- 양쪽 공백문자 무시 함수. trim()
select concat(trim('  welcome    '),'     to     ',trim('    korea    '));
select concat(trim('  welcome    '),trim('     to     '),trim('    korea    '));




