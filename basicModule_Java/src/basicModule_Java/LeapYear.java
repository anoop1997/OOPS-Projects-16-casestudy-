package basicModule_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear 
{
  public static void main(String[] arg) throws IOException

{
	
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int number,flag=0;
System.out.println("enter the year");
number=Integer.parseInt(br.readLine());
if (number%4==0)
{
	if(number%100==0)
	{
		if(number%400==0)
			
			System.out.println("Is a leap year");
		
		else
		
			System.out.println("Not a leap year");
	}
		
	else
		 
		System.out.println("is  a leap year");
}	 

	    else
	       
	    	System.out.println("Not a leap year");
		

	
}
}

