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

//Write a SQL query to creat e an empty table with same structure as some other table.//;
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

select * from temp order by 1 asc;
select * into sele from temp;

//To fetch ALTERNATE records from a table. (EVEN NUMBERED)//;
select * from temp where id in (select decode(mod(rownum,2),0,id, null) from temp);

//To fetch ALTERNATE records from a table. (ODD NUMBERED)//;
select * from temp where id in (select decode(mod(rownum,2),0,null,id) from temp);

//find third max salary in the table//;
select * from temp;
select min(salary) from (select * from (select distinct(salary) from temp order by
salary desc)where rownum<4);

//find the third min salary from the table//;
select max(salary) from (select * from (select distinct(salary) from temp order by
salary asc)where rownum<4);

//select n records from the table //;
select * from temp where rownum<4;

//select last n records from the table //;
select * from temp where id not in (select id from temp  where rownum<2)order
by 1 desc;
select * from temp;
select count(*) from temp;

select * from temp 
minus 
select * from temp where rownum<=(select count(*)-&n from temp);
select * from temp where rownum<=2;

select * from temp where id not in (select id from temp where 
rownum<=(select count(*)-&n from temp));

//get three max salaries from the table //;
select salary from (select salary from(select * from temp order by salary desc)
where rownum<=3);
select * from temp order by salary desc;

//get three  min salary  from the table//;
select salary,name from(select * from (select * from temp order by salary asc)
where rownum<=3);

//how to get nth max salary from the table //;
select * from temp;
select min(salary) from (select * from (select * from temp order by salary desc)where 
rownum<=3);

//select distinct records from the table //;
select * from temp order by 1 desc;
alter table temp drop column strt_date;
delete from temp a where id !=(select min(id) from temp b where a.salary=b.salary);


//How can I create an empty table emp1 with same structure as emp?//;
select * from temp;
select * from emp4;
create table emp4 as select * from temp ;

select * from temp where salary>=3000;
select * from temp  where salary> all(select salary from temp where salary<3000);

//     joining tables //

create table joining
                   ( 
		     id int not null,
		     name varchar2(90) not null,
		     salary int not null,
		     city varchar2(90) not null
		     );
insert into joining values(1,'aa',1000,'mumbai');
insert into joining values(2,'bb',3000,'pune');
insert into joining values(3,'cc',2000,'goa');
insert into joining values(4,'dd',4000,'nashik');
select * from joining;
drop table joining;


create table joined
                   ( 
		     id int not null,
		     college varchar2(90) not null,
		     salary int not null
		     );
insert into joined values(1,'aa',1000);
insert into joined values(2,'bb',3000);
insert into joined values(3,'cc',2000);
insert into joined values(4,'dd',4000);

select * from joining;
select * from joined;
update joining set name='kj' where id=1;

select p.id,q.id,p.name,q.college from joining p inner join joined q on p.name=q.college;

select p.id,p.name,p.salary,q.college from joined q,joining p where p.id=q.id;

select * from joining left join joined on joining.name=joined.college;
select * from joining right join joined on joining.name=joined.college;

select * from joining left outer join joined on joining.id=joined.id;
select * from joining right outer join joined on joining.id=joined.id order by joining.id asc;
commit;

select * from joining full outer join joined on joining.id=joined.id;
select * from joining ,joined;
select * from joining cross join joined;

select * from joining;
update  joining set sel=2 where id=4;
alter table joining add sel int;


select p.id ,count(p.id) from joining p,joining q where p.id=q.sel group by p.id;

select * from joining where  exists ( 
                                     select * from joined where 
                                      joining.id=joined.id)
                                      order by joining.id;




create table employee
                     (
		       employee_id int primary key not null,
		       first_name varchar(90) not null,
		       last_name varchar2(90) not null,
		       salary int not null,
		       joining_date date,
		       departement varchar2(90) not null
                                       );
select * from employee;

insert into employee values (2,'michael','clark',800000,sysdate,'insurance');
insert into employee values (3,'roy','thomas',700000,sysdate,'banking');
insert into employee values (4,'tom','jose',600000,sysdate,'insurance');
insert into employee values (5,'jerry','pinto',650000,sysdate,'insurance');
insert into employee values (6,'philip','mathew',750000,sysdate,'service');
insert into employee values (7,'testname1','123',650000,sysdate,'service');
insert into employee values (8,'testname2','lname%',600000,sysdate,'insurance');






create table incentives (
              employee_ref_id int not null primary key,
			  incentive_date timestamp not null,
			  incentive_amount int not null
                          );
