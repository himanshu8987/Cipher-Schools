package Day2;
import java.util.*;

public class SwitchCaseTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Get user division and print rank
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Division");
		int div = sc.nextInt();
		
		switch(div) {
		case 1:
			
				System.out.println("First Rank");
			break;
			
		case 2:
			
				System.out.println("Second Rank");
			break;

		case 3:
			
				System.out.println("Third Rank");
			break;

		
		
		default :
			System.out.println("No Rank");
break;
	}

}
}
