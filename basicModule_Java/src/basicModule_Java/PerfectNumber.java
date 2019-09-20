package basicModule_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PerfectNumber
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		int number,divisor,sum=0;
		System.out.println("enter the number");
		number=Integer.parseInt(br.readLine());
		
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}
		}
		if (sum==number)
		{
			System.out.println("Perfect number");
			
		}
		else
			
			System.out.println(" Not Perfect number");
	}
}
