import java.util.*;

public class UVA11461 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean square[] = new boolean[100001];
		
		int p = 1;
		while(p*p <= 100000) {
			square[p*p] = true;
			p++;
		}
		
		while(true) {
			int a = sc.nextInt(), b = sc.nextInt();
			if(a==0 && b==0)
				break;
			
			int cnt = 0;
			for(int i=a;i<=b;i++) {
				if(square[i]) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
			
		}
	}

}
