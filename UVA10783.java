import java.util.*;

public class UVA10783 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	
		int t = sc.nextInt();
		for(int kase = 1; kase <= t; kase++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int sum = 0;
			for(int i=a;i<=b;i++){
				if(i%2!=0)
					sum+=i;
			}
			
			System.out.printf("Case %d: %d\n", kase, sum);
		}
	}

}