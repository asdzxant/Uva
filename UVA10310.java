import java.util.*;
public class UVA10310 {
	public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	while(sc.hasNext()){
    		int n=sc.nextInt();
    		double x1=sc.nextDouble(),y1=sc.nextDouble();
    		double x2=sc.nextDouble(),y2=sc.nextDouble();
    		boolean t=false;
    		double Fx=0,Fy=0;
    		for(int i=0;i<n;i++){
    			double hx=sc.nextDouble();
    			double hy=sc.nextDouble();
    			double d1=Math.sqrt(Math.pow(hx-x1,2)+Math.pow(hy-y1,2));
    			double d2=Math.sqrt(Math.pow(hx-x2,2)+Math.pow(hy-y2,2));
    			if(d1*2<=d2&&t==false){
    				t=true;
    				Fx=hx;
    				Fy=hy;
    				
    			}
    		}
    		if(t){
    			System.out.printf("The gopher can escape through the hole at (%.3f,%.3f).",Fx,Fy);
    		}else{
    			System.out.print("The gopher cannot escape.");		
    		}
    		System.out.println();
    	}
    	
    }
}
