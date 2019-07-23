package lab8_exercise_4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileInfo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name:");
		String fn=sc.nextLine();
		fn+=".txt";
		File f=new File(fn);
		if(f.exists())
		{
			System.out.println("File Exists");
			if(f.canRead())
			{
				System.out.println("File is readable");
			}
			if(f.canWrite())
			{
				System.out.println("File is Writtable");
			}
			System.out.println("Length of the file:"+f.length());
			System.out.println("Type of the file:"+fn.substring(fn.lastIndexOf(".")));
		}
		else
		{
			System.out.println("File does not exists!!!");
		}
		sc.close();
	}
}
