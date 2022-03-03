package com.torryharris.dao;
import java.sql.Connection;

import com.torryharris.driver.DbHelper;
import com.torryharris.model.Dispatcher;

public class DispatcherDAO{

	public static int addDispatcher( Dispatcher d) throws Exception {
		int result=1;
		Connection con=DbHelper.getConnection();
		
		return result;
	
	}
	
	public static int modifyDispatcher(Dispatcher d) throws Exception {
		int result=1;
		Connection con=DbHelper.getConnection();
		
		return result;
		
	}
	
	public static int resignDispatcher(Dispatcher d) throws Exception {
		int result=1;
		Connection con=DbHelper.getConnection();
		
		return result;
	
	}


}
