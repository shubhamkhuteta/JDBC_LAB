package lab13;
interface Printable
{  
    void print();  
}  
public class Ex4 
{  
	int empid;
	String empname;
	public Ex4() 
	{
	
	}
  public Ex4(int empid, String empname) 
    {
		this.empid=empid;
		this.empname=empname;
	}
    public void saySomething()
    {  
        System.out.println("Hello, this is class with main");  
    }  
    public int getempId() 
    {
		return empid;
	}
    public void setempId(int empid)
	{
		this.empid =empid;
	}
    public String getempName() 
	{
		return empname;
	}
    public void setempName(String empname)
	{
		this.empname =empname;
	} 
	public static void main(String[] args) 
	{  
        Ex4 methodReference = new Ex4(); 
        Printable printable = methodReference::saySomething;  
        printable.print();  
      }
}  