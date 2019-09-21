package caseStudy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomerDisplay 

{
	
	 public static String  array[]=new  String[25];
		
	public static void viewCoustomer(String name,String address,String phoneNumber,String email,String proof,String proofID,int count)
	{
		System.out.println("\n  Customer  list\n\n");
		System.out.println("\n   The Registered Coustomers Are");
		
		int i=1;
		while(i<=count)
		{
			System.out.println("\n  CUSTOMER NAME :"+array[i]+"\t\tCoustomer ID :"+i);
		i++;
		}
	
	}
	
	public static void main(String[] arg) throws IOException
	
	{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int count=0,z=1;
			String x;
			
		      
			    while (z==1)
			      {
			    	
			    	System.out.println("\n        Registeration");
					System.out.print("Enter your name :");
					String name=br.readLine();
					System.out.print("Enter your address :");
					String address=br.readLine();
					System.out.print("Enter your phone number :");
					String phoneNumber=br.readLine();
					System.out.print("Enter your email address :");
					String email=br.readLine();
					System.out.print("Enter your proof :");
					String proof=br.readLine();
					System.out.print("Enter your proof ID :");
					String proofID=br.readLine();
			      
			
					count++;
				System.out.println(" Thankyou for entering the data and your ID is  : "+count);
				 
				 for(int i=count;i<25;i++)
				 {
					 array[i]=name;
					 
				 }
				System.out.println("Do you want to continue?(Y/N):");
				
				 x =br.readLine();
				 
				  if (x.compareTo("N")==0)
				  {
					  viewCoustomer (name,address,phoneNumber, email, proof, proofID, count );
					  break;
				  }
				  else
				  {
					  z=1;
				  }
		
		
	}
	
	}
}

