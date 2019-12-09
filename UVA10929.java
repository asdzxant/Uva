import java.util.*;
import java.math.*;

public class UVA10929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s = sc.next();
			BigInteger n = new BigInteger(s);
			
			if(n.compareTo(BigInteger.ZERO)==0)
				break;
			
			if(n.mod(new BigInteger("11")).compareTo(BigInteger.ZERO)==0)
				System.out.println(s+" is a multiple of 11.");
			else
				System.out.println(s+" is not a multiple of 11.");
		}
	}

}