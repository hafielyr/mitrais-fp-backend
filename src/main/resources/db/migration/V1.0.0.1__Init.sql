create table t_location(
	loc_id int not null auto_increment,
	loc_name varchar(30) not null,
	primary key(loc_id)
);
create table t_employee(
	emp_id bigint not null auto_increment,
	emp_fname varchar(30) not null,
	emp_lname varchar(30) not null,
	emp_gender varchar(10) not null,
	emp_dob date not null,
	emp_national varchar(50) not null,
	emp_martial varchar(30) not null,
	emp_phone varchar(30) not null,
	emp_sub_div varchar(30) not null,
	emp_status varchar(30) not null,
	emp_susp_date date,
	emp_hire_date date not null,
	emp_div varchar(30) not null,
	emp_email varchar(50) not null,
	emp_isactive boolean not null,
	emp_photo varchar(255),
	emp_location int not null,
	primary key (emp_id),
	foreign key (emp_location) references t_location(loc_id)
);