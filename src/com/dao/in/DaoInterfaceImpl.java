package com.dao.in;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.dbConnection.util.DBConnectionUtil;

public class DaoInterfaceImpl implements DaoInterface{

	DBConnectionUtil dbConnUtil=new DBConnectionUtil();   
	Connection conn=dbConnUtil.getConnection();   //getting the connection from db util class and storing it in conn variable

	@Override
	public int AddingTable() {

		try {
			Statement st=conn.createStatement();    //Create a statement using conn variable which stores the connection object       
			st.executeUpdate(QueryMapper.CREATE_TABLE); //using execute update method from statement class  to pass the query
			//if(rowsAffected==1) {
			System.out.println("Table Created Successfully");
		//t.close();  //closing the statement after usage
			//}
			//else {
			//System.out.println("Due to some reason table was not created");
			//}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("1:Exception thrown while create statement");
		}
		finally {

		}

		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int DataIntoTable() {


		try {
			Statement st=conn.createStatement();
			int rowsAffected=st.executeUpdate(QueryMapper.INSERT_DATA);
			if(rowsAffected==1) {
				System.out.println("2:Data Inserted success");
	//st.close();  //closing the statement after usage
			}
			else {
				System.out.println("Due to some reason data was not inserted");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("SQL Eception thrown");
		}

		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int UpdateDataInTable() {
		// TODO Auto-generated method stub
		DBConnectionUtil dbConnectionUtil=new DBConnectionUtil();
		Connection conn=dbConnectionUtil.getConnection();
		try {
			Statement st=conn.createStatement();
			int affectedRows=st.executeUpdate(QueryMapper.UPDATE_DATA);
			if(affectedRows==1) {
				System.out.println("Data updated successfully");
			}
			else {
				System.out.println("Not sure whether data updated successfully or not since affected rows is not equal to 1");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Some exception happened while updating data into table");
		}
		return 0;
	}

	@Override
	public int DelteData() {
		DBConnectionUtil dbConnectionUtil=new DBConnectionUtil();
		Connection conn=dbConnectionUtil.getConnection();
		try {
			Statement st=conn.createStatement();
		    st.executeUpdate(QueryMapper.DELETE_DATA);
		    System.out.println("Data deleted successfully");
			
			/*
			 * if(rowsAffectd==1) { System.out.println("data deleted"); } else { System.out.
			 * println("for some reason data didm't get deleted since rowsAffected is not equal to 1"
			 * ); };
			 */
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("some error occured while deleting data, check dao layer");
		}
		
		// TODO Auto-generated method stub
		return 0;
	}

}
