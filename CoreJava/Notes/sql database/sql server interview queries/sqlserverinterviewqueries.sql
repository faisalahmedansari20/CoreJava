use MW;
create table temp
                 (
		  id int not null,
		  name varchar(90) not null,
		  salary int not null,
		  location varchar(90)
		  );
insert into temp values(1,'ahmed',2000,'mumnai');
insert into temp values(2,'wakeel',3000,'pune');
insert into temp values(3,'sami',4000,'nashik');
insert into temp values(4,'sami',3000,'goa');
select * from temp ;

//select first 3 characters of name from temp table//
select SUBstring(name,1,3) from temp;

// Get position of 'o' in name 'John' from employee table //
select CHARINDEX('e',name)from temp where name='wakeel';

// Get FIRST_NAME from employee table after removing white spaces from right side //
select rtrim(name) from temp;

// Get FIRST_NAME from employee table after removing white spaces from left side//
select LTRIM(FIRST_NAME) from employee

//Get length of FIRST_NAME from employee table //
select LEN(name) from temp; 

//Get First_Name from employee table after replacing 'o' with '$' ;
select replace(name,'a','$') from temp;

// Get First_Name and Last_Name as single column from employee table separated by a '_'//
select name+'_'+location from temp;



// Get employee details from employee table whose first name contains 'o'//;
select * from temp where name like '%m%';


// Get employee details from employee table whose first name ends with 'n' //;
select * from temp where name like '%d';



//Get employee details from employee table whose first name ends with 'd' and name contains 5 letters //;
select * from temp where name like '____d';

//select employee detail from the table whose salary between 1000 to 50000//;
select * from temp where salary between 1000 and 5500;	

select year(GETDATE());

use Mw;
select * from temp order by salary desc; 
select MIN(salary)from (select top 2* from temp order by salary desc)a;
select MIN(salary) from (select top 5* from temp order by salary desc)a;
update temp set name='sami' where salary=3000 ;

//create table example//

CREATE TABLE EMPLOYEE2(
EMPLOYEE_ID int NOT NULL,
FIRST_NAME varchar(50) NULL,
LAST_NAME varchar(50) NULL,
SALARY decimal(18, 0) NULL,
JOINING_DATE date default getdate(),
DEPARTMENT varchar(50) NULL);
select * from EMPLOYEE;
insert into employee2(EMPLOYEE_ID,FIRST_NAME,last_NAME,salary,department) values(1,'ahmed','wakeel',455,'it');

//drop statement //
create table drp( id int not null);
insert into drp values(1);
select * from drp;
delete drp;
drop table drp;
truncate table drp;

// interview Question //


create table employeedetails( 
                               empid int not null primary key,
			       name varchar2(90) not  null,
			       manageris int not null,
			       date_of_joining timestamp default sysdate
			       );
insert into employeedetails values(121,'john',321,sysdate);
insert into employeedetails values(321,'abc xyz',986,sysdate);
insert into employeedetails values(421,'kuldeep rana',876,sysdate);
select *  from employeedetails;

create table employeesalary
                          (
			   empid int not null,
			   project varchar2(90),
			   salary int 
			   );
insert into employeesalary values(121,'p1',8000);
insert into employeesalary values(321,'p2',1000);
insert into employeesalary values(421,'p1',12000);
select * from employeesalary;
select *  from employeedetails;

//Write a SQL query to fetch the count of employees working in project 'P1'.//;
select count(*) from employeesalary where project='p1';
select project ,count(project) from employeesalary group by project ;

//Write a SQL query to fetch employee names having salary greater than or equal to 5000 and less than or equal 10000.//;
select a.name  from employeedetails a where empid in(select empid from employeesalary b where salary>=5000 and salary<10000);

//Write a SQL query to fetch project wise of count of employees sorted by project's count in descending order.//;

SELECT Project, count(EmpId) EmpProjectCount 
FROM EmployeeSalary 
GROUP BY Project 
ORDER BY EmpProjectCount DESC;

select * from employeesalary;
select * from employeedetails;

//Write a query to fetch only the first name(string before space) from the FullName column of EmployeeDetails table.//;
select mid(name,0,locate(' ',name)) from employeedetails;

//Write a query to fetch employee names and salary records. Return employee details even if the salary record is not present for the employee.//;
select e.name,c.salary from employeedetails e left join employeesalary c on e.empid=c.empid;
select * from employeesalary;
select * from employeedetails;
insert into employeesalary values(4,'p3',11000);
alter table employeedetails rename column manageri to managerid;

//Write a SQL query to fetch all the Employees who are also managers from EmployeeDetails table.//;
select distinct e.name from employeedetails e inner join employeedetails m on e.empid=m.managerid;
select distinct e.name from employeedetails e  join employeedetails m on e.empid=m.managerid;
select distinct e.name from employeedetails e  join employeedetails m on e.empid=m.managerid;

