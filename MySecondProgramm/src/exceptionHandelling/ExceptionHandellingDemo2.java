package exceptionHandelling;

public class ExceptionHandellingDemo2 {

	public static void main(String[] args) {

		//int [] arr = new int[3];
		
		//arr[0] = 1;
		//arr[1] = 2;
		//arr[2] = 3;
		//arr[3] = 4;

		
		try {
			
			int [] arr = new int[3];
			
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[3] = 4;
			
			//this will not be printed coz the error is at array only so 
			System.out.println("sas");
			
		} catch (Exception ash) { //instead of e we can put any name
			
			System.out.println("Exception caught------Arrayindexoutofbound");
			
			System.out.println(ash.getMessage());//it will send details of the exception
			
		}
		
		finally {
			
			System.out.println("I am in finally block");
			
		}
		
	}

}
