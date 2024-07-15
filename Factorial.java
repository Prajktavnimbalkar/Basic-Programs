package BasicPrograms;
import java.util.Scanner;

public class Factorial {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the any number : ");
			int N = scanner.nextInt();
			
			int result =1;
			for(int i=1; i<=N; i++)
				result = result * i;
			
			System.out.print("Factorial of "+N);
			System.out.print(" is "+result);
			scanner.close();
		}
	}
