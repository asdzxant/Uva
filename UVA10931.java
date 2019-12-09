import java.util.*;

public class UVA10931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
  		while(sc.hasNext()){
  			String n = Integer.toString(sc.nextInt(), 2);
  			if(n.equals("0"))
  				break;
  			
  			int cnt = 0;
  			for(int i=0;i<n.length();i++){
  				if(n.charAt(i)=='1')
  					cnt++;
  			}
  			System.out.printf("The parity of %s is %d (mod 2).\r\n", n, cnt);
  		}
	}

}