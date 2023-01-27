package Inheritance;

public class Furniture {
	
	int width;
	int height;
	
	void display(String item) {
		System.out.println(item +" width "+width+" Height "+height);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chair neelKamal = new  Chair();
		neelKamal.foo();
	}

	}
class Chair extends Furniture{
		void foo() {
			width=10;
			height=20;
			display("Chair");
		}
	}
	
	class Table extends Furniture{
		void foo() {
			width=30;
			height=50;
			display("Table");
		}
	}
	
	class Almira extends Furniture{
		void foo() {
			width=10;
			height=30;
			display("Almira");
		}
	}


