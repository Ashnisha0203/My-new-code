package encapsulation;

public class CarUser {

	public static void main(String[] args) {

		Car C = new Car();
		C.setBrand("BMW");
		System.out.println("Brand of the car is" + C.getBrand());
		
		C.setColor("Black");
		System.out.println("Color is :" + C.getColor());
		
		C.setModel("R3");
		System.out.println("model is :" + C.getModel());
		
		C.setYearOfMfg(2023);
		System.out.println("model is :" + C.getYearOfMfg());
		
	}
	
	

}
