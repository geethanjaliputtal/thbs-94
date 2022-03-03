package com.torryharris.dao;
import java.sql.Connection;

import com.torryharris.driver.DbHelper;
import com.torryharris.model.Comapany;


public class ComapanyDAO {

	public static int addCompanybranch( Comapany c) throws Exception {
		int result=1;
		Connection con=DbHelper.getConnection();
		
		return result;
	
	}
	
	public static int modifyCompany(ComapanyDAO c) throws Exception {
		int result=1;
		Connection con=DbHelper.getConnection();
		
		return result;
		
	}


}
