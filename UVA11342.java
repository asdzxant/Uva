import java.util.*;

public class UVA11342 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ans[][] = new int[50001][4];
		
		for(int i=0;i*i <= 50000;i++) {
			for(int j=i;i*i + j*j <= 50000;j++) {
				for(int k=j;i*i + j*j + k*k <= 50000 ;k++) {
					int sum = i*i + j*j + k*k;
					if(ans[sum][0] == 0) {
						ans[sum][0] = 1;
						ans[sum][1] = i;
						ans[sum][2] = j;
						ans[sum][3] = k;
					}
				}
			}
		}
		
		int tc = sc.nextInt();
		while(tc-->0) {
			int n = sc.nextInt();
			
			if(ans[n][0] == 1) {
				System.out.println(ans[n][1] + " " +ans[n][2] + " " +ans[n][3]);
			}
			else {
				System.out.println(-1);
			}
		}
	}

}
