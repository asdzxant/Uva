import java.util.*;

public class UVA10908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0){
			int m = sc.nextInt();
			int n = sc.nextInt();
			int q = sc.nextInt();
			System.out.println(m+" "+n+" "+q);
			char[][] grid = new char[m][n];
			for(int i=0;i<m;i++){
				String s = sc.next();
				for(int j=0;j<n;j++){
					grid[i][j] = s.charAt(j);
				}
			}
			
			while(q-->0){
				int r = sc.nextInt();
				int c = sc.nextInt();
				
				int[] x = {-1, 1, -1, 1};
				int[] y = {-1, -1, 1, 1};
				
				boolean val = true;
				int ans = 1;
				char center = grid[r][c];
				for(int i=1;;i++){
					for(int j=0;j<x.length;j++){
						int a = r+i*x[j];
						int b = c+i*y[j];
						
						if(a < 0 || a >= m || b < 0 || b >= n){
							val = false;
							break;
						}
					}
					if(!val)
						break;
					
					for(int j=r+i*x[0];j<=r+i*x[1];j++){
						if(grid[j][c+i*y[0]]!=center || grid[j][c+i*y[2]]!=center){
							val = false;
							break;
						}
					}
					
					for(int j=c+i*y[0];j<=c+i*y[2];j++){
						if(grid[r+i*x[0]][j]!=center || grid[r+i*x[1]][j]!=center){
							val = false;
							break;
						}
					}
					
					if(!val)
						break;
					
					ans +=2;
				}
				
				System.out.println(ans);
			}
		}
	}

}