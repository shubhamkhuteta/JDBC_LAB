package lab1_exercise_1;

import java.util.Scanner;

public class ClassSum {
	int i;
	static int sum=0;
	
	int calculateSum(int n)   // to perform the sum operation of numbers divisible by 3 or 5
	{
		for(i=0;i<=n;i++)
		{
			if(i%3==0||i%5==0)
				sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");  //to get the input from the user
		int n=sc.nextInt();  //to read the input given by the user
		ClassSum e=new ClassSum();   //object creation
		e.calculateSum(n);
		System.out.println("Sum: "+sum);
		sc.close();  //to close Scanner 
	}
}
