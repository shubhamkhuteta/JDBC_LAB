package lab3_exercise_3;

import java.util.Scanner;

public class ArrayNo {
	static void reverse(int a[], int n) 
    { 
        int[] b = new int[n]; 
        int j = n; 
        int temp;
        for (int i = 0; i < n; i++) { 
            b[j - 1] = a[i]; 
            j = j - 1; 
        } 
        System.out.println("Reversed array is: \n"); 
        for (int i = 0; i < n; i++) 
        {
        	for (int k = i + 1; k < n; k++) 
        	{
        		if (b[i] > b[k]) 
        		{    temp = b[i];
        			b[i] = b[k];
        			b[k] = temp;
        		}
        	}
        }
        for (int i = 0; i < n - 1; i++) 
        	{
        		System.out.print(b[i] + ",");
        	}
        System.out.print(b[n - 1]);


}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the no of elements in the array");
	int n=s.nextInt();
	int a[] = new int[n];
    System.out.println("Enter the numbers:");
	 for (int i=0;i<a.length;i++) 
	    {
	        a[i] = s.nextInt();
	      
	    }
	 ArrayNo e=new ArrayNo();
		e.reverse(a,a.length);
		s.close();
}
}
