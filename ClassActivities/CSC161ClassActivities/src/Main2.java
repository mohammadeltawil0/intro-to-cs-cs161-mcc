class Class1 {
	static int i =111;
	int j =222;
	
	{
		i = i++ - ++j;
	}
}

class Class2 extends Class1 {
	{
		j = i-- + --j;
	}
}
public class Main2 {

	public static void main(String[] args) {
			System.out.println(i);
	}

}
