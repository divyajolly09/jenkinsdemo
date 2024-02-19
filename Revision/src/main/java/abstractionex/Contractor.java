package abstractionex;

import inheritance.Employee;
import java.util.*;

public class Contractor extends Employee {
	int workinghour;
	int fultimehour=8;
	int salary=500;
	
 public void calculatesalary()
{
	 Scanner s=new Scanner(System.in);
	 workinghour=s.nextInt();
	 System.out.println("salary of contract based employee: "+(salary*workinghour));
	 System.out.println("salary of fultime employee: "+(salary*fultimehour));
	 
	 
}
 public static void main(String[] args) {
		// TODO Auto-generated method stub
     Contractor c=new Contractor();
     c.calculatesalary();
	}

}
