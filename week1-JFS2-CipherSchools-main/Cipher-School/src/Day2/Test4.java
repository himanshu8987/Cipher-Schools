package Day2;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Title: How Long is Burrrp ?
		// Ask the user to enter an Integer(burp Length)
		
		// Depending on the input 'Burp' will be produced
		
		// Eg. 4 : 'Burrrrp'
		//     5 : 'Burrrrrp'
		Scanner sc = new Scanner(System.in);
		System.out.println("How Long is your Burp");
		int burpLength = sc.nextInt();
		
		String msg = "";
		
		for(int i=1;i<=burpLength;i++) {
			msg = msg+"r";
		}
		System.out.println("Bu"+msg+"p");

	}

}

