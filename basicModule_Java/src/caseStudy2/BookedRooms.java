package caseStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BookedRooms
{
	public static int array[]=new int[25];
	public static int total(String ac,String cot,String cable,String wifi, String laundary)
	{
		int sum=0;
		if (ac=="AC")
		{
			sum=sum+500;
		}
		else
			sum=sum+250;
		
		if(cot=="Double")
		{
			sum=sum+850;
		}
		else
			sum=sum+500;
		if (cable=="C")
		{
			sum=sum+50;
		}
		if(wifi=="W")
		{
			sum=sum+100;
		}
		if (laundary=="l")
		{
			sum=sum+200;
		}
		return sum;
	}
				
	 public static void main(String[] arg) throws IOException
	 {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    	int count=1,C=0,n;
    	String X;
    	

	
    	do {
	System.out.println("\n          MENU");
	System.out.println("1.BOOK");
	System.out.println("2.Check_Status");
	System.out.println("3.Exit");
	
	
	n=Integer.parseInt(br.readLine());
	

		
	switch (n)
	{
	case 1:
		
		System.out.println("Please Choose the Service Required");
		System.out.print("AC OR Non-AC(AC/nAc)");
		String ac=br.readLine();
		System.out.print("cot(Single/Double)");
		String cot=br.readLine();
		System.out.print("With cable or Without cable(C/Cn)");
		String cable=br.readLine();
		System.out.print("Wifi needed or not(W/nW)");
		String wifi=br.readLine();
		System.out.print("Laundary Service Needed or Not(L/nL)");
		String  laundary=br.readLine();
		
		int z=total(ac,cot,cable,wifi,laundary);
		
		System.out.print("Total cost is :"+z);
		
		System.out.print("The Service choosen are:");
		
		System.out.print(" "+ac+" " +cot+" " +cable+" " + wifi+ " " +laundary);
		System.out.println("Do you want to continue?(Yes/No):");	
		 X =br.readLine();
		if(X.compareTo("yes")==0)
		System.out.print("Thank you for booking the room No is:" +count);
		
		
		array[count]=1;
			
			
		
		
		count++;
		
		break;
		
			
	case 2 :
	
		System.out.print("Check Status ");
		
		System.out.print("Enter the room number :");
	     int room=Integer.parseInt(br.readLine());
	     for(int i=1;i<=25;i++)
	     {
	    	 if(array[room]==1)
	    	 {
	    		 C=1;
	    	 }
	    	 else
	    		 C=0;
	     }
	     if (C==1)
	     
	      System.out.print("the room is booked");
	     else
	    	 System.out.print("the room is Not booked");
	     
	     break;
	
	case 3:
	
		break;	
	
	}
    	}
	while (n!=3);
}
	 }