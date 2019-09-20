package basicModule_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Average

{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		int number,average,sum=0;
		System.out.println("enter the number of students :");
		number=Integer.parseInt(br.readLine());
		int array[]=new int[number];
		System.out.println("enter the number of marks:");
		for(int i=0;i<number;i++)
		{
			array[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<number;i++)
		{
			sum=sum+array[i];
		}
		average=sum/number;
		System.out.println("The average is:" +average);
	}
}
