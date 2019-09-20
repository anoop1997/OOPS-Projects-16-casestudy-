package basicModule_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IplEconomy
{
	public static void main(String[] arg) throws IOException
	{
		int number,counter=0;
		float overall,total=0;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the numberof bowlers :");
		number=Integer.parseInt(br.readLine());
		int runs[]=new int[number];
		int balls[]=new int[number];
		float economy[]=new float[number];
		
		System.out.println("enter the runs conceded:");
		for(int i=0;i<number;i++)
		{
		  runs[i]=Integer.parseInt(br.readLine());
	}
		System.out.println("enter the total balls:");
		for(int i=0;i<number;i++)
		{
		  balls[i]=Integer.parseInt(br.readLine());
		  balls[i]=balls[i]/6;

		}
		for(int i=0;i<number;i++)
		{
		  economy[i]=runs[i]/balls[i];
	}
		for(int i=0;i<number;i++)
		{
		  total=(total+economy[i]);
	}
		overall=total/number;
		System.out.println("enter the overall economy:" +overall);
		
		for(int i=0;i<number;i++)
		{
			if (economy[i]<overall)
			{
				counter++;
			}
		}
		System.out.println("the eligable bowler count is:" +counter);
		
		}
}
	
	
	
	
	
	
