import java.util.*;
public class UVA10550 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			if(n==0&&a==0&&b==0&&c==0) {
				break;
			}
			int sum=0;
			sum+=720;//¶¶2°é 
			int r1=(n-a+40)%40*9;//¶¶
			sum+=360;//°f1°é
			int r2=(b-a+40)%40*9;//°f
			int r3=(b-c+40)%40*9;//¶¶
			sum+=r1+r2+r3;
			System.out.println(sum);
			
		}
	}

}
