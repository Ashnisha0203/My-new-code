package exceptionHandelling;

public class Demothrow {

	
	public static void methodA() {
		
		try {
			
			
			throw new ArithmeticException("This is my Demo ArithematicException ");

			
		} catch (ArithmeticException e) {
			
			System.out.println("This is the arithematic exception to be caught ");
			System.out.println(e.getMessage()); //to get the details of the exception
			e.printStackTrace(); //to get the whole error in details 

	
		}
		
		finally {
			
			System.out.println("I am in finally block");
		}
		
		System.out.println("I am out of try-catch finally block ");
		//throw new ArithmeticException("This is my Demo ArithematicException ");
		
	}
	
	
	public static void main(String[] args) {

		methodA();
		
		
	}

}
