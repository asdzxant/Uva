import java.util.*;

public class UVA10931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
  		while(sc.hasNext()){
  			
  			int n = sc.nextInt();
  			if(n == 0)
  				break;
  			
  			String b = "";
  			int p = 0;
  			
  			while(n>0) {
  				int r = n % 2;
  				
  				b = r + b;
  				
  				if(r == 1)
  					p++;
  				
  				n = n/2;
  			}
  			
  			System.out.println("The parity of " + b + " is " + p + " (mod 2).");
  		}
	}

}