package lab5_exercise_2;

import java.util.Scanner;

class FibonacciException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int a,b,c;
	public FibonacciException(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void run(int n)
	{
		System.out.println("Fibonacci Series...");
		for(int i=1;i<=n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(b+" ");
		}
	}
}
public class Fibonacci {
	static void fibo(int n)throws FibonacciException
	{
		int a=0,b=1,c=1;
		for(int i=1;i<=n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(b+" ");
		}
	}
	public static void main(String[] args) throws FibonacciException {
		int n;
		FibonacciException e=new FibonacciException(0, 1, 1);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		Fibonacci.fibo(n);
		e.run(n);
		System.out.println("\n");
		sc.close();
	}
}