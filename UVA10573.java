import java.util.*;
public class UVA10573 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		double PI=2*Math.acos(0);
		double a=0;
		while(T-->0) {
			String s[]=sc.nextLine().split(" ");
			if(s.length==2) {
				double c1=Double.parseDouble(s[0]);
				double c2=Double.parseDouble(s[1]);
				double th=c1+c2;
				//System.out.println(th);
				a=(Math.pow(th,2)-Math.pow(c1,2)-Math.pow(c2,2))*PI;
				System.out.printf("%.4f",a);
				
			}else if(s.length==1) {
				double r=Double.parseDouble(s[0]);
				a=Math.pow(r,2)*Math.PI/8;
				System.out.printf("%.4f",a);
			}
			System.out.println();
		}
	}

}
