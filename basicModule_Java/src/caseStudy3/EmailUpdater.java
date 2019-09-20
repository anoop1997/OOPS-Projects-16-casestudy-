package caseStudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmailUpdater 
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=0;
		String x;
		
		do 
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
			System.out.println("Do you want to continue?(Y/N):");	
			 x =br.readLine();
			 if(x.compareTo("N")==0)
				 
					System.out.print("Thank you ");
			 
			 
			count++;
			while(x.compareTo("Y")==0);
			
			System.out.println("Do you want to edit your mail ?(y/n):");
			
			
			
				
			
				
			
			
	} 

}
