package lab3_exercise_4;

import java.util.Scanner;

public class Occuring {
	static void getOccuring(String str)
	{
		int count[]=new int [256];
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			count[str.charAt(i)]++;
		}
		char ch[]=new char[str.length()];
		for(int i=0;i<len;i++)
		{
			ch[i]=str.charAt(i);
			int find=0;
			for(int j=0;j<=i;j++)
			{
				if(str.charAt(i)==ch[j])
					find++;
			}
			if(find==1)
				System.out.println("Number of Occurence of "+str.charAt(i)+" is:"+count[str.charAt(i)]);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.nextLine();
		getOccuring(str);
		s.close();
	}
}
