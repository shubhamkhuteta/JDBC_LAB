package lab8_exercise_5;

import java.util.Scanner;

public class PosiviteOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.nextLine();
		char p=s.charAt(0);
		boolean b=false;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=p)
			{
				b=true;
				p=s.charAt(i);
			}
			else
			{
				b=false;
			}
		}
		if(b==false)
		{
			System.out.println("Negative String");
		}
		else if(b==true)
		{
			System.out.println("Positive String");
		}
		sc.close();
	}
}
