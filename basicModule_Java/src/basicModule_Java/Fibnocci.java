package basicModule_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibnocci {
	
	public static void main(String[] args) throws IOException
	{
		int number,one=0,two=1,x;
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("enter the length");
		number=Integer.parseInt(br.readLine());
		for(int i=0;i<number;i++)
		{
			x=one;
			System.out.print(" "+x);
			one=two+x;
			two=x;
			
			
			
			
			
		}
	
	}
}
