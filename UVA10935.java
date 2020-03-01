import java.util.*;

public class UVA10935 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0)
				break;
				
			LinkedList<Integer> list = new LinkedList<Integer>();
			for(int i=1;i<=n;i++)
				list.add(i);
				
			String ans = "";
			while(list.size()>1){
				int r = list.remove();
				if(ans.length()==0)
					ans = ans + " " + r;
				else
					ans = ans + ", " + r;
					
				list.add(list.remove());
			}
			
			System.out.println("Discarded cards:"+ans);
			System.out.println("Remaining card: "+list.remove());
		}
	}

}