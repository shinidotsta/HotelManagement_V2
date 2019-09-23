package hotelroombookmanagent;

public class Booking 
{
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	int date;
	static int charge=0;




	public Booking(String ac,String cot,String cable,String wifi,String laundry,int date)
	{
		this.ac=ac;this.cot=cot;this.cable=cable;this.wifi=wifi;this.laundry=laundry;this.date=date;
		//System.out.println(ac+""+cot+""+cable+""+wifi+""+laundry+""+date);
	}

	public Booking() {
		// TODO Auto-generated constructor stub
	}



	public void CalculateCharge()
	{
		if((this.ac).equalsIgnoreCase("AC"))
		{
			charge=charge+1000;
		}else
		if((this.ac).equalsIgnoreCase("nAC"))
		{
			charge=charge+750;
		}
		
		if((this.cot).equalsIgnoreCase("Single"))
		{
			charge=charge+0;
		}
		else
		if((this.cot).equalsIgnoreCase("Double"))
			{
			charge=charge+350;
			}
			
		if((this.cable).equalsIgnoreCase("C"))
		{
			charge=charge+50;
		}
		else
	   if((this.cable).equalsIgnoreCase("nC"))
			{
		   charge=charge+0;
			}
		
		
		if((this.wifi).equalsIgnoreCase("W"))
		{
			charge=charge+200;
		}
		else
	   if((this.wifi).equalsIgnoreCase("nW"))
			{
		   charge=charge+0;
			}
		if((this.wifi).equalsIgnoreCase("L"))
		{
			charge=charge+100;
		}
		else
	   if((this.wifi).equalsIgnoreCase("nL"))
			{
		   charge=charge+0;
			}
		System.out.println("The total charge is Rs."+""+charge);
	}
	
	
	
	
	public void servicesRoom()
	{
		System.out.println("The services chosen are");
		if((this.cot).equalsIgnoreCase("Single") && (this.ac).equalsIgnoreCase("AC"))
		{
			System.out.println("Single cot AC room");
		}
		else
			if((this.cot).equalsIgnoreCase("Single") && (this.ac).equalsIgnoreCase("nAC"))
			{
				System.out.println("Single Cot non-AC room");
			}
		else
		if((this.cot).equalsIgnoreCase("Double") && (this.ac).equalsIgnoreCase("AC"))
		{
			System.out.println("Double Cot AC room");
		}
		else
			if((this.cot).equalsIgnoreCase("Double") && (this.ac).equalsIgnoreCase("nAC"))
			{
				System.out.println("Double Cot Non-AC room");
			}
	}
	
	public void servicesHotel()
	{
		if((this.cable).equalsIgnoreCase("C"))
		{
			System.out.println("Cable connection enabled");
		}
		else
	   if((this.cable).equalsIgnoreCase("nC"))
			{
		   System.out.println("No Cable connection enabled");
			}
		if((this.wifi).equalsIgnoreCase("W"))
		{
			System.out.println("Wi-Fi enabled");
		}
		else
	   if((this.wifi).equalsIgnoreCase("nW"))
			{
		   System.out.println("No Wi-Fi enabled");
			}
		if((this.laundry).equalsIgnoreCase("L"))
		{
			System.out.println("with laundry service");
		}
		else
	   if((this.laundry).equalsIgnoreCase("nL"))
			{
		   System.out.println("with no laundry service");
			}
	}
	
	
	public void  CheckStatus(int RoomID)
	{
		
	}
}
