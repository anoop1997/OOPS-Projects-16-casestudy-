package caseStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmailUpdater 

{
	
	
	public static void main(String[] arg) throws IOException
	{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=1,z=1;
		String x,emailU;
		
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
		      
		
			
			System.out.println(" Thankyou for entering the data and your ID is  : "+count);
			 count++;
			System.out.println("Do you want to continue?(Y/N):");
			
			 x =br.readLine();
			 
			 if(x.compareTo("N")==0)
			 { 
					System.out.print("\n Thank you \n");
			
			 System.out.print("Name  :" +name);
			 System.out.print("\naddress  :" +address);
			 System.out.print("\nemail :" +email);
			 System.out.print("\nphone  :" +phoneNumber);
			 System.out.print("\nproof  :" +proof);
			 System.out.print("\nproofid  :" +proofID);
			 
			 
			 
			 break;
			 }
			 
			 if(x.compareTo("Y")==0);
				
				System.out.println("Do you want to edit your mail ?(y/n):");
				
				emailU=br.readLine();
				
				if (emailU.compareTo("Y")==0)
				{
					System.out.print("Enter your email address :");
					
					 email=br.readLine();
					
					System.out.print("\nYOUR EMAIL IS UPDATED");
				
					 System.out.print("Name  :" +name);
					 System.out.print("\naddress  :" +address);
					 System.out.print("\nemail :" +email);
					 System.out.print("\nphone  :" +phoneNumber);
					 System.out.print("\nproof  :" +proof);
					 System.out.print("\nproofid  :" +proofID);
				 break;
				}
}
	}
}
