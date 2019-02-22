package com.dao.in;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.dbConnection.util.DBConnectionUtil;

public class DaoInterfaceImpl implements DaoInterface{

	@Override
	public int AddingTable() {
		DBConnectionUtil dbConnUtil=new DBConnectionUtil();   
		Connection conn=dbConnUtil.getConnection();
		try {
			Statement st=conn.createStatement();                
			st.executeUpdate(QueryMapper.CREATE_TABLE);
			//if(rowsAffected==1) {
				System.out.println("Table Created Successfully");
			//}
			//else {
				//System.out.println("Due to some reason table was not created");
			//}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception thrown while create statement");
		}
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int DataIntoTable() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int UpdateDataInTable() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int DelteData() {
		// TODO Auto-generated method stub
		return 0;
	}

}
