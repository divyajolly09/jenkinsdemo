package revision;
import java.util.Scanner;

public class Hdfc implements Rbi{
	static int amount;
	int year;
	int roi;
	static int total;
	static int intrest;
public void reccuringDeposit()
{
	roi=9;
	year=8;
	intrest=(amount*year*roi)/100;
	System.out.println("Intrest: "+intrest);
	total=amount+intrest;
	System.out.println("the amout get after deposit: "+total);
	// TODO Auto-generated method stub
}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amout do you want to deposit: ");
		amount=s.nextInt();
		Hdfc f=new Hdfc();
		f.reccuringDeposit();
		
		

	}

}
