class A{
	static String s ="AAA";
	
	static
	{
		s = s + "BBB";
	}
	
	{
		s = "AAABBB";
	}
}

class B extends A {
	static {
		s = s + "BBBAAA";
	}
	
	{
		System.out.println(s);
	}
}
public class MaincClass {
	public static void main(String[] args) {
		B b = new B();
	}
}
