import java.util.*;
import java.math.*;

public class UVA10925 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int bill=1;
        while(sc.hasNext()){
        	int n = sc.nextInt();
        	int f = sc.nextInt();
        	
        	if(n==0 && f==0)
        		break;
        		
        	BigInteger sum = BigInteger.ZERO;
        	for(int i=0;i<n;i++){
        		sum = sum.add(new BigInteger(sc.next()));
        	}
        	
        	System.out.println("Bill #"+bill+" costs "+sum+": each friend should pay "+sum.divide(new BigInteger(f+"")));
      		System.out.println();
      		bill++;
        }
	}

}