import java.util.*;

public class UVA11332 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			
			if(n==0)
				break;
			
			while(n>=10) {
				n = f(n);
			}
			
			System.out.println(n);
		}
	}
	
	static int f(int n) {
		int dsum = 0;
		while(n>0) {
			dsum += n % 10;
			n /= 10;
		}
		
		return dsum;
	}
}
