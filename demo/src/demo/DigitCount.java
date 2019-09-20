package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitCount 
{


public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number ");
int number=Integer.parseInt(br.readLine());
int t=0;
int n=number/10;
int r=number%10;
if((number>=20)||(number<=10))
{



switch(r)
{
case 1:
case 2:
case 6:
t=t+3;
break;
case 4:
case 5:
case 9:
t=t+4;
break;
case 3:
case 8:
case 7:
t=t+5;
break;

}

switch(n)
{
case 3:
case 2:
case 8:
case 9:
t=t+6;
break;
case 4:
case 5:
case 6:
t=t+5;
break;
case 7:
t=t+7;
break;


}
}
else
{
switch(number)
{
case 11:
case 12:
t=t+6;
break;
case 16:
t=t+7;
break;
case 13:
case 14:
case 18:
case 19:
t=t+8;
break;
case 17:
t=t+9;
break;
}
}
System.out.println(t);
}

}