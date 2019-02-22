package com.service.in;

import com.dao.in.DaoInterfaceImpl;

public class ServiceClassImpl implements ServiceInterface {

	@Override
	public int AddingTable() {
		// TODO Auto-generated method stub
		DaoInterfaceImpl daoInterfaceImpl=new DaoInterfaceImpl();
		return daoInterfaceImpl.AddingTable();
	//	return 0;
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
