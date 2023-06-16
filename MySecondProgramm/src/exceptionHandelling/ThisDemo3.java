package exceptionHandelling;

//To refer the current class constructors 
public class ThisDemo3 {

	
	
	static int a;
	static int b;
	//Default Constructor -
	
	ThisDemo3(){
		
		this(10, 20); //calling the parametrized constructor in default constructor 
		
		System.out.println("I am default constructor ");
	}
	
	//Parameterized cosntructor
	
	ThisDemo3(int a , int b){//local variables are always there in a method --
		
		this.a=a;
		this.b=b;//its used to refer the current class instance variable
		
		System.out.println("I am a parametrized constructor");
	}
	public static void main(String[] args) {
		ThisDemo3 demo = new ThisDemo3();
		System.out.println(a);
		System.out.println(b);

		
	}

}
