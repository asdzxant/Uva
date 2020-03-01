import java.util.*;
import java.math.*;

public class UVA10929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			
			String s = sc.next();
			
			if(s.equals("0"))
				break;
			
			BigInteger n = new BigInteger(s);
			
			BigInteger res = n.mod(new BigInteger("11"));
			
			if(res.compareTo(BigInteger.ZERO) == 0)
				System.out.println(s+" is a multiple of 11.");
			else
				System.out.println(s+" is not a multiple of 11.");
		}
	}

}