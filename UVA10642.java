import java.util.*;
public class UVA10642 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int n=1;
		while(T-->0) {
			System.out.print("Case "+ n++ +": ");
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			
			long cotOne=0;
			long cotTwo=0;
			for(int i=0;i<=(x1+y1);i++) {
				cotOne+=i;
			}
			cotOne+=x1;
			
			for(int i=0;i<=(x2+y2);i++) {
				cotTwo+=i;
			}
			cotTwo+=x2;
			//System.out.println("F:"+cotOne+" S: "+cotTwo);
			System.out.println(cotTwo-cotOne);
		}
	}
	

}
