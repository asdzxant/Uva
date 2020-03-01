import java.util.*;
public class UVA10346 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int count=n;
			while(n>=k) {
				count+=n/k;
				int a=n%k;
				n=n/k+a;
			}
			System.out.println(count);
		}
		
	}
}
