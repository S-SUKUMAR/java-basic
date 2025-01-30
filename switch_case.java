package conditional;

import java.util.Scanner;
public class switch_case {

	public static void main(String[] args) {
		int count=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first integer");
		int a=s.nextInt();
		System.out.println("Enter the second number integer");
		int b=s.nextInt();
		while(count==1){
			System.out.println("Enter the operator + - * /");
			char c=s.next().charAt(0);
		switch(c) {
		case '+':
			System.out.println(a+" + "+b+" = "+a+b);count+=1;break;
		case '-':
			System.out.println(a+" - "+b+" = "+ (a-b));count+=1;break;
		case '*':
			System.out.println(a+" * "+b+" = "+a*b);count+=1;break;
		case '/':
			System.out.println(a+" / "+b+" = "+a/b);count+=1;break;
		default:
			System.out.println("Enter the valid operator");
			break;	
		}

	}

}}
