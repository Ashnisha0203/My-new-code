package MySecondPro;

public class nestedIfElse {

	public static void main(String[] args) {
		
		int age = 30 ;
		int height =60 ;
		
		if (age > 20) {
			
			if (height > 30 ) {
				
				System.out.println("Both the conditions are true --so i am executed");
			}
			else {
				System.out.println("this is nexted else statment ");

			}
			
			
		}
		else {
			System.out.println("both conditions are false  ");

		}

	}

}
