package lab8_exercise_1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerClass {
	public static void main(String[] args) {
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the integers");
		String str=s.nextLine();
		StringTokenizer t=new StringTokenizer(str," ");
		while(t.hasMoreTokens())
		{
			String temp=t.nextToken();
			n=Integer.parseInt(temp);
			System.out.println(n);
			sum=sum+n;;
		}
		System.out.println("Sum: "+sum);
		s.close();
	}
}
