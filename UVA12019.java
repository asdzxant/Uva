import java.util.*;

public class UVA12019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String day[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		int rec[] = new int[366];
		
		int idx = getIdx(4, 4);
		rec[idx] = 0;
		int p = 0;
		
		for(int i=idx;i>=1;i--) {
			rec[i] = p;
			p = (p + 6) % 7;
		}
		p = 0;
		for(int i=idx;i<=365;i++) {
			rec[i] = p;
			p = (p + 1) % 7;
		}
		
		int tc = sc.nextInt();
		while(tc-->0) {
			int m = sc.nextInt(), d = sc.nextInt();
			
			idx = getIdx(m, d);
			System.out.println(day[rec[idx]]);
		}
		
	}
	
	public static int getIdx(int m, int d) {
		int idx = 0;
		int md[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		for(int i=0;i<m;i++) {
			idx += md[i];
		}
		
		idx += d;
		
		return idx;
	}

}
