
# --- !Ups

create table address (
  id                            bigint auto_increment not null,
  street1                       varchar(255),
  street2                       varchar(255),
  town                          varchar(255),
  county                        varchar(255),
  eircode                       varchar(255),
  constraint pk_address primary key (id)
);

create table department (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_department primary key (id)
);


create table employees (
  id                            bigint auto_increment not null,
  type                          varchar(255),
  fName                        varchar(255),
  lName                        varchar(255),
  salary                        double not null,
  constraint pk_employees primary key (id)
);

create table project (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  start_date                    timestamp,
  num_members                   integer not null,
  constraint pk_project primary key (id)
);


# --- !Downs

drop table if exists address;

drop table if exists department;

drop table if exists employees;

drop table if exists project;

