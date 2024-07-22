package BasicPrograms;
import java.util.Scanner;

public class SwapApproach3 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the value for a : ");
			int a = scanner.nextInt();
			System.out.println("Enter the value for b : ");
			int b = scanner.nextInt();
			
			System.out.println("Before swapping a & b : ");
			System.out.println("a = "+a+", b = "+b);
			
			//using ^ (XOR) operators
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
			
			System.out.println("After swapping a & b : ");
			System.out.println("a = "+a+", b = "+b);
			scanner.close();
		}
	}
