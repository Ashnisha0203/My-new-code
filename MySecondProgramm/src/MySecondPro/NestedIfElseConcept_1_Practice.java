package MySecondPro;

public class NestedIfElseConcept_1_Practice {

	public static void main(String[] args) {

		int age = 23;
		int weight = 65;
		
		System.out.println("Age is :" + age);
		System.out.println("weight is :" + weight);

		if(age>18) {
			
			if(weight>50) {
				
				System.out.println("You are eligible to donate blood ");
			}
			
			else {
				
				System.out.println("Not eligible to donate blood ");
			}
			else {
				
				System.out.println("Age must be greter than 18 ");
			}
		}
		
	}

}
