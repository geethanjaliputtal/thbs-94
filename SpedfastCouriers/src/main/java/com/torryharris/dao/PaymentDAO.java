package com.torryharris.dao;


	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.torryharris.driver.DbHelper;
import com.torryharris.model.Customer;
import com.torryharris.model.Payment;


	public class PaymentDAO {

		public static int addPayment( Payment p) throws Exception {
		
				int result=0;String a,b,m,d,h;
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Payment ID");
				a=sc.next();
				System.out.println("Enter CUstomer Id");
				b=sc.next();
				System.out.println("Enter amount");
				m=sc.next();
				System.out.println("Enter payment type");
				d=sc.next();
				System.out.println("Enter date");
				h=sc.next();
				
				Connection con=DbHelper.getConnection();
				String sql="insert into payment values(?,?,?,?,?);";
				PreparedStatement stat=con.prepareStatement(sql);
				stat.setString(1, a);
				stat.setString(2, b);
				stat.setString(3,m);
				stat.setString(4, d);
				stat.setString(5, h);
				
				stat.execute();
				System.out.println("record inserted");

				ResultSet rs=stat.executeQuery("select * from payment");
				while(rs.next())
					
					System.out.println(rs.getString(1)+"    "+rs.getString(2)+"    "+rs.getString(3)+"    "+rs.getString(4)+"    "+rs.getString(5));
				
				return result;
				
			}
		
		
		public static int modifyPayment(Payment p) throws Exception {
			int result=1;
			Connection con=DbHelper.getConnection();
			
			return result;
			
		}
		
		public static int CancelPayment(Payment p) throws Exception {
			int result=1;
			Connection con=DbHelper.getConnection();
			
			return result;
		
		}

}
