package lab8_exercise_7;

import java.util.Scanner;

public class CheckUsername {
	public static void main(String[] args) {
		boolean b=false;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		name+="_job";
		int i=name.indexOf("_");
		String s=name.substring(0,i);
		System.out.println(s);
		b=validate(s);
		if(b==true)
		{
			System.out.println("Valid Name..."+name);
		}
		else
			System.out.println("Invalid Name..");
		sc.close();
	}
	static boolean validate(String name)
	{
		boolean res=false;
		if(name.length()<8)
		{
			res=false;
		}
		else
		{
			res=true;
		}
		return res;
	}
}
