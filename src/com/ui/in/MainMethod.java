package com.ui.in;

import com.service.in.ServiceClassImpl;
//import com.service.in.ServiceInterface;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ServiceClassImpl serviceClassImpl=new ServiceClassImpl();
        serviceClassImpl.AddingTable();
        serviceClassImpl.DataIntoTable();
        serviceClassImpl.DelteData();
        serviceClassImpl.UpdateDataInTable();
	}

}
