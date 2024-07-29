package BasicPrograms;
import java.util.Scanner;
public class FactorsOfANumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any positive integer :: ");
		int num = scanner.nextInt();
		
		System.out.println("The factors of the given number are :");
		printFactors(num);
		scanner.close();
	}
	
	private static void printFactors(int num){
		for(int i=1;i<=num/2;i++){
			if(num % i == 0)
				System.out.print(i+", ");
		}
		System.out.print(num);
	}
}
