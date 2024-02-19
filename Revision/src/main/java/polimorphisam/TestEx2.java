package polimorphisam;

public class TestEx2 extends TestEx {
	public int TestEx(int a,int b)
	{
		System.out.println(super.TextEx(a,b));
		return(a-b);
	}

	public static void main(String[] args) {
		TestEx2 e=new TestEx2();
		System.out.println(e.TestEx(7,7));
		
		// TODO Auto-generated method stub

	}

}
