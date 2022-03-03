package com.torryharris.dao;

	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.torryharris.driver.DbHelper;
import com.torryharris.model.Customer;
import com.torryharris.model.Priority;

import com.torryharris.model.Priority;

	public class PriorityDAO {


		public static int addPriority( Priority p) throws Exception {
			
			int result=0;String a;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Priority type");
			a=sc.next();
			
			Connection con=DbHelper.getConnection();
			String sql="insert into priority values(?);";
			PreparedStatement stat=con.prepareStatement(sql);
			stat.setString(1, a);
			
			
			stat.execute();
			System.out.println("record inserted");

			ResultSet rs=stat.executeQuery("select * from priority");
			while(rs.next())
				
				System.out.println(rs.getString(1));
			
			return result;
			
		}
		
		public static int modifyPriority(Priority pr) throws Exception {
			int result=1;
			Connection con=DbHelper.getConnection();
			
			return result;
			
		}
		
		public static int deletePriority(Priority pr) throws Exception {
			int result=1;
			Connection con=DbHelper.getConnection();
			
			return result;
		
		}
}