//Write a SQL query to fetch all employee records from EmployeeDetails table who have a salary record in EmployeeSalary table.//;
select * from employeedetails where empid in( select empid from employeesalary);
select * from employeedetails e where exists(select empid from employeesalary s where e.empid=s.empid);

//Write a SQL query to fetch duplicate records from a table.//;
SELECT EmpId, Project, Salary, COUNT(*)
FROM EmployeeSalary
GROUP BY EmpId, Project, Salary
HAVING COUNT(*) > 1;


select * from employeesalary;
update employeesalary set project='p1',salary=8000 where empid=4;
update employeesalary set empid=121 where project='p1' and salary=8000 ;

select empid,project ,salary,count(*) from employeesalary group by empid,project,
salary having count(*)>1;

delete from employeesalary where empid in ( select empid from employeesalary
group by empid,project,salary having count(*)>1);

//Write a SQL query to create an empty table with same structure as some other table.//;
in sql server//;
select * into newtable from employeedetails where 1=0;

//Write a SQL query to create a new table with data and structure copied from another table.//;

select * into newtable from employeedetails; //sql server//;
create table newtable like employeedetails;    // in mysql//;

//Write a SQL query to fetch common records between two tables.//;
select * from employeedetails intersect 
select * from employeesalary;

//Write a SQL query to fetch records that are present in one table but not in another table.//;
select * from employeedetails
minus
select * from employee salary;


//Write a SQL query to find current date-time.//;
in mysql//;
select now();

in sql server//;
select getdate();

in oracle//;
select sysdate from dual;

select * from employeedetails;
//Write a SQL query to fetch all the Employees from EmployeeDetails table who joined in Year 2016.//;


use MW;
select * from temp;
select * into sel from temp;
select * from sel;
truncate table employee;
drop table employee;
use MW;

CREATE TABLE Employee(emp_id INTEGER PRIMARY KEY, dept_id INTEGER, 
mngr_id INTEGER, emp_name VARCHAR(20), salary INTEGER); 

CREATE TABLE Department(dept_id INTEGER PRIMARY KEY, dept_name VARCHAR(20)); 

INSERT INTO Department (dept_id, dept_name) VALUES (1, 'Finance'), (2, 'Legal'), (3, 'IT'), (4, 'Admin'), (5, 'Empty Department');


INSERT INTO Employee(emp_id, dept_id, mngr_id, emp_name, salary) VALUES( 1, 1, 1, 'CEO', 100), ( 2, 3, 1, 'CTO', 95), ( 3, 2, 1, 'CFO', 100), ( 4, 3, 2, 'Java Developer', 90), ( 5, 3, 2, 'DBA', 90), ( 6, 4, 1, 'Adm 1', 20), ( 7, 4, 1, 'Adm 2', 110), ( 8, 3, 2, 'Web Developer', 50), ( 9, 3, 1, 'Middleware', 60), ( 10, 2, 3, 'Legal 1', 110), ( 11, 3, 3, 'Network', 80), ( 12, 3, 1, 'UNIX', 200);

select * from employee;
select *  from department;

\\1. Can you write an SQL query to show Employee (names) who have a bigger salary than their manager?//;

SELECT a.emp_name FROM Employee a JOIN Employee b ON a.mngr_id=b.emp_id  WHERE a.salary > b.salary;

\\Write an SQL query to find Employees who have the biggest salary in their Department?

//employee name they didn't have manager//
SELECT A.EMP_NAME FROM EMPLOYEE A JOIN EMPLOYEE B ON A.MNGR_ID = B.EMP_ID WHERE A.DEPT_ID != B.DEPT_ID;

use MW;
select * from employee;
select top 3 emp_id,dept_id from employee;

select top 50 percent * from employee;

select MIN(emp_id) "id" from employee;
select * from employee where emp_name like '[ABP]%';
select * from employee where emp_name like '[A-B]%';
create table idd(id int);
insert into idd values(3);
select * from idd;
select * from employee ;
select * from employee where emp_id in (select id from idd);

select * from employee where exists (select id from idd where id not in(1,2));


select * into temppp from employee;
select * from temppp;
select * into tt from employee where 1=2;
select * from tt;

select * into xyy from idd;
select * from xyy;

create database MK;
select *  into xyz in 'MK.mdb' from xyy;

use MW;



select  * from mk1;

SELECT TABLE_NAME
FROM INFORMATION_SCHEMA.TABLES
WHERE TABLE_TYPE = 'BASE TABLE' AND TABLE_CATALOG='dbName'

USE MW;
SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES;
SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME='MK';



























