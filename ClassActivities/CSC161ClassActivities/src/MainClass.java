class M {
	int i = 51;
	public M(int j)
	{ 
		System.out.println(i);
		this.i = j*10;
	}
	
}

class N extends M {
	public N(int j) {
		super(j);
		System.out.println(i);
		this.i = j*20;
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			N n = new N(26);
			
			System.out.println(n.i);
	}

}
