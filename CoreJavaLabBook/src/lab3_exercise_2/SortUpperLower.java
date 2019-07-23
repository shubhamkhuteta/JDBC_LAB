package lab3_exercise_2;

import java.util.Arrays;
import java.util.Scanner;

public class SortUpperLower {
	 public static String sortString(String inputString) 
	    { 
	        // convert input string to char array 
	        char tempArray[] = inputString.toCharArray(); 
	          
	        // sort tempArray 
	        Arrays.sort(tempArray); 
	          
	        // return new sorted string 
	        return new String(tempArray); 
	    } 
	      

	public static void main(String[] args) 
 {
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    str=sc.nextLine();
    str=sortString(str);
    int n=str.length();
    String str2="";
    String str3="";
    String str4="";
    String str5="";
    String s1=null,s2=null;
    String s3=null,s4=null;
    
    if(n%2==0)
    {
 	   for(int i=0;i<n;i++)
 	   {
 		   if(i<n/2)
 		   {
 			   str2+=str.charAt(i);
 				s1=str2.toUpperCase();	      
 		   }
 		   else
 		   {
 			   str3+=str.charAt(i);
 			   s2=str3.toLowerCase();
 		   }
 	   }
 	   System.out.println(s1);
 	   System.out.println(s2);
    }
    else
    {
 	   for(int i=0;i<n;i++)
 	   {
 		   if(i<n/2+1)
 		   {
 			   str4+=str.charAt(i);
 		   s3=str4.toUpperCase();
 		   }
 		   else
 		   {
 			   str5+=str.charAt(i);
 			   s4=str5.toLowerCase();
 		   }
 	   }
 		   System.out.println(s3);
 		   System.out.println(s4);

    }
    sc.close();
}
	
}
