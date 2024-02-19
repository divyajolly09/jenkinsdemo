package aggrigation1;

import aggrigation.College;

public class Details {
	String dpt;
	College add;
	public Details(String dpt,College add)
	{
		this.dpt=dpt;
		this.add=add;
	}
   public void display()
   {
	   System.out.println(add.name+" "+add.rollno+" ");
	   System.out.println("department: "+dpt);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College c=new College("divya",5);
		Details d=new Details("cse",c);
		d.display();
		

	}

}
