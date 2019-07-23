package lab8_exercise_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LineNumber {
	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("new.txt");
		BufferedReader b=new BufferedReader(f);
		int i=1;
		String line=b.readLine();
		while(line!=null)
		{
		System.out.println(i+" "+line);
		line=b.readLine();
		i++;
		}
		b.close();
		f.close();
		}
}
