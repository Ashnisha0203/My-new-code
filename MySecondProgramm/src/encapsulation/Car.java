package encapsulation;

public class Car {
	
	private String brand; // instance variables all
	
	private String model;
	
	private String color;
	
	private int  yearOfMfg;
	
	
	public void funMethod() {
		
		System.out.println("TimePass");
	}
//**********************************************
	public String getBrand() { //Fetch value
		return brand;
	}

	public void setBrand(String brand) { //Set value
		this.brand = brand;
	}
//**********************************************
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	//**********************************************
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//**********************************************
	public int getYearOfMfg() {
		return yearOfMfg;
	}

	public void setYearOfMfg(int yearOfMfg) {
		this.yearOfMfg = yearOfMfg;
	}
	//**********************************************

	//public static void main(String[] args) {
	

	}


