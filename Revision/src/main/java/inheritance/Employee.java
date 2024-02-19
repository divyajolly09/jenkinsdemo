package inheritance;
import java.util.*;
public class Employee {
	int bp;
	int deduction;
	int bonus;
	public void payslip()
	{
	Scanner obj=new Scanner(System.in);
	System.out.println(" basic pay\n deduction\n bonous\n");
	bp=obj.nextInt();
	deduction=obj.nextInt();
	bonus=obj.nextInt();
	}
	}
