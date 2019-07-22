package lab2_exercise_1;

public class Book extends WrittenItem 
{
public Book()
{
	System.out.println("Core Java Book");
	setAuthor("Kishore Kumaar");
	setUid(543);
	setTitle("Basics of Java");
	setCopy(16);
	display();
}
public void display() 
{
	System.out.println("The Name of the Book is "+getTitle());
	System.out.println("The Name of the Author is "+getAuthor());
	System.out.println("The ID of the Book is "+getUid());
	System.out.println("No.of Copies available are "+getCopy());
	System.out.println("------------------------------------");
}
}
