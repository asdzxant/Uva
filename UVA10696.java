import java.util.*;
public class UVA10696 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()) {
			int n=sc.nextInt();
			if(n==0) {
				break;
			}
			System.out.println("f91("+n+") = "+f(n));
		}
	}
	public static int f(int n) {
		if(n<=100) {
			return f(f(n+11));
		}else {
			return n-10;
		}
	}

}
