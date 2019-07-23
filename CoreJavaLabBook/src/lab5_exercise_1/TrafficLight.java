package lab5_exercise_1;

import java.util.Scanner;
class TrafficLightTest extends Exception{
	private String color;
	public TrafficLightTest(String color )
	{	System.out.println("Enter a valid color");
	}
}
public class TrafficLight {
	static void ColorEx(String color) throws TrafficLightTest
	{
		switch(color)
		{
		case "red":
			System.out.println("STOP....!!!!");
			break;
		case "yellow":
			System.out.println("READY...!!!!");
			break;
		case "green":
			System.out.println("GO...!!!!");
			break;
		default:
			throw new TrafficLightTest(color);
		}
	}
	public static void main(String[] args) throws TrafficLightTest {
		String color;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a colour(red/yellow/green):");
		color=sc.next();
		TrafficLight.ColorEx(color);
		sc.close();
	}
}