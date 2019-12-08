import java.util.*;

public class UVA299 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		while(tc-->0) {
			int n = sc.nextInt();
			
			int a[] = new int[n];
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
			}
			
			int cnt = 0;
			for(int i=0;i<n-1;i++) {
				for(int j=n-2;j>=i;j--) {
					if(a[j] > a[j+1]) {
						int tmp = a[j];
						a[j] = a[j+1];
						a[j+1] = tmp;
						cnt++;
					}
				}
			}
			
			System.out.printf("Optimal train swapping takes %d swaps.\n", cnt);
		}
	}

}
