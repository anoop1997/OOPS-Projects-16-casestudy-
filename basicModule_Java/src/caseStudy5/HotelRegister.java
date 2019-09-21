package caseStudy5;


import java.util.Scanner;



public class HotelRegister 

{
	public static int room[] = new int[26];
	public static String[] email = new String[20];
	public static String[] array = new String[20];
	public static int[] rn = new int[20];
	static int r=0, b=0;
	public static void main(String args[])
    {
	 Scanner sc=new Scanner(System.in);
	 
	 String name;
	 String address,a;
	 
	    String contactNumber;
	    
	    String proofType,ans;
	    String proofID;
	    int total=0,j=1;
	    
	    do {

         
        	 System.out.println("Registration");
        	 b++;
        	 System.out.println(" Enter your name");
        	 array[b] = sc.nextLine();
        	 System.out.println(" Enter your address");
        	 address=sc.nextLine();
        	 System.out.println(" Enter your Contact number");
        	 contactNumber=sc.nextLine();
        	 System.out.println(" E-Mail ID");
        	 email[b]=sc.nextLine();
        	 System.out.println(" Enter proof type");
        	 proofType=sc.nextLine();
        	 System.out.println(" Enter proof ID");
        	 proofID=sc.nextLine();
        	 System.out.println(" Thank you for registering. Your id is "+b+"...");
        	 System.out.println("Do you want to book a room? (yes/no)");
        	 a=sc.nextLine();
        	 if(a.equalsIgnoreCase("yes"))
        	 { rn[j]=b;
        	 j++;
     	    	booking();}
        	System.out.println("Do you want to continue registration? (yes/no)");
            ans=sc.nextLine();
     }
	 while(ans.equalsIgnoreCase("yes"));
	    ViewBookings(b);
	   
}

	//FUNCTION FOR BOOKING
	public static void booking()
	{String ac,cot,cable,wifi,laundry,a,date;
	 Scanner sc=new Scanner(System.in);
	 int total=0;
		 
		{
    		
    	System.out.println("Booking:");
    	
  	  room[r]=1;
  	 // rn[r]=b;
  	  r++;
  	  
  	  System.out.println("Please choose the services required.\nAC/non-AC(AC/nAC)");
  	  ac=sc.nextLine();
  	  if(ac.compareTo("ac")==0);
  	  total=total+500;
  	  System.out.println ("Cot(Single/Double)");
  	  cot=sc.nextLine();
  	  if(cot.equalsIgnoreCase("single"))
  		  total=total+350;
  	  else
  		  total=total+500;
  	  System.out.println(" With cable connection/without cable connection(C/nC)");
  	  cable=sc.nextLine();
  	  if(cable.equalsIgnoreCase("c"))
  		  total=total+100;
  	  System.out.println("Wi-Fi needed or not(W/nW)");
  	  wifi=sc.nextLine();
  	  if(wifi.equalsIgnoreCase("w"))
  		  total=total+100;
  	  System.out.println("Laundry service needed or not(L/nL)");
  	  laundry=sc.nextLine();
  	  System.out.println("Your total charge is : "+total);
  	  System.out.println("The services chosen are");
  	  if(laundry.equalsIgnoreCase("l"))
  		  total=total+500;
  	  
        System.out.println(cot+" cot "+ac+" room");
        if(cable.compareTo("c")==0)
      	  System.out.println("Cable connection enabled");
        else
      	  System.out.println("Cable connection disabled");
        if(wifi.compareTo("w")==0)
      	  System.out.println("Wi-Fi enabled");
        else
      	  System.out.println("Wi-Fi disabled");
        if(laundry.compareTo("l")==0)
      	  System.out.println("with laundry service");
        else
      	  System.out.println("with out laundry service");
        total=0;
        System.out.println("Enter the date of booking");
         date=sc.nextLine();
       
	    System.out.println("Do you want to proceed (yes/no)");
	    String c = sc.nextLine();
		if(c.equalsIgnoreCase("yes")) 
		{
			System.out.println("Thank you for booking. Your room number is "+r+".");
			
		}
		 
	}
	}
	
	
	//FUNCTION FOR VIEW
public static void ViewBookings(int n)
{String date,date1;
	int i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the start date date");
    date=sc.nextLine();
    System.out.println("Enter the start date date");
    date1=sc.nextLine();
    System.out.println("The bookings made from "+date+" to "+ date1+" are");
	System.out.println("Customers list");
	System.out.println("Room number Customer ID  ");
	sc.close();
	for(i=1;i<=r;i++)
	{
		System.out.println(i+"\t\t"+rn[i]);
	}
	System.out.println("Thank you !");
	}
}