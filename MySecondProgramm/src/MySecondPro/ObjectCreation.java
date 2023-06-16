package MySecondPro;

public class ObjectCreation {
	
	
	int a = 10;
	int b = 20;
	
public void methodAdd() {
		
		int c = a + b;
		
		System.out.println("The result of a + b : " + c);
		//return c;
		
	}
	
public void methodMultiply() {
		
		int c = a * b;
		
		System.out.println("The result of a * b : " + c);
		//return c;
		
	}
	
	public static void main(String[] args) {
		
		ObjectCreation ash = new ObjectCreation();
		
		System.out.println("The value of a is  :  " + ash.a);
		System.out.println("The value of b is  :  " + ash.b);
		
		ash.methodAdd();
		ash.methodMultiply(); //to print the output

		
		
		
		

	}

}