insert into incentives values(1,'01-feb-13',5000);
insert into incentives values(2,'01-feb-13',3000);
insert into incentives values(3,'01-feb-13',4000);
insert into incentives values(1,'01-jan-13',4500);
insert into incentives values(2,'01-jan-13',3500);

select * from incentives ;
                                                  
truncate table incentives;                          
insert into incentives values(1,'01-feb-13',5000);
alter table incentives drop constraint SYS_C0011703;


select * from user_constraints ;
select distinct constraint_type from user_constraints where table_name='incentive';

select * from user_cons_columns where table_name='incentive';
select * from employee;

select first_name,length(first_name) from employee;
select first_name ,replace(first_name,'o','$') from employee;

select  first_name||'_'||last_name from employee;
select first_name,to_char(joining_date,'YYYY'),to_char(joining_date,'Mon'),to_char(joining_date,'dd') from employee;

select min(salary) from(select salary from(select salary from employee order by salary desc) where rownum<=4);
select salary from employee order by salary desc;

select * from employee;
select * from employee where to_char(joining_date,'YYYY')='2018';

select departement,sum(salary) from  employee group by departement order by sum(salary)desc;
select * from employee;

select departement,count(first_name),sum(salary),avg(salary)from employee group by departement order by sum(salary) desc;

select departement,avg(salary) from employee group by departement order by avg(salary) desc;
select departement,min(salary) from employee group by departement order by min(salary) desc;

select to_char(joining_date,'YYYY') ,to_char(joining_date,'MM'),count(*) from employee
group by to_char(joining_date,'YYYY'),to_char(joining_date,'MM');
select * from employee;

select * from employee;
select * from incentives;
insert into employee values(9,'mike','jimmy',100023,sysdate,'banking');
delete from employee where employee_id=9;
select * from employee where  exists( select * from incentives);

select employee_id from employee
minus 
select employee_ref_id from incentives;

select * from employee;
select * from incentives;

select first_name,incentive_amount from employee a inner join incentives b on 
a.employee_id=b.employee_ref_id;

select first_name,incentive_amount from employee a inner join incentives b on 
a.employee_id=b.employee_ref_id and incentive_amount>3000;

select first_name,incentive_amount from employee a left join incentives b on 
a.employee_id=b.employee_ref_id ; 

select first_name ,nvl(incentive_amount,0) from employee a left join incentives b
on a.employee_id=b.employee_ref_id;



select DEPARTeMENT,(select nvl(max(INCENTIVE_AMOUNT),0) from INCENTIVES where EMPLOYEE_REF_ID=EMPLOYEE_ID) Max_incentive from EMPLOYEE;


select DEPARTeMENT,(select nvl(max(INCENTIVE_AMOUNT),0)
from INCENTIVES where EMPLOYEE_REF_ID=EMPLOYEE_ID) Max_incentive from EMPLOYEE;

select * from employee;
alter table employee rename departement to department;


select * from employee;
alter table employee add mg_id int ;
update employee set mg_id=3 where employee_id=8;

select a.first_name,a.last_name,a.employee_id from employee a,employee b where a.employee_id=b.mg_id;
select a.first_name,count(*) from employee a,employee b where a.employee_id=b.mg_id and group by a.employee_id;

create table employeedetails1
                             ( 
                               empid int not null primary key,
                               fullname varchar2(90) not null,
                               managerid varchar2(90) not null,
                               dateofjoining date
                               );
select * from employeedetails;
insert into employeedetails values(521,'mike',321,sysdate);
select * from employeesalary;
insert into employeesalary values(421,'p1',12000);

select project,count(*) from employeesalary  group by project ;
select project,count(*) from employeesalary group by project ;

SELECT E.Name, S.Salary  
FROM EmployeeDetails E LEFT JOIN EmployeeSalary S
ON E.EmpId = S.EmpId;

select  distinct a.name,a.empid from employeedetails a inner join employeedetails b on a.empid=b.managerid ;
select * from employeedetails;
insert into employeedetails values(521,'mike',321,sysdate);
select * from employeesalary;
select * from employeedetails a where exists (select * from employeesalary b where a.empid=b.empid);

select empid,name,managerid ,count(*) from employeedetails group by empid,name,managerid having count(*)>1;
select * from employeedetails;

delete from employeedetails where empid in( select empid from employeedetails group by empid,name having count(*)>1);


select * from employees;

CREATE TABLE Employees1(emp_id INTEGER PRIMARY KEY, dept_id INTEGER, mngr_id INTEGER, emp_name VARCHAR(20), salary INTEGER);
select * from employees1;

