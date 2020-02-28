import java.util.*;
public class UVA10300 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int kase = sc.nextInt();
			for(int k = 0 ; k<kase ; k++) {
				int f = sc.nextInt();
				long res = 0;
				for(int i = 0 ; i<f; i++) {
					long a = sc.nextLong();
					long b = sc.nextLong();
					long c = sc.nextLong();
					res+=(a*c);
				}
				System.out.println(res);
			}
		}
	}
}
