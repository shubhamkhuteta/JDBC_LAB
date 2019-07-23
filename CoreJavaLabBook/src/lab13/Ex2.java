package lab13;

import java.util.*;
import java.util.Scanner;
@SuppressWarnings("unused")
interface lambda
{
public String print(String s);
}
public class Ex2 
{
public static void main(String[] args) 
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the String Value-->");
	String value= input.next();
	lambda l =(s)-> 
	{ 
	StringBuilder buildreader= new StringBuilder();
	for(int i=0;i<value.length();i++)
	{
	   buildreader = buildreader.append(value.charAt(i)).append(" ");
	}
 return buildreader.toString();
	};
	String output=l.print(value);
	System.out.println("The Values are " +output);
	input.close();
	}
}
