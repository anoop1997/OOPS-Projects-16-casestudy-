package basicModule_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AdditionFactorial
{

	public static void main(String[] arg) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		int initial,last,sum=0;
		System.out.println("enter a number");
		initial=Integer.parseInt(br.readLine());
		if(initial<0)
		{
			System.out.println("enter the number");
		last=Integer.parseInt(br.readLine());
		for(int i=1;i<=last;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("the sum is:" +sum);
		}
		else 
		{
		for(int i=1;i<=initial;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("the sum is:" +sum);
		}
}
}