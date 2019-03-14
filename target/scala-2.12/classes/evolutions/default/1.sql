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
  type                          varchar(255),
  id                            varchar(255) not null,
  f_name                        varchar(255),
  l_name                        varchar(255),
  salary                        double not null,
  password                      varchar(255),
  constraint pk_employees primary key (id)
);

create table project (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  start_date                    date,
  due_date                      date,
  num_members                   integer not null,
  constraint pk_project primary key (id)
);

create table project_employees (
  project_id                    bigint not null,
  employees_id                  varchar(255) not null,
  constraint pk_project_employees primary key (project_id,employees_id)
);

alter table project_employees add constraint fk_project_employees_project foreign key (project_id) references project (id) on delete restrict on update restrict;
create index ix_project_employees_project on project_employees (project_id);

alter table project_employees add constraint fk_project_employees_employees foreign key (employees_id) references employees (id) on delete restrict on update restrict;
create index ix_project_employees_employees on project_employees (employees_id);


# --- !Downs

alter table project_employees drop constraint if exists fk_project_employees_project;
drop index if exists ix_project_employees_project;

alter table project_employees drop constraint if exists fk_project_employees_employees;
drop index if exists ix_project_employees_employees;

drop table if exists address;

drop table if exists department;

drop table if exists employees;

drop table if exists project;

drop table if exists project_employees;

