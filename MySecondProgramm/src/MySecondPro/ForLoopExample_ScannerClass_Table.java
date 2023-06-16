package MySecondPro;
import java.util.*;
public class ForLoopExample_ScannerClass_Table {

	public static void main(String[] args) {
		System.out.println("Give any random number to print the table");

		Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();

				//System.out.println("Give any random number to print the table");
				for (int i = 1;i<=10;i++) {
					
					System.out.println("" + i*n);
				}
			
	}

}
