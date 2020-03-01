import java.util.*;
public class UVA10324 {
	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int count=1;
    	while(sc.hasNext()) {
    		System.out.println("Case "+count++ +":");
    		char c[]=sc.next().toCharArray();
    		int n=sc.nextInt();
    		for(int i=0;i<n;i++) {
    			int l=sc.nextInt();
    			int r=sc.nextInt();
    			if(l>r) {
    				int m=l;
    				l=r;
    				r=m;
    			}
    			boolean t=true;
    			for(int j=l;j<r;j++) {
    				if(c[j]!=c[j+1]) {
    					t=false;
    					break;
    				}
    			}
    			if(t) {
    				System.out.println("Yes");
    			}else {
    				System.out.println("No");
    			}
    			
    		}
    		
    	}
    		
    		
    	
    }
}
