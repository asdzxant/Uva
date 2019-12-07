import java.util.*;

public class UVA118 {
	
	static int maxx, maxy;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		maxx = sc.nextInt();
		maxy = sc.nextInt();
		
		boolean lost[][] = new boolean[maxx+1][maxy+1];
		int dx[] = {0, 1, 0, -1};
		int dy[] = {1, 0, -1, 0};
		
		while(sc.hasNext()) {
			int x = sc.nextInt(), y = sc.nextInt();
			String s = sc.next();
			int ot = getOrient(s);
			
			String op = sc.next();
			boolean f = false;
			for(int i=0;i<op.length();i++) {
				char c = op.charAt(i);
				if(c=='L') {
					ot = (ot + 3) % 4;
				}
				else if(c=='R') {
					ot = (ot + 1) % 4;
				}
				else {
					int nxtx = x + dx[ot];
					int nxty = y + dy[ot];
					
					if(inRange(nxtx, nxty)) {
						x = nxtx;
						y = nxty;
					}
					else if(!lost[x][y]) {
						lost[x][y] = true;
						f = true;
						break;
					}
					
				}
			}
			
			System.out.print(x+" "+y+" "+getOrient(ot));
			
			if(f) {
				System.out.print(" LOST");
			}
			System.out.println();
		}
		
	}
	
	public static boolean inRange(int x, int y) {
		return x >=0 && y>=0 && x<=maxx && y<=maxy;
	}
	
	public static String getOrient(int idx) {
		switch(idx) {
			case 0:
				return "N";
			case 1:
				return "E";
			case 2:
				return "S";
			default:
				return "W";
		}
	}
	
	public static int getOrient(String s) {
		switch(s) {
			case"N":
				return 0;
			case"E":
				return 1;
			case"S":
				return 2;
			default:
				return 3;
		}
	}
}
