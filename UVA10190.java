import java.util.*;
public class UVA10190 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(m == 0 || m == 1 || n == 0) {
				System.out.println("Boring!");
				continue;
			}
			String res = n+"";
			boolean b = false;
			while(n!=1) {
				if(n%m == 0) {
					res+=" "+(n/m)+"";
					n/=m;
				}
				else {
					b = true;
					break;
				}
			}
			if(res.equals(("1"))) b = true;
			if(b) {
				System.out.println("Boring!");
			}
			else System.out.println(res);
		}
	}
}
