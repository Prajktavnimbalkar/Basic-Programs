package BasicPrograms;
import java.util.Scanner;
import java.util.ArrayList;

public class DigitsOfNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any positive integer :: ");
		int num = scanner.nextInt();
		
		ArrayList<Integer> digitsList = new ArrayList<>();
		while(num > 0){
			int unitDigit = num % 10;
			digitsList.add(0, unitDigit);
			num = num/10;
		}
		
		System.out.println("The digits of the Giver Number : ");
		for(int digit : digitsList)
			System.out.print(digit+" ");
		scanner.close();
	}
}
