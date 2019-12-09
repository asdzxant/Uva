import java.util.*;

public class UVA10994 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	
    	while(sc.hasNext()){
    		int p = sc.nextInt()-1;
    		int q = sc.nextInt();
    		
    		if(p==-2 && q==-1)
    			break;
    			
    		long sp = s(p);
    		long sq = s(q);
    		
    		System.out.println(sq-sp);
    	}
    }
	
    static long s(int n){
    	long sum = 0;
    	while(n>0){
    		long q = n/10;
    		long r = n%10;
    		sum+=q*45;
    		sum+=(1+r)*r/2;
    		n/=10;
    	}
    	return sum;
	}
}