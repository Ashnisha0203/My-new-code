package Polymorphism;
//Method overloading  ----- > //Different number of arguments in parameter list -
public class CarsOverloading_1 {

	
public static void increaseSeatHeight(int heightToIncreaseInInches) {  //Method1
		
		System.out.println("Increase the sseat height by :" + heightToIncreaseInInches + "inches!");
		
		
		
	}
	
public static  void increaseSeatHeight(int heightToIncreaseInInches , boolean rememberheight) { //Method 2
		
		System.out.println("Increase the sseat height by :" + heightToIncreaseInInches + "inches!");
		
		
		if(rememberheight) {
			
			System.out.println("Height is adjusted and saved ");
		}
		else {
			System.out.println("The height is not saved");
		}
		
	}
	
	public static void main(String[] args) {

		increaseSeatHeight(3.9,false);
		
		
	}

}
