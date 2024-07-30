package BasicPrograms;
import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter any number :: ");
		int N = Integer.parseInt(scanner.nextLine().trim());
		int tempN = N;
		int sum = 0;
		while( N > 0){
			int lastDigit = N %10;
			sum += lastDigit;
			N = N /10;
		}
		System.out.println("Sum of digits of "+tempN+" is :: "+sum);
		scanner.close();
	}

}
