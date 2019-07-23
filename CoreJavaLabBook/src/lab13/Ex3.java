package lab13;

import java.util.Comparator;
import java.util.Scanner;
@SuppressWarnings("unused")
interface user
{
public boolean  print(String value1, String value2);
}
public class Ex3
{
public static void main(String[] args)
{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter User Name:");
		String username=input.next();
		System.out.println("Enter Password:" );
		String password=input.next();
		user l=(value1,value2)->
		{if (value1.equals(username)&& value2.equals(password))
				return true;
			else
				return false;
        };
boolean c=l.print("rocky","kgf");
System.out.println(c);
input.close();
}
}
