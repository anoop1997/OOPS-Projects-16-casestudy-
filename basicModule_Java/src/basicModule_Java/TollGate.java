package basicModule_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TollGate 
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		int fare,heavy=0,light=0,govt=0;
		System.out.println("enter the number");
		fare=Integer.parseInt(br.readLine());
		System.out.println("enter the fares");
		int array[]=new int[fare];
		
		for(int i=1;i<fare;i++)
		{
			array[i]=Integer.parseInt(br.readLine());
		}
		for(int i=1;i<fare;i++)
		{
		
		if (array[i]>50)
		{
			heavy++;
		}
		
		else 
		{
			if(array[i]==0)
			{
				govt++;
				break;
			}
		}
			light++;
		}
		
		System.out.println("hevy : "+heavy+"light :"+light+"govt :"+govt);
}
}
