package lab1_exercise_4;

import java.util.Scanner;

public class PowerofTwo {
	
static boolean checkNumber(int number)
{	
	while(number>1)
	{
		if(number%2!=0)
			return false;
		number=number/2;
	}
	return true;
	
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of n");
	int number=s.nextInt();
	if(checkNumber(number))
	{
		System.out.println(number+" is a power of 2");
	}
	else
		System.out.println(number+" is not a power of 2");
	s.close();
}
}



