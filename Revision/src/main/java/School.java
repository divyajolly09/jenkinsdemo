
public class School implements Upcasting {

	@Override
	public void display() {
		System.out.println("joseph");
		// TODO Auto-generated method stub

	}
   public void  display2()
   {
	   System.out.println("divya");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Upcasting s=new School();
		s.display();
		//s.display2();

	}

}
