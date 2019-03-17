# --- Sample dataset

# --- !Ups

delete from department;
delete from employees;
delete from address;
delete from project;


INSERT into employees (type,id,email,role,f_name,l_name,salary,password) values ( 'm',1, 'manager@emp.com','Manager', 'David', 'Bird', 25000.00, 'password');
INSERT into employees (type,id,email,role,f_name,l_name,salary,password) values ( 'w',2, 'worker@emp.com', 'worker', 'Karl', 'Blair', 12500.00, 'password');

INSERT into address (id,street1,street2,town,county,eircode) values (1,'125 Sommerville','Chrisdale', 'Blessington', 'Wicklow','W91X87');
INSERT into address (id,street1,street2,town,county,eircode) values (2,'12 Hillstreet', 'Karlsdale','Drimnagh', 'Dublin','D12X44');

INSERT into department (id,name) values (1, 'Software');
INSERT into department (id,name) values (2, 'Database');
INSERT into department (id,name) values (3, 'Finance');
INSERT into department (id,name) values (4, 'Website Design');

INSERT into project (id,name,start_date,due_date,num_members) values ( 1, 'Project1', '2001-01-20', '2008-06-19', 4);
INSERT into project (id,name,start_date,due_date,num_members) values ( 2, 'Project2', '2002-02-20', '2016-01-20', 2);
