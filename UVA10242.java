import java.util.*;
public class UVA10242 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double[][] point = new double[3][2];
			int pos = 0;
			double repeatx = 0;
			double repeaty = 0;
			for(int i = 0 ; i<4; i++) {
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				if(!contain(x,y,point)) {
					point[pos][0] = x;
					point[pos][1] = y;
					pos++;
				}
				else {
					repeatx = x;
					repeaty = y;
				}
			}
			double centerx = 0;
			double centery = 0;
			for(int i = 0 ; i<3; i++) {
				if(point[i][0]!=repeatx || point[i][1] != repeaty) {
					centerx+=point[i][0];
					centery+=point[i][1];
				}
			}
			centerx/=2;
			centery/=2;
			double resultx = centerx < repeatx ? centerx-(repeatx-centerx) : centerx+(centerx-repeatx);
			double resulty = centery < repeaty ? centery-(repeaty-centery) : centery+(centery-repeaty);
			System.out.printf("%.3f %.3f\n", resultx,resulty);
		}
	}
	static boolean contain(double x, double y,double[][] point) {
		for(int i = 0 ; i<3; i++) {
			if(point[i][0] == x && point[i][1] == y)return true;
		}
		return false;
	}
}
