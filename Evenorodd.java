package BasicPrograms;
import java.util.Scanner;

	public class Evenorodd {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the any number : ");
			int num = scanner.nextInt();
			if( num % 2 == 0)
				System.out.println("Given number is EVEN");
			else
				System.out.println("Given number is ODD");
			scanner.close();
		}
	}


