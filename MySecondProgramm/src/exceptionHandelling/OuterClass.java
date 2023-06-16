package exceptionHandelling;

public class OuterClass {
	
	
	static String str = "Geeky tech bodhi";
	
	int var = 100;

	static class nestedInnerClass{
		
		public static void main(String[] args) {
			
			
			System.out.println("The static variables of outer class is " + str);
			
			//System.out.println("The non static variables of outer class is " + var);
			
		}
		
		
	}
	
	public class NormalInnerclass{
		
         // static void main(String[] args) {
	public void demoMethod2() {
		
		System.out.println("sdsdf"+str);
		System.out.println("dsf"+var);
	}
	
	
}
		
		
		
	
	
	
	
	

}
