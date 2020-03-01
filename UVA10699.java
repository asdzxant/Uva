import java.util.*;
public class UVA10699 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			if(n==0) {
				break;
			}
			System.out.print(n+" : ");
			Set<Integer> s=new TreeSet<Integer>();
			int i=2;
			
			while(n!=1) {
				if(n%i==0) {
					n/=i;
					s.add(i);
				}else {
					i+=1;
				}
			}
			System.out.println(s.size());
			
		}
	}
}
