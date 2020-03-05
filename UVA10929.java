import java.util.*;

public class UVA10929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			
			String s = sc.next();
			
			if(s.equals("0"))
				break;
			
			int a = 0, b = 0;
			for(int i=0;i<s.length();i++){
				int n = s.charAt(i)-'0';
				if(i%2==0)
					a = a + n;
				else
					b = b + n;
			}
			
			if(Math.abs(a-b) % 11 == 0)
				System.out.println(s + " is a multiple of 11.");
			else
				System.out.println(s + " is not a multiple of 11.");
		}
	}

}
