package lab13;

	@FunctionalInterface
	interface trial
	{	
		int  pow(int x,int y);
	}
	public class Ex1 {

	public static void main(String[] args) {
		trial s=(x,y)->{int i=1;
		int t=x;
			for(;i<y;i++) 
			      x=x*t; 
			     return x;
		};
		System.out.println(s.pow(2,5));
	}

	}
