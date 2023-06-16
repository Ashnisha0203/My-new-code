package MySecondPro;

public class ConstructorConcept {
	
//Default constructor - Does not have any parameters 	
	public ConstructorConcept() {
		
		System.out.println("This is default constructor");
	}
	
//Parameterized constructor for integer-
	
public ConstructorConcept(int a ,int b) {
		
		System.out.println(a);
		System.out.println(b);

	}
	
//Parameterized constructor for string-

public ConstructorConcept(String name ) {
		
		System.out.println(name);
	}
	
	
	






	public static void main(String[] args) {
		
		ConstructorConcept ashnisha = new ConstructorConcept();
		ConstructorConcept second  = new ConstructorConcept(100,400);
		ConstructorConcept third  = new ConstructorConcept("Ashu");


		

	}

}
