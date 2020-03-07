import java.util.*;
public class UVA10420{
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String c[]=new String[t];
		sc.nextLine();
		
		for(int i=0;i<t;i++){
			String s[]=sc.nextLine().trim().split(" ");
			c[i]=s[0];
		}
		Arrays.sort(c);
		/*for(int i=0;i<t;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		System.out.println("--------");*/
		
		int count=1;
		String now=c[0];
		for(int i=1;i<t;i++) {
			if(c[i].equals(now)) {
				count++;
			}else {
				System.out.println(now+" "+count);
				now=c[i];
				count=1;
				
			}
			if(i==t-1) {
				System.out.println(now+" "+count);
			}
			
		}
		
	}
}
