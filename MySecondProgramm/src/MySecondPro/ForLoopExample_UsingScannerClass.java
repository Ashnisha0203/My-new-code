package MySecondPro;
import java.util.*;
public class ForLoopExample_UsingScannerClass {

	public static void main(String[] args) {
System.out.println("Give any random number");
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		
		for(int i = 0;i<=n;i++) {
			sum = sum + i;
			
			//System.out.println();
		}
		System.out.println("sum of all given number is "+sum);


	}

}
