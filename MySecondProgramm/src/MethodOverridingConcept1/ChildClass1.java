package MethodOverridingConcept1;

public class ChildClass1 extends ParentClass1{

	@Override
public void startEngine() {
		
		System.out.println("This engine is starting - ParentClass1");
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {

		ChildClass1 c =  new ChildClass1();
			c.startEngine();
	
		ParentClass1 d = new ParentClass1();
			d.startEngine();
		
		NewChildClass e = new NewChildClass();
			
			e.startEngine();
			
			//Aeroplane aero = (Aeroplane) new Automobile();
			
			//Will get class cast exception
		
	}

}
