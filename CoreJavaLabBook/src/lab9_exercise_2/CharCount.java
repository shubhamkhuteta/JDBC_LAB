package lab9_exercise_2;


import java.util.HashMap;


public class CharCount 
{
	public static void main(String[] args) {
		String s="asdsdf";
		char a[]=s.toCharArray();
		HashMap<Character,Integer> h1=new HashMap<Character,Integer>();
		h1=countChar(a);
		System.out.println(h1);
		}
		private static HashMap<Character,Integer> countChar(char[] a)
		{ HashMap<Character,Integer> h2=new HashMap<Character,Integer>();
		for(char b:a)
		{
		if(h2.containsKey(b))
		h2.put(b, h2.get(b)+1);
		else
		h2.put(b, 1);
		}
		return h2;
		}
}