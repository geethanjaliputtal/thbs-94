package com.torryharris.driver;

import java.util.Scanner;

import com.torryharris.dao.CustomerDAO;
import com.torryharris.dao.GreetingShimentDAO;
import com.torryharris.dao.PaymentDAO;
import com.torryharris.dao.PriorityDAO;
import com.torryharris.dao.ShipmentDAO;
import com.torryharris.model.Customer;
import com.torryharris.model.GreetingShipment;
import com.torryharris.model.Payment;
import com.torryharris.model.Priority;
import com.torryharris.model.Shipment;

public class SpedfastApplication{
	
public static void start() throws Exception{
System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println(" Welcome to spedfast Application ");
System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println(" Menu");
System.out.println();
System.out.println(" 1.Add new customer");
System.out.println(" 2.Add new shipment");
System.out.println(" 3.Add new greetingshipment");
System.out.println(" 4.Add new payment");
System.out.println(" 5.Add new priority");
System.out.println();
int n;
System.out.println("enter your choice");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
switch(n) {
case 1:Customer c=new Customer();
CustomerDAO.addCustomer(c);
break;
case 2:Shipment s=new Shipment();
ShipmentDAO.addShipment(s);
break;
case 3:GreetingShipment gs=new GreetingShipment();
GreetingShimentDAO.addGreetingShipment(gs);
break;
case 4:Payment q=new Payment();
PaymentDAO.addPayment(q);
break;
case 5:
Priority p=new Priority();
PriorityDAO.addPriority(p);
break;
default:
System.out.println("The value of the variable is neither 1 nor 2 nor 3");
}
}
}


