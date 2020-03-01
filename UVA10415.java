import java.util.*;
public class UVA10415 {
	static int count[];
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		String let[]= {"c0111001111",
					"d0111001110",
					"e0111001100",
					"f0111001000",
					"g0111000000",
					"a0110000000",
					"b0100000000",
					"C0010000000",
					"D1111001110",
					"E1111001100",
					"F1111001000",
					"G1111000000",
					"A1110000000",
					"B1100000000",
					};
		
		while(T-->0) {
			int f[]=new int [10];
			int now[]=new int[10];
			count=new int[10];
			char c[]=sc.nextLine().toCharArray();
			for(int i=0;i<c.length;i++) {
				now =f(c[i],let,now);
				//System.out.println(Arrays.toString(count));
			}
			for(int i=0;i<count.length;i++) {
				if(i==0) {
					System.out.print(count[i]);
				}else {
					System.out.print(" "+count[i]);
				}
			}
			System.out.println();
		}
	}
	public static int []f(char c,String let[],int now[]) {
		String str="";
		for(int i=0;i<let.length;i++) {
			if(c==let[i].charAt(0)) {
				str=let[i].replaceAll("[^\\d]","");
			}
		}
		//System.out.println(str);
		for(int i=0;i<10;i++) {
			if(now[i]==0&&str.charAt(i)=='1') {
				count[i]+=1;
			}
			now[i]=str.charAt(i)-'0';
		}
		return now;
	}

}
