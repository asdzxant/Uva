import java.util.*;

public class UVA11001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
        	int vt = sc.nextInt();
        	int v0 = sc.nextInt();
        	
        	if(vt==0 && v0==0)
        		break;
        		
        	double max = 0;
        	int p = 0;
        	for(int i=1;i<=vt;i++){
        		double v = (double)vt/i;
        		if(v<=v0)
        			break;
        		
        		double len = 0.3*Math.sqrt(v-v0)*i;
        		if(Math.abs(max-len) <= 1e-10){
        			p = 0;
        			break;
        		}
        		
        		if(len>max){
        			max = len;
        			p = i;
        		}
        	}
        	
        	System.out.println(p);
        }
	}

}