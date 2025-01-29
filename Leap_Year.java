import java.util.Scanner;
public class Leap_Year {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Year:");
	        int yr=sc.nextInt();
	        if(yr%4==0 && (yr%100!=0 || yr%400==0)) // leap year condition
	        	System.out.println(yr+" is a Leap Year");
	        else
	        	System.out.println(yr+" is Not Leap Year");

	}

}
