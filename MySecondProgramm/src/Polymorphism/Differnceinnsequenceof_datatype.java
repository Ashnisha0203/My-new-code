package Polymorphism;
//Assignment - check the return type 1 is void and 1 is int 
public class Differnceinnsequenceof_datatype {

	
public static void increaseSeatHeight(int var1 , String var2) {  //Method1
		
		System.out.println("Integer" + var1 + " is the 1st parameter");
		
		
		
	}

public static void increaseSeatHeight(String var1 , int var2) {  //Method1
	
	System.out.println("String" + var1 + " is the 1st parameter");
	
	
	
}

	
	public static void main(String[] args) {

		increaseSeatHeight(100 , "I am string variable");
		
		System.out.println("***************");
		
		increaseSeatHeight("I am string variable",1000);

		
	}

}
