package conditional;

public class harshad_number {

	public static void main(String[] args) {
		int r,sum=0;
		int x=18;
        while(x!=0){
            r=x%10;
            sum+=r;
            x/=10;
        }
        System.out.println(sum);
        System.out.println(x);
        if(x%sum==0){
           System.out.println(sum);
	}
        else {
        	System.out.println(-1);
        }

}
}