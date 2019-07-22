package lab2_exercise_1;
public class MediaItem extends Item
{
	public MediaItem()
	{
		System.out.println("This is a MediaItem");
	}
private int runtime;

public int getRuntime() 
{
	return runtime;
}

public void setRuntime(int runtime) 
{
	this.runtime = runtime;
}
}
