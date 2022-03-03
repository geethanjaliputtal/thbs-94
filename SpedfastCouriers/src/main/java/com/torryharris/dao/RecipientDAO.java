package com.torryharris.dao;
import java.sql.Connection;

import com.torryharris.driver.DbHelper;
import com.torryharris.model.Receipient;


public class RecipientDAO {

	public static int addRecipient( Receipient r) throws Exception {
		int result=1;
		Connection con=DbHelper.getConnection();
		
		return result;
	
	}
	
	public static int modifyRecipient(Receipient r) throws Exception {
		int result=1;
		Connection con=DbHelper.getConnection();
		
		return result;
		
	}
	
	public static int deactivateRecipient(Receipient r) throws Exception {
		int result=1;
		Connection con=DbHelper.getConnection();
		
		return result;
	
	}


}
