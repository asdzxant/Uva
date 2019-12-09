import java.util.*;

public class UVA11063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int kase = 1;
        while(sc.hasNext()){
        	int n = sc.nextInt();
        	int[] b = new int[n];
        	boolean isB2 = true;
        	for(int i=0;i<n;i++){
        		b[i] = sc.nextInt();
        		if(i>0 && b[i-1]>=b[i])
        			isB2 = false;
        	}
        	
        	if(isB2){
        		boolean[] appear = new boolean[2*b[n-1]+1];
        		Arrays.fill(appear, false);
        		
        		for(int i=0;i<n;i++){
        			for(int j=i;j<n;j++){
        				int sum = b[i]+b[j];
        				if(appear[sum]){
        					isB2 = false;
        					break;
        				}
        				else{
        					appear[sum] = true;
        				}
        			}
        			if(!isB2)
        				break;
        		}
        	}
        	
        	System.out.print("Case #"+(kase++)+": ");
        	System.out.println(isB2 ? "It is a B2-Sequence." : "It is not a B2-Sequence.");
        	System.out.println();
        }
	}

}