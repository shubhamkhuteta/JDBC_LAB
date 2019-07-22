package concurrentthread;

import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


class EmpBean {
	int id;
	int sal;
	String name;

	public EmpBean(int id, int sal, String name) {
		super();
		this.id = id;
		this.sal = sal;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Id : "+id+" Name : "+name+" Salary : "+sal;
	}
	
}

public class CHM {
	public static void main(String[] args) {



		ConcurrentHashMap<Integer, EmpBean> chm  = new ConcurrentHashMap<Integer,EmpBean>();
		
		chm.put(1, new EmpBean(65, 2000, "Shubham"));
		chm.put(2, new EmpBean(45, 5222, "Sanskar"));
		chm.put(3, new EmpBean(13, 2300, "Shubham"));
		chm.put(4, new EmpBean(89, 2000, "Raghav"));
		
		Set<Entry<Integer,EmpBean>> s = chm.entrySet();
		s.stream().forEach(e->System.out.println("Keys : "+e.getKey()+""+""+" Values : "+e.getValue()));
	}
}

