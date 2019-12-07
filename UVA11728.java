import java.util.*;

public class UVA11728 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s[] = new int[1001];
		Arrays.fill(s, -1);
		
		for(int i=1;i<=1000;i++) {
			int sum = 0;
			for(int j=1;j<=i;j++) {
				if(i % j == 0) {
					sum += j;
				}
			}
			
			if(sum <= 1000)
				s[sum] = i;
		}
		
		int kase = 1;
		while(true) {
			int n = sc.nextInt();
			
			if(n==0)
				break;
			
			System.out.printf("Case %d: %d\n", kase++, s[n]);
		}
	}

}
