import java.util.*;
public class UVA10370 {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int n=sc.nextInt();
			int a[]=new int[n];
			int sum=0;
			double count=0;
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				sum+=a[i];
			}
			double average=sum/n;
			for(int i=0;i<n;i++) {
				if(a[i]>average) {
					count++;
				}
			}
			
			System.out.printf("%.3f",(count/n*100));
			System.out.println("%");
			
		}
	}
}