CREATE TABLE Department(dept_id INTEGER PRIMARY KEY, dept_name VARCHAR(20)); 
select * from department; 
INSERT INTO Department VALUES (1, 'Finance');
INSERT INTO Department VALUES (2, 'Legal');
INSERT INTO Department VALUES (3, 'IT');
INSERT INTO Department VALUES (4, 'Admin');
INSERT INTO Department VALUES(5, 'Empty Department');

select * from department;

INSERT INTO Employees1(emp_id, dept_id, mngr_id, emp_name, salary)  VALUES( 1, 1, 1, 'CEO', 100);
INSERT INTO Employees1(emp_id, dept_id, mngr_id, emp_name, salary) VALUES ( 2, 3, 1, 'CTO', 95);
INSERT INTO Employees1(emp_id, dept_id, mngr_id, emp_name, salary) VALUES ( 3, 2, 1, 'CFO', 100);
INSERT INTO Employees1(emp_id, dept_id, mngr_id, emp_name, salary) VALUES ( 4, 3, 2, 'Java Developer', 90);
INSERT INTO Employees1(emp_id, dept_id, mngr_id, emp_name, salary) VALUES ( 5, 3, 2, 'DBA', 90);
INSERT INTO Employees1(emp_id, dept_id, mngr_id, emp_name, salary) VALUES ( 6, 4, 1, 'Adm 1', 20);
INSERT INTO Employees1(emp_id, dept_id, mngr_id, emp_name, salary) VALUES ( 7, 4, 1, 'Adm 2', 110);
INSERT INTO Employees1(emp_id, dept_id, mngr_id, emp_name, salary) VALUES ( 8, 3, 2, 'Web Developer', 50);
INSERT INTO Employees1(emp_id, dept_id, mngr_id, emp_name, salary) VALUES ( 9, 3, 1, 'Middleware', 60);
INSERT INTO Employees1(emp_id, dept_id, mngr_id, emp_name, salary) VALUES ( 10, 2, 3, 'Legal 1', 110);
INSERT INTO Employees1(emp_id, dept_id, mngr_id, emp_name, salary) VALUES ( 11, 3, 3, 'Network', 80);
INSERT INTO Employees1(emp_id, dept_id, mngr_id, emp_name, salary) VALUES ( 12, 3, 1, 'UNIX', 200);

select a.emp_name from employees1 a inner join employees1 b on a.mngr_id=b.emp_id where a.salary>b.salary;



ALTER TABLE Employees1 ADD FOREIGN KEY (mngr_id) REFERENCES Employees1(emp_id); 
ALTER TABLE Employees1 ADD FOREIGN KEY (dept_id) REFERENCES Department(dept_id); 


SELECT a.emp_name, a.dept_id FROM Employees1 a;


select * from employees1;
select * from department;

SELECT a.dept_id, MAX(salary) as max_salary FROM Employees1 a JOIN Department b ON a.dept_id = b.dept_id GROUP BY a.dept_id;

SELECT a.emp_name, a.dept_id FROM Employees1 a JOIN (SELECT a.dept_id, MAX(salary) as max_salary FROM Employees1 a JOIN Department b ON a.dept_id = b.dept_id  GROUP BY a.dept_id) b
ON a.salary = b.max_salary AND a.dept_id = b.dept_id; 

SELECT a.emp_name, a.dept_id FROM Employees1 a JOIN (SELECT a.dept_id, MAX(salary) as max_salary FROM Employees1 a GROUP BY a.dept_id) b
ON a.salary = b.max_salary AND a.dept_id = b.dept_id; 

select a.dept_id,max(salary) from employees1 a group by a.dept_id; 

select a.emp_name,a.dept_id from employees1 a join (select a.dept_id,max(salary) as max
from employees1 a    join department b on a.dept_id=b.dept_id group by a.dept_id)b
on a.salary =b.max and a.dept_id=b.dept_id;


SELECT a.emp_name, a.dept_id FROM Employees1 a JOIN (SELECT a.dept_id, MAX(salary) as max_salary FROM Employees1 a JOIN Department b ON a.dept_id = b.dept_id GROUP BY a.dept_id) b
ON a.salary = b.max_salary AND a.dept_id = b.dept_id;

select dept_id,count(*) from employees1 group by dept_id having count(*)>3;



