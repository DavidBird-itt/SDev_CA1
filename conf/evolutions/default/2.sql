# --- Sample dataset

# --- !Ups

delete from project;
delete from employees;
delete from address;

INSERT into project (id,name,start_date,num_members) values ( 1, 'Project1', '01-Jan-18', 4);
INSERT into project (id,name,start_date,num_members) values ( 2, 'Project2', '02-Feb-19', 2);

INSERT into employees (id,type,f_name,l_name,salary,password) values ( 101,'Manager', 'David', 'Bird', 25000.00, 'password');
INSERT into employees (id,type,f_name,l_name,salary,password) values ( 102,'Developer', 'Karl', 'Blair', 12500.00, 'password');

INSERT into address (eircode,street1,town,county) values ( 'W91X87', '125 Sommerville', 'Blessington', 'Wicklow');
INSERT into address (eircode,street1,town,county) values ( 'D12X44', '12 Hillstreet', 'Drimnagh', 'Dublin');
