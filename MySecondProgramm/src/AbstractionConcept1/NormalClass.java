package AbstractionConcept1;

public class NormalClass extends AbstractClass {
	
	

	public static void main(String[] args) {
		
		NormalClass sc = new NormalClass();
			
			sc.abstractMethod();
			sc.normalMethod();
			sc.concreteMethod();
			
			//ClassA a = new ClassB();-- ---- Some 
	}

	@Override
	public void abstractMethod() {

		System.out.println("this is the abstract method class executed in normal class using override");
		
	}
	
	public void normalMethod() {
		
		System.out.println("This is the normal method in normal class");
		
	}
	

}
