import java.util.*;
public class UVA10235 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int [] prime = new int[1000001];
		for(int i = 2 ; i<=1000000/2; i++) {
			for(int j = i; j<=1000000; j++) {
				if(i*j > 1000000 || i*j < 0)break;
				prime[i*j] = -1;
			}
		}
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(prime[n] != -1) {
				String s ="";
				int reverse = 0;
				for(int i = Integer.toString(n).length()-1 ; i>=0; i--) {
					s+=Integer.toString(n).charAt(i);
				}
				reverse = Integer.parseInt(s);
				if(prime[reverse]!=-1 && reverse != n)System.out.println(n+" is emirp.");
				else System.out.println(n+" is prime.");
			}
			else {
				System.out.println(n+" is not prime.");
			}
		}
	}
}
