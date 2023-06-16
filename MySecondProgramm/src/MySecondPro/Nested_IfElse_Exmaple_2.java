package MySecondPro;

public class Nested_IfElse_Exmaple_2 {

	public static void main(String[] args) {

		
		int num1 = 24;
		
		if(num1 % 2 == 0) {
			
			
			System.out.println("Number is  even ");
		}
		
		if(num1 %6 == 0) {
			System.out.println("and is  dividible by 6 ");

			
		}
		
		else {
			System.out.println("and is not dividible by 6 ");
		}
	}
	
		else {
			
			System.out.println("Odd number ");
			if(num1%3==0) {
				
				System.out.println("and divisible by 3 ");


			
		}
			else {
				System.out.println("and not divisible by 3 ");

				
			}
		
	}

}
}