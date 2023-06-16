package exceptionHandelling;

public class SuperDemoChild extends SuperDemoParent{

	
	SuperDemoChild(){
		
		super();

		System.out.println("I am constructor of child class");
		
		//super();
		
		
	}
	
	int b = 100 * super.a;
	
	public void methodChildClass() {
super.methodParent();

System.out.println("I am methodChildClass of ");
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperDemoChild c = new SuperDemoChild();
		c.methodChildClass();
		System.out.println("The value of variable is " + c.b);

	}

}
