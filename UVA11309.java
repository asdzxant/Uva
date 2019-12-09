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
   				if(isReadSame(h, m)){
   					System.out.printf("%02d:%02d\r\n", h, m);
   					break;
   				}
   			}
   			
   		}
    }
	
    static boolean isReadSame(int h, int m){
    	
    	if(h==0)
    		return true;
    	
    	String hh = h+"";
    	String mm = m+"";
    	
    	if(hh.length() == 1)
    		hh = "0"+hh;
    	if(mm.length() == 1)
    		mm = "0"+mm;
    		
    	if(hh.charAt(0)==mm.charAt(1) && hh.charAt(1)==mm.charAt(0))
    		return true;
    	else
    		return false;
	}
}