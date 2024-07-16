package BasicPrograms;
import java.util.Scanner;

public class Factorialusingrecursion {
		
		public static int factorial(int n){
			if(n == 1)
				return 1;
			//n * (n-1)!
			return n * factorial(n-1);
		}
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the any number : ");
			int N = scanner.nextInt();
			
			int result = factorial(N);
			
			System.out.println("Factorial of "+N+" is ");
			System.out.println(result);
			
			scanner.close();
		}
	}
