package lab8_exercise_6;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DaysDifference {
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Date");
		int day=sc.nextInt();
		System.out.println("Month");
		int month=sc.nextInt();
		System.out.println("Year");
		int year=sc.nextInt();
		LocalDate l=LocalDate.of(year, month, day);
		LocalDate l1=LocalDate.now();
		Period p=Period.between(l, l1);
		System.out.println("Date given by the user: "+day+"."+month+"."+year);
		System.out.println("Current Date: "+LocalDate.now());
		System.out.println("Year: "+p.getDays()+" Month: "+p.getMonths()+" Year: "+p.getYears());
		sc.close();
	}
}
