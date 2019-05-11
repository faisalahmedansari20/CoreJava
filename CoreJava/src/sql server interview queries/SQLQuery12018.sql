use MW;

create table employee( empid int primary key,
                      name varchar not null,
                      managerid int not null,
                      dateofjoining datetime2(7)
                      );
create table mk2(id int not null,
                 name varchar(90) 
);
insert into mk2 values(1,'mw');                      
select * from mk2;                      
select * from  employee;
insert into employee values(121,'sami',321,02/22/2018); 

select * from sys.objects;