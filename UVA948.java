import java.util.*;

public class UVA948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		int fib[] = new int[40];
		fib[1] = 1;
		for(int i=2;i<40;i++) {
			fib[i] = fib[i-2] + fib[i-1];
		}
		
		while(tc-->0) {
			int n = sc.nextInt();
			
			int p = 39;
			while(fib[p] > n) {
				p--;
			}
			
			
			System.out.printf("%d = ", n);
			for(int i=p;i>=2;i--){
				if(fib[i] <= n) {
					System.out.print(1);
					n -= fib[i];
				}
				else {
					System.out.print(0);
				}
			}
			System.out.println(" (fib)");
			
		}
	}

}
