package demo;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class  MainClass
{String name;
String address;
String contactNumber;
String email;
String proofType;
String proofID;
static int regID=0;

  public MainClass(String name,String address,String contactNumber,String email,String proofType,String proofID)
  {    this.name=name;
      this.address=address;
      this.contactNumber=contactNumber;
      this.email=email;
      this.proofType=proofType;
      this.proofID=proofID;
  }
  
	
	public static void main(String[] args) throws IOException
	{
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		name=br.readLine();
		address=br.readLine();
		contactNumber=br.readLine();
		email=br.readLine();
		proofType=br.readLine();
		proofID=br.readLine(); 
		
		
		
		
		Customer customer=new Customer(name,address,contactNumber,email,proofType,proofID);
		customer.register(name, address, contactNumber, email, proofType, proofID);
	
		//nextInt();
		//next().charAt(0);
		
	}
}
