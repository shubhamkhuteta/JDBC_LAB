package lab2_exercise_1;

public class Video extends MediaItem 
{
	private String director;
	private int year;
	private String genre;
	public String getDirector() 
	{
		return director;
	}
	public void setDirector(String director)
	{
		this.director = director;
	}
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	public String getGenre() 
	{
		return genre;
	}
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	public Video()
	{
		System.out.println("This is a Video");
		setDirector("GVM");
		setUid(78953);
		setTitle("ENPT");
		setCopy(1);
		setGenre("Thriller");
		display();
	}
	public void display() 
	{
		System.out.println("The Name of the Video is "+getTitle());
		System.out.println("The Name of the Director is "+getDirector());
		System.out.println("The ID of the Video is "+getUid());
		System.out.println("No.of Videos available are "+getCopy());
		System.out.println("The Genre is "+getGenre());
		System.out.println("------------------------------------");
		
	}
}
