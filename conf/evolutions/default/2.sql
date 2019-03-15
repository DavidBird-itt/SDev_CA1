# --- Sample dataset

# --- !Ups

delete from department;
delete from employees;
delete from address;


INSERT into employees (type,id,role,f_name,l_name,salary,password) values ( 'm',101,'manager', 'David', 'Bird', 25000.00, 'password');
INSERT into employees (type,id,role,f_name,l_name,salary,password) values ( 'w',102,'worker', 'Karl', 'Blair', 12500.00, 'password');

INSERT into address (eircode,street1,town,county) values ( 'W91X87', '125 Sommerville', 'Blessington', 'Wicklow');
INSERT into address (eircode,street1,town,county) values ( 'D12X44', '12 Hillstreet', 'Drimnagh', 'Dublin');

INSERT into department (id,name) values (1, 'Software');
INSERT into department (id,name) values (2, 'Database');
INSERT into department (id,name) values (3, 'Finance');
INSERT into department (id,name) values (4, 'Website Design');