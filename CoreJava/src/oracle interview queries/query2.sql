create table temp1
                 (
		  id int not null,
		  name varchar2(90) not null,
		  salary int not null,
          satrt_date date,
		  location varchar2(90)
		  );
insert into temp1 values(1,'ahmed',2000,sysdate,'mumnai');
select * from temp1;
select name ,to_char(start_date,'YYYY') joinyear ,to_char(start_date,'MM') ,to_char(start_date,'dd')from temp1;

create table temp
                 (
		  id int not null,
		  name varchar2(90) not null,
		  salary int not null,
		  location varchar2(90)
		  );
insert into temp values(1,'ahmed',2000,'mumnai');
insert into temp values(2,'wakeel',3000,'pune');
insert into temp values(3,'sami',4000,'nashik');
insert into temp values(4,'sami',3000,'goa');

select * from temp;

//select name from temp table in upper case//
select upper(name),upper(location) from temp;

//select name from temp table in lower case//
select lower(name),lower(location) from temp;

//select distince name from temp table//
select distinct upper(name) from temp ;

//select first 3 characters of name from temp table//
select substr(name,0,3) from temp;
select substr(name,1,3) from temp;
select * from temp;

// Get position of 'o' in name 'John' from employee table
select instr(name,'e') from temp where name='ahmed';

// Get FIRST_NAME from employee table after removing white spaces from right side //
select rtrim(name) from temp;

// Get FIRST_NAME from employee table after removing white spaces from left side//
select LTRIM(FIRST_NAME) from employee

// Get length of FIRST_NAME from employee table//;
select length(name) from temp;

//Get First_Name from employee table after replacing 'o' with '$' ;
select replace(name,'a','$') from temp;


//Get First_Name and Last_Name as single column from employee table separated by a '_'//;
select name ||'_'||location from temp;

// Get employee details from employee table whose first name contains 'o'//;
select * from temp where name like '%i%';
select * from temp;

// Get employee details from employee table whose first name ends with 'n' //;
select * from temp where name like '%d';

//Get employee details from employee table whose first name ends with d' and name contains 5 letters //;
select * from temp where name like '____d';
select *  from temp ;

//select employee detail from the table whose salary between 1000 to 50000//;
select * from temp where salary between 1000 and 5500;

// select * from table where employee name is ahmed or sami//;
select distinct* from temp where name in('ahmed','sami');

alter table temp add strt_date date;
select * from temp order by 1 asc;
update temp set strt_date=to_date(sysdate) where id=3;
update temp set strt_date=to_date('01-oct-2017','dd-MM-YYYY') where id=2;
insert into temp values(5,'mak',4000,'hydrabaad',sysdate);
insert into temp values(6,'mak',4000,'hydrabaad',to_date('01-oct-2017','dd-MM-YYYY'));
delete from temp where name='mak';

//Get employee details from employee table whose joining year is “2013”//;
select * from temp where to_char(strt_date,'MM')=12;

//Get employee details from employee table whose joining month is “January”//;
select * from temp where to_char(strt_date,'MM')=12;  or
select * from temp where to_char(strt_date,'MON')=upper('dec');

//Get employee details from employee table who joined before January 1st 2013//;
select  * from temp where strt_date<to_date('01-jan-2018','dd/mm/yyyy');
select * from temp ;

 //Get employee details from employee table who joined after January 31st//;
select * from temp where strt_date >to_date('31-jan-2017','dd-mm-yyyy');

//Get Joining Date and Time from employee table//;
select to_char(strt_date,'dd-mm-yyyy hh:mm:ss') from temp;

select sysdate from dual;

//Get names of employees from employee table who has '%' in Last_Name. Tip : Escape character for special characters in a query.//;
select * from temp;
update temp set name='mak%' where id=1;

//Get Last Name from employee table after replacing special character with white space//;
select translate(name,'%',' ') from temp;






























































