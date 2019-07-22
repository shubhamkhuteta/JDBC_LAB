package lab1_exercise_3;

import java.util.Scanner;

public class NumberIncreasing {
	static boolean checkNumber(int number)
	{	boolean n=false;
	int a=number%10;
	number=number/10;
	while(number>0)
	{
		if(a<number%10)
		{
			n=true;
			break;
		}
		a=number%10;
		number=number/10;
	}
		if(n)
		{
			System.out.println("No");
			return false;
		}
		else 
		{
	
		System.out.println("Yes");	
		return true;
		}
			}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		//e.checkNumber(number);
		System.out.println(checkNumber(number));
		sc.close();
	}
}
