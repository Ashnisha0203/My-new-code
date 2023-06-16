package MySecondPro;

public class ForEachLoopForArrayExample1 {

	public static void main(String[] args) {
        
		int[]number = {1,2,4,6};
		
		for(int numbers:number) {
			
			System.out.println(numbers);
		}
		
		int sum = 0;
		
		for(int i = 0 ; i<number.length;i++) {
			
			sum =sum+ number[i];
			
			//System.out.println("sum is :" + sum);
			
		}

		  System.out.println("sum is :" + sum);
		  
		  
	}
		
		
		
		
		
		
	}


