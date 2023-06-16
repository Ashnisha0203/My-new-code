package keywordsIn;

public class StaticBlockDemo {

	
	static int a = 100;
	static int b;
	
	static {
		
		System.out.println("Initializ static block");
		
		b= a * 200;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Entering the main method");
		System.out.println("The value of a is :" + a );
		System.out.println("The value of a is :" + b );

		

		
		
		
	}

}
