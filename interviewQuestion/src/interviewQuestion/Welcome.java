package interviewQuestion;




import java.util.Scanner;

public class Welcome 
{
	public static void main(String[] arg)
	{
		
		
			Scanner sc=new Scanner(System.in);
			 
			 

			 
			       System.out.print("enter the  String (capital):");
			       
			      String str= sc.next();
			 
			      int v=0,c=0;;
			      for(int i=0;i<str.length();i++)
			      {
			      char ch = str.charAt(i);
			      if(ch == 'A' || ch == 'E' || ch == 'I'
			                     || ch == 'O' || ch == 'U') {

			                    v++;
			                    for(int j=0;j<v;j++)
			                    {

			        System.out.print("*");
			                    }
			                    System.out.print(ch);
			                    for(int j=0;j<v;j++)
			                    {
			        System.out.print("*");
			                    }
			                 
			                   
			                 
			                 }
			      else
			      {

			      System.out.print(ch);
			      //c++;
			      }
			      }

			}

			}