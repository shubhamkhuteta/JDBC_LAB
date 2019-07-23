package lab8_exercise_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountAll {
	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("new.txt");
		PrintWriter p=new PrintWriter(f);
		p.println("Hello this is java world");
		p.println("Hello World");
		p.close();
		FileReader f1=new FileReader("new.txt");
		BufferedReader b=new BufferedReader(f1);
		int lc=0;
		int wc=0;
		int cc=0;
		String currentLine=b.readLine();
		while(currentLine!=null)
		{
			lc++;
			String[] words= currentLine.split(" ");
			wc=wc+words.length;
			for(String word:words)
			{
				cc=cc+word.length();
			}
			currentLine=b.readLine();
		}
		System.out.println("No of characters in the file:"+cc);
		System.out.println("No of words in the file:"+wc);
		System.out.println("No of lines in the file:"+lc);
	}
}
