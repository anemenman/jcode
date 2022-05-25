---CHECK Constraint
create table vehicles
(
  id integer primary key,
  res_type text not null check (res_type in ('yes', 'no'))
);
