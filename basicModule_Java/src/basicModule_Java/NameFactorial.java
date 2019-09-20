package basicModule_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameFactorial
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int number,fact=1;
		System.out.println("enter the letter count");
		number=Integer.parseInt(br.readLine());
		while (number>1)
			
		{
			fact=fact*number;
			number--;
		}
	System.out.println("the value is :" +fact);
	
	}
	

}
