package Day1;


import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("+ve");
		} 
		else if(num==0) {
			System.out.println("Neutral");
		} else {
			System.out.println("-ve");
		}
	}

}
