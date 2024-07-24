package BasicPrograms;
import java.util.Scanner;

public class Leapyear {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a year :: ");
			int year = scanner.nextInt();
			
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				System.out.println("YES LEAP YEAR!");
			else
				System.out.println("No its not leap year.");
			
			scanner.close();
		}
	}
