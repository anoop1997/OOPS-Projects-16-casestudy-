package basicModule_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boxing {
	

	public static void main(String[] arg) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		int number,min=0,i;
		System.out.println("enter the number of boxers :");
		number=Integer.parseInt(br.readLine());
		int array[]=new int[number];
		System.out.println("enter the fouls:");
		for(i=0;i<number;i++)
		{
			array[i]=Integer.parseInt(br.readLine());
		}
		min=array[0];

		for( i=1;i<number;i++)
		{
			if (min<array[i])
			{
				min=array[i];
			}
		}
		System.out.print("The proper candidate is:" +i);
	}
}
