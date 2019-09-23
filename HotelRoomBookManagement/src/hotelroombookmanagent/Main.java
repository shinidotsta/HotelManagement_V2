package hotelroombookmanagent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main 
{
	public static int CustID=0;
	public static int RoomID=0;
	static int bookedRoomsID[]=new int[25];
	static String EmaiIDs[]=new String[25];
	
	public static String custArray[]=new String[100];
	public static int custRegIDArray[]=new int[100];
	
	public static int DateBook[]=new int[100];
	
	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		// Booking buk=new Booking();

		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		int date;
		
		

		String Newmail;
		int startdate;
		int enddate;
		
		 int pos=0;
		 int epos=0;
		 
		
		String RegStr;
		do {
		System.out.println("ENTER MENU");
		System.out.println("1.Register  2.Book   3.Check Status  4.Update Email");
		System.out.println(" 5.All Bookings      6.Allcustomers   7.exit");
		int choice;
	    choice=sc.nextInt();
		
		switch(choice) 
		{
		case 1:
			do {
	     System.out.println("Enter Your Name");
		name=br.readLine();
		System.out.println("Enter Your address");
		address=br.readLine();
		System.out.println("Enter Contact No");
		contactNumber=br.readLine();
		System.out.println("Enter Email");
		email=br.readLine();
		System.out.println("Enter ProofType");
		proofType=br.readLine();
		System.out.println("Enter proofID");
		proofID=br.readLine();
		
		Register reg=new Register(name,address,contactNumber,email,proofType,proofID);
		
		System.out.println("Thank you for the registration.Your ID :"+" "+ ++CustID);
		EmaiIDs[epos]=email;
		custArray[epos]=name;
		custRegIDArray[epos]=CustID;
		epos++;
		System.out.println("Do you want to continue registration (y/n)?");
		RegStr=br.readLine();
		
		}while(RegStr.equalsIgnoreCase("yes"));
		
		break;
		case 2:
			System.out.println("Enter your customer ID");
			int checkID=sc.nextInt();
			for(int i=0;i<CustID;i++)
			{
				if(custRegIDArray[i]==checkID)
				{
			
		//	do {
				   System.out.println("Please choose the services required.");
				   System.out.println("Which room you want AC/non-AC  (AC/nAC)");
					ac=br.readLine();
					System.out.println("Cot(Single/Double)");
					cot=br.readLine();
					System.out.println("With cable connection/without cable connection(C/nC)");
					cable=br.readLine();
					System.out.println("Wi-Fi needed or not(W/nW)");
					wifi=br.readLine();
					System.out.println("Laundry service needed or not(L/nL)");
					laundry=br.readLine();
					System.out.println("Enter the date of booking");
					date=sc.nextInt();
					
					 //System.out.println(ac+""+cot+""+cable+""+wifi+""+laundry+""+date);

					Booking buk=new Booking(ac,cot,cable,wifi,laundry,date);
					
					
					buk.CalculateCharge();
					buk.servicesRoom();
					buk.servicesHotel();
					
					 System.out.println("Do you want to proceed?");
					  String strroom=br.readLine();
					  if(strroom.equalsIgnoreCase("Yes"))
					  {
						 
						  System.out.println("Thank you for booking. Your room number is"+""+(++RoomID));
						  bookedRoomsID[pos]=RoomID;
						  DateBook[pos]=date;
						  pos++;
						  
					  }
					  if(strroom.equalsIgnoreCase("no"))
					  {
						  System.out.println("Visit Again");  
					  }
				}
				else
					System.out.println("Registered users are allowed");
			}
			
					  
			 //  }while();
			break;
		case 3:
			System.out.println("Enter The room No");
		     int roomNo=sc.nextInt();
			// buk.CheckStatus(roomNo);
			int flag=1;
			for(int j=0;j<25;j++)
			{
				if(bookedRoomsID[j]==roomNo)
				{
					flag=1;
				    break;
				}
				else 
					flag=0;
			}
			if(flag==1)
				System.out.println("Already Booked");
			else
				System.out.println("Not Booked");
			break;		
		
		case 4:
			System.out.println("Enter the CustomerID");
			int custid=sc.nextInt();
			System.out.println("Enter New Mailid");
			String upmail=br.readLine();
			for(int i=0;i<epos;i++)
			{
				if(i==custid-1)
				{
					System.out.println("old mail id:"+""+EmaiIDs[i]);
			        EmaiIDs[i]=upmail;
			    	System.out.println("updated mail id:"+""+EmaiIDs[i]);
				}
			}
			
			break;
			
			
			
		case 6:
			System.out.println("The registered customers are");
			System.out.println("Customer ID                Customer name");
			 for(int k=0;k<CustID;k++)
			 {
				 System.out.println(custRegIDArray[k]+"                             "+custArray[k]);			
		     }
			break;
			
		case 5:
			System.out.println("Enter the start date");
			int strDate=sc.nextInt();
			System.out.println("Enter the end date");
			int endDate=sc.nextInt();
			for(int i=0;i<pos;i++)
			{
				if(strDate<=DateBook[i] &&DateBook[i]<=endDate)
				System.out.println(custRegIDArray[i]+"           "+bookedRoomsID[i]);
			}
			break;
		case 7:
			System.out.println("Bye");
			break;
		}
		
		}while(true);
		
		
	
		
		
	}

}
