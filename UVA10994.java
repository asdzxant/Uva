import java.util.*;

public class UVA10994 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int p = sc.nextInt();
			int q = sc.nextInt();
			
			if(p<0 && q<0)
				break;
				
			long sp = s(p-1);
			long sq = s(q);
			
			System.out.println(sq-sp);
		}
	}
	
	static long s(int n){
		long sum = 0;
		while(n>0){
			int q = n / 10;
			int r = n % 10;
			sum = sum + (long)q*45 + (1+r)*r/2;
			n = n / 10;
		}
		return sum;
	}
}
