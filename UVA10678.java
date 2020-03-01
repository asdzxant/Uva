import java.util.*;
public class UVA10678 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		double pi=2*Math.acos(0);
		while(T-->0) {
			
			double D=sc.nextDouble();
			double L=sc.nextDouble();
			double a=D/2;
			double c=L/2;
			//System.out.println("a = "+a+" c = "+c);
			double b=Math.sqrt(c*c-a*a);
			System.out.printf("%.3f",c*b*pi);
			System.out.println("");
			
			
			
		}
		
	}

}
