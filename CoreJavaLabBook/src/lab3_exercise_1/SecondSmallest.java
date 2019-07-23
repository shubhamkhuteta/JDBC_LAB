package lab3_exercise_1;

import java.util.Scanner;

public class SecondSmallest {
	static int temp;
	int a[];
	int getSecondSmallest(int a[])
	{
    for (int i=0;i<a.length;i++) 
    {
        for (int j=i+1;j<a.length;j++) 
        {
            if (a[i] > a[j]) 
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
		return a[1];
	}
	public static void main(String[] args) {	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the no of elements in the array");
	int n=s.nextInt();
	int a[] = new int[n];//3
    System.out.println("Enter all the elements:");
	 for (int i=0;i<a.length;i++) 
	    {
	        a[i] = s.nextInt();
	      
	    }
	 SecondSmallest e=new SecondSmallest();
		e.getSecondSmallest(a);
		System.out.println("Second Smallest in Array= "+a[1]);
    s.close();
}}
