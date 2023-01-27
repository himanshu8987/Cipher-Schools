package polymorphism;

  
public class AdditionTask {
	 void sum(int n1,int n2) {
		 System.out.println(n1+n2);
	   }
	   
	   void sum(int n1,int n2,int n3) {
		   System.out.println(n1+n2+n3);
	   }
	   
	   void sum(int n1,float n2) {
		   System.out.println(n1+n2);
	   }
	
	public static void main(String[] args) {
		AdditionTask summation = new AdditionTask();
		summation.sum(3, 5);
		summation.sum(3,5,6);
		summation.sum(5, 3.6f);
	}

}
