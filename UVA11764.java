import java.util.*;

public class UVA11764 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		int kase = 1;
		
		while(tc-->0) {
			int n = sc.nextInt();
			
			int h[] = new int[n];
			
			for(int i=0;i<n;i++) {
				h[i] = sc.nextInt();
			}
			
			int high = 0, low = 0;
			for(int i=0;i<n-1;i++) {
				if(h[i+1] > h[i]) {
					high++;
				}
				else if(h[i+1] < h[i]) {
					low++;
				}
			}
			
			System.out.printf("Case %d: %d %d\n", kase++, high, low);
		}
	}

}
