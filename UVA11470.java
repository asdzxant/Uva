import java.util.*;

public class UVA11470 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kase = 1;
		while(true) {
			int n = sc.nextInt();
			
			if(n==0)
				break;
			
			int arr[][] = new int[n][n];
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int sum[] = new int[(n+1)/2];
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					int d = Math.min(i, n-1-i);
					d = Math.min(d, j);
					d = Math.min(d, n-1-j);
					
					sum[d] += arr[i][j];
				}
			}
			
			System.out.print("Case "+ kase++ + ":");
			for(int i=0;i<(n+1)/2;i++) {
				System.out.print(" "+sum[i]);
			}
			System.out.println();
			
			
		}
	}

}
