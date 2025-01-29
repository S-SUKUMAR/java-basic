import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.out.println(factorial(num));//calling the factorial function

    }
    static int factorial(int n) {
    	// definition of function
    	if(n==0 || n==1)
    		return 1;
    	else 
    		return n*factorial(n-1);// recursing the function
    }
}