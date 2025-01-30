package conditional;
import java.util.*;
public class special_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++) {
        	if(!(Character.isLetterOrDigit(s.charAt(i))) && !(Character.isWhitespace(s.charAt(i)))) {
        		count+=1;
        	}
	}
System.out.println(count);
}}
