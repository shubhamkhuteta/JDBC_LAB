package lab2_exercise_1;

public abstract class Item {
	private int idNum,noOfCopies;
	private String title;
	
	public String toString()
	{
		return "Item [idNum= "+idNum+", noOfCopies= "+noOfCopies+", title= "+title+", getIdNum()= "+getIdNum()+", getNoOfCopies()= "+getNoOfCopies()+", getTitle()= "+getTitle()+", getClass()= "+getClass()+", hashCode()= "+hashCode()+", toString()= "+super.toString()+"]";
	}
	
	Item()
	{
		
	}
	
	Item(int idNum,int noOfCopies,String title)
	{
		this.idNum=idNum;
		this.noOfCopies=noOfCopies;
		this.title=title;
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	void addItem(int idNum,int noOfCopies,String title)
	{
		this.idNum=idNum;
		this.noOfCopies=noOfCopies;
		this.title=title;
	}

}