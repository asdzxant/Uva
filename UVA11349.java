import java.util.*;

public class UVA11349 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tc = sc.nextInt();
		int kase = 1;
		
		while(tc-->0) {
			sc.next();
			sc.next();
			int size = sc.nextInt();
			
			long mat[][] = new long[size][size];
			
			boolean ok = true;
			
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					mat[i][j] = sc.nextLong();
					if(mat[i][j] < 0)
						ok = false;
				}
			}
			
			
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					
					if(mat[i][j] != mat[size-1-i][size-1-j]) {
						ok = false;
					}
				}
			}
			
			if(ok) {
				System.out.printf("Test #%d: Symmetric.\n", kase++);
			}
			else {
				System.out.printf("Test #%d: Non-symmetric.\n", kase++);
			}
			
		}
	}

}
