import java.util.*;

public class UVA11344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		while(tc-->0) {
			String str = sc.next();
			char s[] = str.toCharArray();
			
			int n = sc.nextInt();
			
			boolean w = true;
			
			for(int i=0;i<n;i++) {
				int m = sc.nextInt();
				int r = 0;
				
				int p = 1;
				for(int j=s.length-1;j>=0;j--) {
					r += (s[j] - '0') * p % m;
					r %= m;
					
					p *= 10;
					p %= m;
				}
				
				
				if(r!=0) {
					w = false;
				}
			}
			
			if(w) {
				System.out.println(str + " - Wonderful.");
			}
			else {
				System.out.println(str + " - Simple.");
			}
			
		}
	}

}
