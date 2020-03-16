import java.util.*;
public class UVA10415 {
	static int count[];
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		
		
		String M[]= {"0111001111",
					"0111001110",
					"0111001100",
					"0111001000",
					"0111000000",
					"0110000000",
					"0100000000",
					"0010000000",
					"1111001110",
					"1111001100",
					"1111001000",
					"1111000000",
					"1110000000",
					"1100000000",
					};
		char c[]= {'c','d','e','f','g','a','b','C','D','E','F','G','A','B'};
		while(T-->0) {
			int ans[]=new int[10];
			Arrays.fill(ans,0);
			char s[]=sc.nextLine().trim().toCharArray();
			String now="0000000000";
			for(int i=0;i<s.length;i++) {
				for(int j=0;j<14;j++) {
					if(c[j]==s[i]) {
						for(int u=0;u<10;u++) {
							if(now.charAt(u)=='0'&&M[j].charAt(u)=='1') {
								ans[u]++;
							}
						}
						now=M[j];
						break;
					}
				}
			}
			for(int i=0;i<10;i++) {
				if(i==0) {
					System.out.print(ans[i]);
				}else {
					System.out.print(" "+ans[i]);
				}	
			}
			System.out.println();		
		}
	}
}
