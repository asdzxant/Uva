import java.util.*;
public class UVA10209 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double a = sc.nextDouble();
			double square = a*a - a*a*Math.sqrt(3)/4 - a*a*Math.PI/12*2;
			double point = a*a - a*a*Math.PI/4 - 2*square;
			double slide = a*a*Math.PI/4 - 2*square - 3*point;
			System.out.printf("%.3f %.3f %.3f\n", slide , point*4, square*4);
		}
	}
}
