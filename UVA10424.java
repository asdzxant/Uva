import java.util.*;
public class UVA10424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			//String s1=sc.nextLine();
			//String s2=sc.nextLine();
			char c1[]=sc.nextLine().toLowerCase().toCharArray();
			char c2[]=sc.nextLine().toLowerCase().toCharArray();
			double n1=f(c1);
			double n2=f(c2);
			System.out.printf("%.2f",(Math.min(n1,n2)/Math.max(n1,n2))*100);
			System.out.println(" %");
		}
		
	}
	public static int f(char c[]) {
		
		int sum=0;
		int m=0;
		for(int i=0;i<c.length;i++) {
			if(Character.isLetter(c[i])) {
				sum+=c[i]-'a'+1;
				//System.out.println(c[i]+"=  "+(c[i]-'a'+1));
			}
		}
		while(true) {
			while(sum>0) {
				//System.out.println("sum= "+sum+" m= "+m);
				m+=sum%10;
				sum/=10;
				
			}
			if(m<10) {
				break;
			}else {
				sum=m;
				m=0;
			}
		}
		return m;
		//System.out.println(m);
	}
	

}
