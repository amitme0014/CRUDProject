package com.dao.in;

public interface QueryMapper {
	
	public static final String CREATE_TABLE="create table employee(name varchar(25),employeeId int(2))";
	public static final String INSERT_DATA="insert into employee(name,employeeId)values('amit',5)";
    public static final String DELETE_DATA="delete from employee where employeeId=5";
    public static final String UPDATE_DATA="update employee set name='mayukh' where employeeId=9";

}
