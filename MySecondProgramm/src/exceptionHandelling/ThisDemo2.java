//use of this along with show method -
package exceptionHandelling;
//to refer the current class method -->
public class ThisDemo2 {

	public void show() {
		
		
		System.out.println("I am the show method");
		
		System.out.println("I am calling the DISPLAY method");
		
		//this.display();
		
		System.out.println("I am the show mehtod");

	};
		
		public void display() {
			
			System.out.println("I am the display method");
			
			System.out.println("I am the SHOW method");
			
			this.show();

			
		};
		
	
	
	public static void main(String[] args) {

		ThisDemo2 obj1 = new ThisDemo2();
		obj1.display();
		
		
	}

}
