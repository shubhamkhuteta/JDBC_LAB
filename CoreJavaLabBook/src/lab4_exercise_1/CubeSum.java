package lab4_exercise_1;

import java.util.Scanner;

public class CubeSum 
{
	public static void main(String[] args) {
		int a;
		int c = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int x=n;
		while(n>0)
		{
		a=n%10;
		n=n/10;
		c=c+(a*a*a);
		}
		System.out.println("The sum of cube of the digits of the number "+x+" is:"+c);
		sc.close();
		}
}
