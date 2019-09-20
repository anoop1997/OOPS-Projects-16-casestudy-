package basicModule_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Combination 
{
	public static int factorial(int c)
	{
		int fact=1;
        for(int i=c;i>1;i--)
        {
        	fact=fact*c;
        }
		
		return fact;
	}

	public static void main(String[] arg) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		int n,r,combination;
		System.out.println("enter the value of n:");
		n=Integer.parseInt(br.readLine());
		System.out.println("enter the value of r:");
		r=Integer.parseInt(br.readLine());
		combination=factorial(n)/(factorial(r)*factorial(n-r));
		System.out.println("The combination is:" +combination);
		
		
		
}
	}
