import java.util.*;
public class UVA10474 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=1;
		while(sc.hasNext()) {
			
			int n=sc.nextInt();
			int q=sc.nextInt();
			if(n==0&&q==0) {
				break;
			}
			System.out.println("CASE# "+t++ +":");
			int []a=new int [10001];
			for(int i=0;i<n;i++) {
				a[sc.nextInt()]++;
			}
			for(int i=0;i<q;i++) {
				int m=sc.nextInt();
				if(a[m]!=0) {
					int sum=0;
					for(int j=0;j<m;j++) {
						sum+=a[j];
					}
					System.out.println(m+" found at "+(sum+1));
				}else {
					System.out.println(m+" not found");
				}
			}
			
		}
	}

}
