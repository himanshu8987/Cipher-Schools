package polymorphism;

public class Poly {

	
	void add(int num1,int num2) {
		System.out.println(num1+num2);
	}
	

	void add(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	
	void add(int num1,float num2) {
		System.out.println(num1+num2);
	}
	
	void add(float num1,int num2) {
		System.out.println(num1+num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly p = new Poly();
		p.add(12.2f,300);
		System.out.println();

	}

}
