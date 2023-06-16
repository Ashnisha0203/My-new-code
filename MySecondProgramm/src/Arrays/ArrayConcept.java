package Arrays;

public class ArrayConcept {

	public static void main(String[] args) {

		String[] Students = new String [5];
		Students[0] = "Ashnisha";
		Students[1] = "Atharva";
		Students[2] = "Himani";
		Students[3] = "Tanu";
		Students[4] = "Tina";
		
int arrayLength = Students.length;

		System.out.println("size of array is :" + arrayLength );

		
		for(int i = 0 ; i < arrayLength ; i++) { 
			
			System.out.println("Names in arrays are :" + Students[i] );

		}

	}

}
