import java.util.*;
public class UVA10409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
			int n=sc.nextInt();
			if(n==0) {
				break;
			}
			int top=1;
			int north=2;
			int west=3;
			int a;
			for(int i=0;i<n;i++) {
				String s=sc.next();
				
				if(s.equals("north")){
						a=top;
						top=7-north;
						north=a;
				}else if(s.equals("south")){
						a=top;
						top=north;
						north=7-a;
				}else if(s.equals("west")){
						a=top;
						top=7-west;
						west=a;		
				}else if(s.equals("east")){
						a=top;
						top=west;
						west=7-a;
				}
					
			}
			System.out.println(top);
			
		}
	}

}
