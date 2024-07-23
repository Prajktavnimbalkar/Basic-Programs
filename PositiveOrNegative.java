package BasicPrograms;
import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any integer : ");
		
		int n = scanner.nextInt();
		if(n > 0 )
			System.out.println(n+" is a Positive Number.");
		else if( n < 0 )
			System.out.println(n+" is a Negative Number.");
		else
			System.out.println("Zero is neither Positive nor Negative.");
		
		scanner.close();
	}
}