select b.dept_name,b.dept_id  from employees1 (select  ;
select dept_id,count(*) from employees1 group by dept_id having count(*)<3 ;

SELECT b.dept_name, COUNT(a.dept_id) as 'Number of Employees1' FROM Employees1 a FULL 
OUTER JOIN Department b ON a.dept_id=b.dept_id GROUP BY b.dept_name;

select b.dept_name,count(a.dept_id) from employees1 a full outer join department
b on a.dept_id=b.dept_id group by b.dept_name;

select *  from employees1;
select * from department;


create table A (
                 A int not null,
		 M char
		 );


create table B (
                 A int not null,
		 N char
		 );

insert into A values(1,'m');
insert into A values(2,'n');
insert into A values(4,'o');


insert into B values(2,'p');
insert into B values(3,'q');
insert into B values(5,'r');

select * from A;
select * from B;

select * from A full outer join B on A.A=B.A;


select *  from employees1;
select * from department;

select a.emp_name from employees1 a inner join employees1 b on a.mngr_id=b.emp_id 
where a.dept_id !=b.dept_id;

select dept_id,sum(salary) from employees1 group by dept_id;


SELECT b.dept_name, SUM(a.salary)  FROM Employees1 a FULL OUTER 
JOIN Department b ON a.dept_id = b.dept_id GROUP BY b.dept_name order by sum(salary)desc;

select b.dept_name,sum(a.salary) from employees1 a full outer join department b
on a.dept_id=b.dept_id group by b.dept_name;

select * from A;

insert into P select * from A;
create table P as select * from A;
select * from P;

create table Q( id int,
                col char
                );
insert into Q select * from P;
select * from Q;

create table M( id int,
                cols char
                );
insert into M select Id,col from Q;                


select * from Q;
insert into Q(id) values(5);
select * from Q where col is null;
select * from Q where col is not null;

delete from Q;
select * from Q;
select min(id)   from Q;

select * from employees1 where emp_name like 'C%O';
select * from employees1 where emp_name like '%Dev%';
select * from employees1 where emp_name like '_ava_____loper';
select * from employees1 where emp_name like'_B_';
select * from employees1 where emp_name like '[A-B]%';
select * from employees1;

create table idd(id int);
insert into idd values(3);
select * from idd;
select * from employees1 where emp_id in (select id from idd);
select * from employees1 where  exists ( select * from idd where id not in(1,2));
select * from employees1 ;
insert into employees1 values(13,3,3,'CYQO',900);
select * from employees1 where (salary between 10 and 99) and not emp_id in(1,2,3); 
select * from employees1 where emp_name between 'CEO' and 'CTO';

select emp_id,dept_id+', '+salary+' '+emp_name+', '+salary as sal  from employees1;
select * from employees1;
select * from idd;
delete from idd;
insert into idd values(20);
select a.emp_id,a.salary,b.id from employees1 a full outer join idd  b on a.emp_id=b.id;  

create table idii as select * from idd where 1=0;
select * from idii;
insert into idii select * from idd;


select *  into xyz in 'MK.mdb' from idd; 



select * from employees1;
select * from employees1 where emp_id=txtemp_id;
SELECT * FROM employees1 WHERE emp_id= 00 OR 1=1;

select * from department;

select * from employees1 where emp_id= any(select id from idd where id=3);
select * from employees1 where emp_id =all (select id from idd where id=2);
select b.dept_id,b.dept_name,count(b.dept_name) from employees1 a left join department b on a.dept_id=b.dept_id group by b.dept_id,b.dept_name order by b.dept_id asc; 

select * from user_constraints where TABLE_NAME='SCHOOL';

create table tts( id int not null,
                  constraint PK_tts primary key (id));

create table tts3 (idd int not null) ;
                 constraint pk_tts2 primary key (idd)); 
alter table tts1 add constraint fk_idd foreign key(idd) references tts(id);                  
select * from tts;
insert into tts2 values(1);
create index idtts3 on tts3(idd);
select * from tts2;

create table cond(id int constraint Pk_cons primary key);
alter table cond add sal int ;
create table ttss as select * from tts2;
select * from ttss;
create table ttsst as select  * from tts2 where 1=2;
select * from ttsst ;
insert into ttsst select * from tts2;

create table alte( id int ,
                   sal int ,
                  constraint alte_id primary key(id)
                  );
ALTER TABLE ALTE DROP CONSTRAINT ALTE_ID;
ALTER TABLE ALTE ADD CONSTRAINT ALTE_ID PRIMARY KEY(ID,SAL);
SELECT  * FROM ALTE ;       
ALTER TABLE ALTE DISABLE CONSTRAINT ALTE_ID;
ALTER TABLE ALTE ENABLE CONSTRAINT ALTE_ID;
CREATE TABLE ALTE1 AS SELECT  * FROM ALTE WHERE 1=2;

