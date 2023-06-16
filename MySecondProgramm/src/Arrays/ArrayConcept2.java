package Arrays;

public class ArrayConcept2 {

	public static void main(String[] args) {
		int[] age  = {10,20,30};
		//simple for loop -->
		for (int i = 0 ; i <age.length ; i ++) {
			
			System.out.println(age[i]);
			
		}
		
		//Advance For loop -- >
		
		for(int arr:age) {
			
			System.out.println("Advanced /enhance for loops ");
			System.out.println("********************************* ");
			System.out.println(arr);

		}
	}

}
