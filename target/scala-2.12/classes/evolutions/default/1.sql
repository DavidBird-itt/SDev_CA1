# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

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
  f_name                        varchar(255),
  l_name                        varchar(255),
  salary                        double not null,
  password                      varchar(255),
  constraint pk_employees primary key (id)
);

create table project (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  start_date                    varchar(255),
  num_members                   integer not null,
  constraint pk_project primary key (id)
);


# --- !Downs

drop table if exists address;

drop table if exists department;

drop table if exists employees;

drop table if exists project;

