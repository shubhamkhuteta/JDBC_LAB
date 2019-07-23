package lab9_exercise_1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

class Arrayss{
	int id;
	String name;
	public Arrayss(int aid,String aname) {
		// TODO Auto-generated constructor stub
		id=aid;
		name=aname;
	}
	public String toString()
	{
		return "[id=" +id+",name="+name+"]";
	}
}
public class HashSortinList {
	ArrayList<Arrayss> getvalues(HashMap<Integer, Arrayss> mp)
	{
		Collection<Arrayss> values=mp.values();
		ArrayList<Arrayss> lists=new ArrayList<Arrayss>(values);
		return lists;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		HashSortinList e=new HashSortinList();
		Arrayss e1=new Arrayss(12, "Kishore");
		Arrayss e2=new Arrayss(13, "Kumaar");
		Arrayss e3=new Arrayss(11, "Bala");
		HashMap<Integer,Arrayss> hm=new HashMap<Integer,Arrayss>();
		hm.put(1, e1);
		hm.put(2, e2);
		hm.put(3, e3);
		System.out.println(e.getvalues(hm));
		s.close();
	}
}
