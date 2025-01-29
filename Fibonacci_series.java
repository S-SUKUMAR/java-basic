// FIBANOCCI SERIES
import java.util.Scanner;
public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of series:");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=0;i<n/2;i++) {
			System.out.println(a);
			System.out.println(b);
			a=a+b;
			b=a+b;
			
		}
	}

}
