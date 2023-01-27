package Day1;

import java.util.Scanner;

public class EmpPayRoll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Basic Pay : ");
		
		double HRA,Da,GrossPay;
		double BasicPay = sc.nextInt();
		
		if(BasicPay >= 5000) {
			 HRA = 0.1*BasicPay;
			 Da = 0.2*BasicPay;
		} else {
			HRA = 0.2*BasicPay;
			Da = 0.3*BasicPay;
		}
		
		
		System.out.println("HRA : "+HRA+ " Da : "+Da);
		System.out.println(BasicPay+HRA+Da);
	}
}

