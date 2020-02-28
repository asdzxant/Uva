import java.util.*;
public class UVA10221 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int s = sc.nextInt();
			s+=6440;
			double degree = sc.nextInt();
			String mode = sc.next();
			if(mode.equals("min")){
				degree/=60;
			}
			degree%=360;
			if(degree>180)degree = 360-degree;
			double res1 = s*2*Math.PI*degree/360;
			double res2 = Math.sqrt(2*s*s*(1-Math.cos(degree*Math.PI/180)));
			System.out.printf("%.6f %.6f\n" , res1 , res2);				
		}
	}
}