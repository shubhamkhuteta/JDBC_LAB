package lab2_exercise_1;

public class WrittenItem extends Item 
{
private String author;

public String getAuthor() 
{
	return author;
}

public void setAuthor(String author)
{
	this.author = author;
}
public WrittenItem() 
{
	System.out.println("This is a Written Item");
}
}
