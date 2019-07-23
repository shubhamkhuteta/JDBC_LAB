package lab5_exercise_5;

import java.util.Scanner;
class MyException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int age;
	public MyException(int age)
	{
		this.age=age;
	}
	public String toString()
	{
		return "You are not eligible to write SSLC Exam..Your age is "+age;
	}
}
public class ValidateAge {
	static void validation(int age) throws MyException
	{
		if(age<15)
		{
			throw new MyException(age);//MyException obj
		}
		else
		{
			System.out.println("You are eligible to write SSLC Exam");
		}
	}
	public static void main(String[] args)throws MyException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age");
		int a=s.nextInt();
		ValidateAge.validation(a);
		s.close();
	}
}