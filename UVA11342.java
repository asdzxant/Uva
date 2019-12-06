import java.util.*;

public class UVA11342 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		while(tc-->0) {
			int n = sc.nextInt();
			
			boolean ok = false;
			
			for(int i=0;i*i <= n;i++) {
				for(int j=0;i*i + j*j <= n;j++) {
					int d = n - i*i - j*j;
					
					int sqrt = (int)Math.sqrt(d);
					
					if(sqrt * sqrt == d) {
						ok = true;
						System.out.println(i+ " " + j + " " + sqrt);
						break;
					}
						
				}
				
				if(ok)
					break;
			}
			
			
			if(!ok) {
				System.out.println(-1);
			}
		}
	}

}
