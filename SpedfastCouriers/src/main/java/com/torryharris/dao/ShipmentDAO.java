package com.torryharris.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.torryharris.driver.DbHelper;
import com.torryharris.model.Address;
import com.torryharris.model.Shipment;

public class ShipmentDAO {

public static int addShipment( Shipment s) throws Exception {
		
		int result=0;String a,b,m,d,h,c,k,f,g,j,i,e;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ShipmentID");
		a=sc.next();
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
		f=sc.next();
		System.out.println("Enter recipients area");
		g=sc.next();
		System.out.println("Enter recipients city");
		j=sc.next();
		System.out.println("Enter pincode");
		i=sc.next();
		System.out.println("Enter the delivery date");
		e=sc.next();
		Connection con=DbHelper.getConnection();
		Address add=new Address(c,k,f,g,j,i);
		String sql="insert into shipment values(?,?,?,?,?,?,?,?,?,?,?,?);";
		PreparedStatement stat=con.prepareStatement(sql);
		stat.setString(1, a);
		stat.setString(2, b);
		stat.setString(3,m);
		stat.setString(4,d);
		stat.setString(5,h);
		stat.setString(6,add.getAddressLine1());
		stat.setString(7,add.getAddressLine2());
		stat.setString(8, add.getLandmark());
		stat.setString(9, add.getArea());
		stat.setString(10,add.getCity());
		stat.setString(11,add.getPincode());
		stat.setString(12,e);
		stat.execute();
		System.out.println("record inserted");

		ResultSet rs=stat.executeQuery("select * from shipment");
		while(rs.next())
		System.out.println(rs.getString(1)+"    "+rs.getString(2)+"    "+rs.getString(3)+"    "+rs.getString(4)+"    "+rs.getString(5)+"    "+rs.getString(6)+"    "+rs.getString(7)
		+"    "+rs.getString(8)+"   "+rs.getString(9)+"   "+rs.getString(10)+"   "+rs.getString(11)+"   "+rs.getString(12));
		return result;
		
	}
	
	public static int modifyShipment(Shipment s) throws Exception {
		int result=1;
		Connection con=DbHelper.getConnection();
		
		return result;
		
	}
	
	public static int CancelShipment(Shipment s) throws Exception {
		int result=1;
		Connection con=DbHelper.getConnection();
		
		return result;
	
	}


}
