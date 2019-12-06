import java.util.*;

public class UVA11689 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		while(tc-->0) {
			int e = sc.nextInt(), f = sc.nextInt(), c = sc.nextInt();
			
			int empty = e+f;
			int ans = 0;
			
			while(empty >= c) {
				ans += empty / c;
				empty = empty % c + empty / c;
			}
			
			System.out.println(ans);
		
		}
	}

}