CREATE TABLE ALTE2(ID INT  PRIMARY KEY);
ALTER TABLE ALTE2 ADD CONSTRAINT ALTE2_PKID PRIMARY KEY(ID);
ALTER TABLE ALTE ADD CONSTRAINT FK_ALTESAL FOREIGN KEY(SAL) REFERENCES ALTE2(ID);
ALTER TABLE ALTE2 DROP CONSTRAINT SYS_C0011904;

SELECT * FROM USER_CONSTRAINTS WHERE R_CONSTRAINT_NAME='ALTE2_PKID';
select * from USER_CONSTRAINTS WHERE TABLE_NAME='ALTE';  
select * from USER_CONSTRAINTS WHERE TABLE_NAME='ALTE2';  
SELECT * FROM USER_CONSTRAINTS WHERE CONSTRAINT_NAME='ALTE2_PKID';


SELECT cols.table_name, cols.column_name, cols.position, cons.status, cons.owner
FROM all_constraints cons, all_cons_columns cols
WHERE cols.table_name = 'ALTE'
AND cons.constraint_type = 'P'
AND cons.constraint_name = 'ALTE_ID'
AND cons.owner = cols.owner
ORDER BY cols.table_name, cols.position;

SELECT * FROM ALL_CONSTRAINTS;--HERE CONSTRAINT_NAME='ALTE_ID';
SELECT * FROM USER_CONSTRAINTS;
SELECT * FROM ALL_CONS_COLUMNS;
SELECT * FROM ALL_CONS_COLUMNS WHERE CONSTRAINT_NAME='ALTE_ID';
SELECT * FROM ALL_CONS_COLUMNS WHERE TABLE_NAME='ALTE';
SELECT *  FROM USER_CONSTRAINTS WHERE TABLE_NAME='ALTE';
SELECT * FROM ALL_CONS_COLUMNS WHERE TABLE_NAME='ALTE';
SELECT * FROM ALL_CONSTRAINTS WHERE TABLE_NAME='ALTE';
SELECT * FROM ALL_CONS_COLUMNS WHERE CONSTRAINT_NAME='ALTE2_PKID';
SELECT * FROM USER_CONSTRAINTS WHERE CONSTRAINT_NAME='ALTE2_PKID';

SELECT * FROM ALL_CONS_COLUMNS WHERE TABLE_NAME='ALTE';
SELECT * FROM ALL_CONSTRAINTS WHERE TABLE_NAME='ALTE';
SELECT * FROM ALL_CONS_COLUMNS WHERE CONSTRAINT_NAME='ALTE2_PKID';


SELECT SUBSTR('123456789',INSTR('ABCABCA','A',2,2),4) FROM DUAL;
SELECT INSTR('ABCABCA','A',2,2) FROM DUAL;
SELECT INSTR('ABCABCABDD','A',3,1) FROM DUAL;
        
CREATE TABLE DUP(ID INT NOT NULL,
                 NAME VARCHAR2(90)
                 );
SELECT * FROM DUP;
INSERT INTO DUP VALUES(2,'WAKEEL');

SELECT NAME,COUNT(*) FROM DUP GROUP BY NAME;
DELETE FROM DUP A  WHERE ID NOT IN (SELECT max(ID) FROM DUP B WHERE A.ID=B.ID);

create table salary2( id int not null,
                      salary int not null
                      );
alter table  salary2 add constraint Pk_salary2 primary key(id);                     
select * from salary1;                      
insert into salary1 values(4,400);
alter table salary1 add name varchar(90) ;


select max(salary) from (select salary from (select salary from salary1 order by salary asc) where rownum<3);
select sysdate from dual;

              desc     salary1;
                  
select * from ALL_CONS_COLUMNS WHERE TABLE_NAME='SALARY1';  
SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME='SALARY1';

SELECT * FROM DUAL;

SELECT * FROM EMPLOYEE;
SELECT EMPLOYEE_ID,FIRST_NAME,LAST_NAME FROM EMPLOYEE WHERE EMPLOYEE_ID=(SELECT MAX(EMPLOYEE_ID) FROM EMPLOYEE);
SELECT TO_CHAR(TO_DATE('&NO','J')) FROM DUAL;

create table clus( id int not null,
                   sal int
                   );
INSERT INTO CLUS VALUES(10,13) ;                  
SELECT * FROM CLUS;


create table clus1( SAL int not null,
                   ID int
                   );
SELECT * FROM CLUS1;
INSERT INTO CLUS1 VALUES(1.2,5.4);




















    



































































