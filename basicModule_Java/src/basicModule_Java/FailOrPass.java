package basicModule_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FailOrPass
{
	public static void main(String[] arg) throws IOException
	{
		int number,count=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number of students");
		number=Integer.parseInt(br.readLine());
		int array[]=new int[number];
		for (int i=0;i<number;i++)
		{
			array[i]=Integer.parseInt(br.readLine());
		}
		int max=50;
		for (int i=0;i<number;i++)
		{
			if (array[i]<max)
			{
				count++;
			}
		}
		
		System.out.println("the number of students for retest are"  +count);
		
	}
}
