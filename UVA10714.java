import java.util.*;
public class UVA10714 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int L=sc.nextInt();
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			int max=0;
			int min=0;
			for(int i=0;i<n;i++) {
				int maT=Math.max(L-a[i],a[i]);
				int miT=Math.min(L-a[i],a[i]);
				max=Math.max(maT,max);
				min=Math.max(miT,min);
			}
			System.out.println(min+" "+max);
		 	
		}
	}

}
