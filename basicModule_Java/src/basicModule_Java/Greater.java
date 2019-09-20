package basicModule_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greater
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		int number,max=0;
		System.out.println("enter the number of auctioniers :");
		number=Integer.parseInt(br.readLine());
		int array[]=new int[number];
		System.out.println("enter the bids:");
		for(int i=0;i<number;i++)
		{
			array[i]=Integer.parseInt(br.readLine());
		}
		max=array[0];

		for(int i=1;i<number;i++)
		{
			if (max<array[i])
			{
				max=array[i];
			}
		}
		System.out.print("The higheset bid is:" +max);
	}
}
