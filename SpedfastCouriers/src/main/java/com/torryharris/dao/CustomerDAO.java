package com.torryharris.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.torryharris.driver.DbHelper;
import com.torryharris.model.Address;
import com.torryharris.model.Customer;

public class CustomerDAO {

	public static int addCustomer(Customer c) throws Exception {
		
		int result=0;String a,b,m,d,f,h,e,g,i,k,j;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CustomerID");
		a=sc.next();
		System.out.println("Enter Customer Name");
		b=sc.next();
		System.out.println("Enter Email");
		m=sc.next();
		System.out.println("Enter phone");
		d=sc.next();
		System.out.println("Enter the status");
		f=sc.next();
		System.out.println("Enter Addressline1");
		h=sc.next();
		System.out.println("Enter Addressline2");
		e=sc.next();
		System.out.println("Enter landmark");
		g=sc.next();
		System.out.println("Enter Area");
		i=sc.next();
		System.out.println("Enter city");
		k=sc.next();
		System.out.println("Enter pincode");
		j=sc.next();
		Connection con=DbHelper.getConnection();
		Address add=new Address(h,e,g,i,k,j);
		String sql="insert into customer values(?,?,?,?,?,?,?,?,?,?,?);";
		PreparedStatement stat=con.prepareStatement(sql);
		stat.setString(1,a);
		stat.setString(2, b);
		stat.setString(3, m);
		stat.setString(4, h);
		stat.setString(5, f);
		stat.setString(6, add.getAddressLine1());
		stat.setString(7, add.getAddressLine2());
		stat.setString(8, add.getLandmark());
		stat.setString(9, add.getArea());
		stat.setString(10,add.getCity());
		stat.setString(11, add.getPincode());
		
		stat.execute();
		System.out.println("record inserted");

		ResultSet rs=stat.executeQuery("select * from customer");
		while(rs.next())
			
			System.out.println(rs.getString(1)+"    "+rs.getString(2)+"    "+rs.getString(3)+"    "+rs.getString(4)+"    "+rs.getString(5)+"    "+rs.getString(6)+"   "
			+rs.getString(7)+"    "+rs.getString(8)+"    "+rs.getString(9)+"   "+rs.getString(10)+"   "+rs.getString(11));
		
		return result;
		
	}
	
	public static int modifyCustomer(Customer c) throws Exception {
		int result=1;
		Connection con=DbHelper.getConnection();
		
		return result;
		
	}
	
	public static int deactivateCustomer(Customer c) throws Exception {
		int result=1;
		Connection con=DbHelper.getConnection();
		
		return result;
	
	}
}

