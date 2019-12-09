import java.util.*;

public class UVA11150 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
        	int n = sc.nextInt();
        	int sum = n;
        	
        	if(n==2)
        		n+=1;
        		
        	while(n>=3){
        		n-=3;
        		sum+=1;
        		n+=1;
        		
        		if(n==2)
        			n+=1;
        	}
        	
        	System.out.println(sum);
        }
	}

}