package com.torryharris.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.torryharris.driver.DbHelper;
import com.torryharris.model.Address;
import com.torryharris.model.Customer;
import com.torryharris.model.GreetingShipment;
import com.torryharris.model.Shipment;

public class GreetingShimentDAO {
public static int addGreetingShipment( GreetingShipment gs) throws Exception {
		
		int result=0;String a,f,b,m,d,h,c,k,l,g,j,i,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Greeting ShipmentID");
		a=sc.next();
		System.out.println("Enter Greeting message");
		f=sc.next();
		System.out.println("Enter customer id");
		b=sc.next();
		System.out.println("Enter priority");
		m=sc.next();
		System.out.println("Enter weight");
		d=sc.next();
		System.out.println("Enter senders address");
		h=sc.next();
		System.out.println("Enter recipients addressline 1");
		c=sc.next();
		System.out.println("Enter recipients addressline2");
		k=sc.next();
		System.out.println("Enter recipients landmark");
		l=sc.next();
		System.out.println("Enter recipients area");
		g=sc.next();
		System.out.println("Enter recipients city");
		j=sc.next();
		System.out.println("Enter pincode");
		i=sc.next();
		System.out.println("Enter the delivery date");
		e=sc.next();
		Connection con=DbHelper.getConnection();
		Address add=new Address(c,k,l,g,j,i);
		
		String sql="insert into greetingshipment values(?,?,?,?,?,?,?,?,?,?,?,?,?);";
		PreparedStatement stat=con.prepareStatement(sql);
		stat.setString(1,a);
		stat.setString(2, f);
		stat.setString(3,b);
		stat.setString(4,m);
		stat.setString(5,d);
		stat.setString(6, h);
		stat.setString(7,add.getAddressLine1());
		stat.setString(8,add.getAddressLine2());
		stat.setString(9, add.getLandmark());
		stat.setString(10, add.getArea());
		stat.setString(11,add.getCity());
		stat.setString(12,add.getPincode());
		stat.setString(13,e);
		stat.execute();
		System.out.println("record inserted");

		ResultSet rs=stat.executeQuery("select * from greetingshipment");
		while(rs.next())
		System.out.println(rs.getString(1)+"    "+rs.getString(2)+"    "+rs.getString(3)+"    "+rs.getString(4)+"    "+rs.getString(5)+"    "+rs.getString(6)+"    "+rs.getString(7)
		+"    "+rs.getString(8)+"   "+rs.getString(9)+"   "+rs.getString(10)+"   "+rs.getString(11)+"   "+rs.getString(12)+"   "+rs.getString(13));
		return result;
}
}

	