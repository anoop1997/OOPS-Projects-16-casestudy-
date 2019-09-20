package basicModule_Java;

import java.io.BufferedReader;
import java.io.IOException;
import  java.io.InputStreamReader;

 class Input_Output
 {
	 public static void main(String[] arg) throws IOException
 {  
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 String name=br.readLine();
 String age=br.readLine();
 String degree=br.readLine();
 String branch=br.readLine();
 String contactNo=br.readLine();
 System.out.println("Name :" +name);
 System.out.println("Age :" +age);
 System.out.println("degree :" +degree);
 System.out.println("branch :" +branch);
 System.out.println("contactNo :" +contactNo);
 }
}
 
