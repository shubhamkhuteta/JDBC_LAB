package lab2_exercise_1;
public class JournalPaper extends WrittenItem 
{
private int pub_year;
public JournalPaper() 
{
	System.out.println("This is a Journal Paper");
	setAuthor("Kentucky");
	setUid(2567);
	setTitle("Spam Detection");
	setCopy(16);
	setPub_year(2018);
	display();
	
}

public int getPub_year() 
{
	return pub_year;
}

public void setPub_year(int pub_year) 
{
	this.pub_year = pub_year;
}
public void display()
{
	System.out.println("The Name of the Paper is "+getTitle());
	System.out.println("The Name of the Author is "+getAuthor());
	System.out.println("The ID of the Paper is "+getUid());
	System.out.println("No.of Copies available is "+getCopy());
	System.out.println("The Year is "+getPub_year());
	System.out.println("------------------------------------");
	
}
}
