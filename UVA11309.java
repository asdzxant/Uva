import java.util.*;

public class UVA11309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
   		
		int n = sc.nextInt();
		
		while(n-->0){
			String[] time = sc.next().split(":");
			int h = Integer.parseInt(time[0]);
			int m = Integer.parseInt(time[1]);
			
			while(true){
				m++;
				if(m==60){
					h++;
					m = 0;
					
					if(h==24){
						h = 0;
						m = 0;
					}
				}
				if(isPalindromic(h, m)){
					System.out.printf("%02d:%02d\n", h, m);
					break;
				}
			}
			
		}
	}
	
	static boolean isPalindromic(int h, int m){
		
		String s = "";
		
		if(h==0) {
			s+=m;
		}
		else {
			s+=h;
			String mm = m+"";
			if(mm.length()==1)
				mm = "0"+mm;
			s+=mm;
		}
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
				return false;
		}
		return true;
	}
}