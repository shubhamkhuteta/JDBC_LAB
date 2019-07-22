package lab2_exercise_1;

public abstract class Item 
{
	private int uid;
	private String title;
	private int copy;
	public int getUid()
	{
		return uid;
	}
	public void setUid(int uid) 
	{
		this.uid = uid;
	}
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public int getCopy() 
	{
		return copy;
	}
	public void setCopy(int copy)
	{
		this.copy = copy;
	}
	
@SuppressWarnings("unused")
public static void main(String args[]) 
{
	System.out.println("This is an Abstract Class");
	System.out.println("------------------------------------");
	Book b=new Book();
	CD c=new CD();
	JournalPaper jp=new JournalPaper();
	Video v=new Video();
   
	}
}
