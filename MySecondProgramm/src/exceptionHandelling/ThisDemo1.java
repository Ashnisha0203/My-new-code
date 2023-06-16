package exceptionHandelling;

public class ThisDemo1 {
	
	//instance variables in class level
	  int a;
	 int b;
	
	//Parametrized constructor - 
	
	ThisDemo1(int a , int b){//local variables are always there in a method --
		
		this.a=a;
		this.b=b;//its used to refer the current class instance variable
		
	}
	
	public void demoMethod() {
		
		System.out.println("The value of a is" + a);
		System.out.println("The value of b is " +b);

	}

	public static void main(String[] args) {

		
		ThisDemo1 obj = new ThisDemo1(200,500);
		obj.demoMethod();
		
		
	}

}
