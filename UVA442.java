import java.util.*;

public class UVA442 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int mat[][] = new int[n][2];
		
		for(int i=0;i<n;i++) {
			int id = sc.next().charAt(0) - 'A';
			mat[id][0] = sc.nextInt();
			mat[id][1] = sc.nextInt();		
		}
		
		while(sc.hasNext()) {
			char[] in = sc.next().toCharArray();
			
			ArrayDeque<int[]> stack = new ArrayDeque<>();
			
			int ans = 0;
			for(int i=0;i<in.length;i++) {
				if(in[i] == '(') {
					stack.push(new int[] {0, 0});
				}
				else if(in[i] == ')') {
					while(true) {
							
						int[] b = stack.pop();
						int[] a = stack.pop();
						
						if(a[0] == 0) {
							stack.push(b);
							break;
						}
						
						if(a[1] != b[0]) {
							ans = -1;
							break;
						}
						
						stack.push(new int[]{a[0], b[1]});
						ans += a[0] * a[1] * b[1];
					}
				}
				else {
					stack.push(mat[in[i] - 'A']);
				}
				
				if(ans<0)
					break;
			}
			
			System.out.println(ans < 0 ? "error" : ans);
		}
	}

}
