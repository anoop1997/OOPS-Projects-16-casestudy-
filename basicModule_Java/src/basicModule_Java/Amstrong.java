package basicModule_Java;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Amstrong {
	
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int number,reminder,sum=0,temp,n,count=0;
		System.out.println("Enter the number");
		number=Integer.parseInt(br.readLine());
		temp=number;
		n=number;
		
		while(n>0)
		{
			count++;
			n=n/10;
		}
		
		while (temp>0)
		{
			reminder=temp%10;
			reminder=(int) Math.pow(reminder,count);
			sum=sum+reminder;
			temp=temp/10;
			
		}
		if (number==sum)
		{
			System.out.println("The number is Amstrong");
		}
		else
		{
			System.out.println("The number is not  Amstrong");
		}
			
	}
}
