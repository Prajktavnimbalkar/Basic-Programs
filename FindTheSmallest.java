package BasicPrograms;
import java.util.Scanner;

public class FindTheSmallest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of a ::");
		int a = scanner.nextInt();
		System.out.println("Enter the value of b ::");
		int b = scanner.nextInt();
		System.out.println("Enter the value of c ::");
		int c = scanner.nextInt();
		int smallest = findTheSamllest(a, b, c);
		System.out.println("The smallest of a,b,c is :: "+smallest);
		scanner.close();
	}
	
	public static int findTheSamllest(int a,int b,int c){
		if( a/b == 0){
			//here a is smaller than b
			if( c/a == 0){
				//here c is smaller than a
				return c;
			}
			else{
				//here a is smaller than c
				return a;
			}
		}else{
			//here b is smaller a
			if( c/b == 0){
				//here c is smaller than b
				return c;
			}
			else{
				//here b is smaller than c
				return b;
			}
		}
	}
}
