import java.util.*;

public class UVA11428 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int n = sc.nextInt();
			
			if(n==0)
				break;
			
			
			boolean ok = false;
			int x = 1, y = 0;
			
			while(x!=y) {
				int d = x*x*x - y*y*y;
				if(d < n) {
					x++;
				}
				else if(d > n) {
					y++;
				}
				else {
					ok = true;
					System.out.println(x+" "+y);
					break;
				}
			}
			
			if(!ok){
				System.out.println("No solution");
			}
		}
	}

}
