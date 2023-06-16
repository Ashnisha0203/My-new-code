package exceptionHandelling;

public class ExceptionHandellingDemo3 {

	
	
	
	//Exception happens in try block but not handelled in catch block 
	
	
	
	public static void main(String[] args) {
		
		
		try {
			
			String str =  null ;
			System.out.println(str.length());
			
		} 
		
		catch(NullPointerException e) {
			
			System.out.println("sas");
			
			System.out.println(e.getMessage()); //to get the details of the exception

			e.printStackTrace(); //to get the whole error in details 
		}
		
		
		
		
		catch (ArithmeticException e) { //if u dont know which exception is occurs than juzz keep as Exception 
			
			System.out.println("I caught the ArithmeticException here ");
			//System.out.println(e.getMessage());
			
		}
		
		finally {
			
			System.out.println("I am in finally block");
			
		}
System.out.println("I am not the lines of code -- out of try catch block  ");
		
		
		
	}

}
