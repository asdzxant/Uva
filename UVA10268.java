import java.util.*;
public class UVA10268{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int x = sc.nextInt();
			sc.nextLine();
			String[] input = sc.nextLine().split(" +");
			int res = 0;
			for(int i = 0 ; i<input.length-1; i++) {
				int xvalue = xv(x, input.length-2-i);
				res+=Integer.parseInt(input[i])*(input.length-(i+1))*xvalue;
			}
			System.out.println(res);
		}
	}
	static int xv(int x, int degree) {
		if(degree == 1) {
			return x;
		}
		else if(degree == 0) {
			return 1;
		}
		int v = xv(x, degree/2);
		int res = v*v;
		if(degree%2 == 1)res*=x;
		return res;
	}
}