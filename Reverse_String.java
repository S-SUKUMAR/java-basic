public class Reverse_String {

	public static void main(String[] args) {
		String s1="hello";
		String reversestring="";
		for(int i=s1.length()-1;i>=0;i--)// iterating from last 
		{
			char ch=s1.charAt(i);  
			reversestring+=ch;     // reversing the string
						
		}
		System.out.println(reversestring);
	}

}