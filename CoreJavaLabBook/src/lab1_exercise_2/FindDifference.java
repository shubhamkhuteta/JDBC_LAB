package lab1_exercise_2;

import java.util.Scanner;

public class FindDifference {
	static int sum;
	static int sum1=0;
	int sqsum=0;
	int i;
	int calculateDifference(int n)
	{
	for(i=0;i<=n;i++)
	{
		sqsum=sqsum+(i*i);
	}
	for(i=0;i<=n;i++)
	{
		sum1=sum1+i;
	}
	sum1=sum1*sum1;
	sum=sqsum-sum1;
	return sum;
	
}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n=sc.nextInt();
	FindDifference e=new FindDifference();
	e.calculateDifference(n);
	System.out.println("Difference= "+sum);
	sc.close();
}
}
