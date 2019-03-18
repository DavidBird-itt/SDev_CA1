#-- - Sample dataset

#-- - !Ups



INSERT into employees(type, id, email, role, f_name, l_name, salary, password) values('m', 1, 'manager@emp.com', 'Manager', 'David', 'Bird', 62000.00, 'password');
INSERT into employees(type, id, email, role, f_name, l_name, salary, password) values('m', 2, 'manager2@emp.com', 'Manager', 'John', 'Murphy', 62000.00, 'password');
INSERT into employees(type, id, email, role, f_name, l_name, salary, password) values('m', 3, 'manager3@emp.com', 'Manager', 'Carly', 'Gray', 62000.00, 'password');




INSERT into employees(type, id, email, role, f_name, l_name, salary, password) values('w', 4, 'worker@emp.com', 'worker', 'Karl', 'Blair', 32500.00, 'password');
INSERT into employees(type, id, email, role, f_name, l_name, salary, password) values('w', 5, 'worker1@emp.com', 'worker', 'Chris', 'Evans', 32500.00, 'password');
INSERT into employees(type, id, email, role, f_name, l_name, salary, password) values('w', 6, 'worker2@emp.com', 'worker', 'Ciara', 'Dunn', 32500.00, 'password');
INSERT into employees(type, id, email, role, f_name, l_name, salary, password) values('w', 7, 'worker3@emp.com', 'worker', 'Mark', 'Zuckerberg', 32500.00, 'password');
INSERT into employees(type, id, email, role, f_name, l_name, salary, password) values('w', 8, 'worker4@emp.com', 'worker', 'Sean', 'Blair', 32500.00, 'password');
INSERT into employees(type, id, email, role, f_name, l_name, salary, password) values('w', 9, 'worker5@emp.com', 'worker', 'Dermot', 'Bannon', 32500.00, 'password');
INSERT into employees(type, id, email, role, f_name, l_name, salary, password) values('w', 10, 'worker6@emp.com', 'worker', 'Will', 'Smith', 32500.00, 'password');
INSERT into employees(type, id, email, role, f_name, l_name, salary, password) values('w', 11, 'worker7@emp.com', 'worker', 'Denise', 'Brennan', 32500.00, 'password');
INSERT into employees(type, id, email, role, f_name, l_name, salary, password) values('w', 12, 'worker8@emp.com', 'worker', 'Amy', 'Schumer', 32500.00, 'password');

INSERT into address(id, street1, street2, town, county, eircode) values(1, '125 Sommerville', 'Chrisdale', 'Blessington', 'Wicklow', 'W91X87');
INSERT into address(id, street1, street2, town, county, eircode) values(2, '12 Hillstreet', 'Karlsdale', 'Drimnagh', 'Dublin', 'D12X44');

INSERT into department(id, name) values(1, 'Software');
INSERT into department(id, name) values(2, 'Database');
INSERT into department(id, name) values(3, 'Finance');
INSERT into department(id, name) values(4, 'Website Design');

INSERT into project(id, name, start_date, due_date, num_members) values(1, 'Project1', '2001-01-20', '2008-06-19', 4);
INSERT into project(id, name, start_date, due_date, num_members) values(2, 'Project2', '2002-02-20', '2016-01-20', 2);