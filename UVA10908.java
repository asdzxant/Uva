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
			
			char grid[][] = new char[m][n];
			for(int i=0;i<m;i++){
				String s = sc.next();
				for(int j=0;j<n;j++){
					grid[i][j] = s.charAt(j);
				}
			}
			
			while(q-->0){
				int r = sc.nextInt();
				int c = sc.nextInt();
				
				boolean extend = true;
				int ans = 1;
				char center = grid[r][c];
				for(int i=1;;i++){
					
					for(int j=r-i;j<=r+i;j++){
						for(int k=c-i;k<=c+i;k++){
							if(j<0 || j>=m || k<0 || k>=n || grid[j][k]!=center){
								extend = false;
								break;
							}
						}
						if(!extend)
							break;
					}
					if(!extend)
						break;
					
					ans +=2;
				}
				
				System.out.println(ans);
			}
		}
	}

}
