import java.util.*;

public class UVA11005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
  		
  		int t = sc.nextInt();
  		for(int kase=1;kase<=t;kase++){
  		
  			int num[] = new int[10];
  			int letter[] = new int[26];
  			for(int i=0;i<10;i++)
  				num[i] = sc.nextInt();
  			for(int i=0;i<26;i++)
  				letter[i] = sc.nextInt();
  				
  			System.out.println("Case "+kase+":");
  			
  			int q = sc.nextInt();
  			while(q-->0){
  				int n = sc.nextInt();
  				int[] cost = new int[37];
  				int min = Integer.MAX_VALUE;
  				for(int base=2;base<=36;base++){
  					String b = Integer.toString(n, base);
  					int cnt = 0;
  					for(int i=0;i<b.length();i++){
  						char s = b.charAt(i);
  						if('0' <= s && s <= '9'){
  							cnt+=num[s-'0'];
  						} 
  						else{
  							cnt+=letter[s-'a'];
  						}
  					}
  					cost[base] = cnt;
  					if(cnt<min)
  						min = cnt;
  				}
  				
  				System.out.print("Cheapest base(s) for number "+n+":");
  				for(int i=2;i<=36;i++){
  					if(cost[i]==min)
  						System.out.print(" "+i);
  				}
  				System.out.println();
  			}
  			if(kase!=t)
  				System.out.println();
  		}
	}

}