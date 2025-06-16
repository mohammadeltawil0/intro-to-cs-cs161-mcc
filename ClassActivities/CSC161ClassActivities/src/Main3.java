class C {
	 static int i;
	
	 static 
	 {
		 i++;
	 }
	 
	 {
		 ++i;
	 }
}

class D extends C 
{
	static
	{
		--i;
	}
	{
		i--;
	}
}
public class Main3 {
	public static void main(String[] args) {
		System.out.println(new D().i);
	}

}
