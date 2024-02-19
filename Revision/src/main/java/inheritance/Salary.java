package inheritance;

public class Salary extends Calculation {
	int totalsalary;
	public void salary()
	{
		totalsalary=(bp+hra+bonus)-(pf-deduction);
		System.out.println("PAY SLIP");
		System.out.println("Basic pay: "+bp);
		System.out.println("Deduction: "+deduction);
		System.out.println("Bonus: "+bonus);
		System.out.println("Hra: "+hra);
		System.out.println("Pf: "+pf);
		System.out.println("totalsalary: "+totalsalary);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s=new Salary();
		s.payslip();
		s.calc();
		s.salary();

	}

}
