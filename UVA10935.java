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
				
			ArrayList<Integer> ans = new ArrayList<>();
			while(list.size()>1){
				int r = list.remove();
				ans.add(r);
					
				list.add(list.remove());
			}
			
			System.out.print("Discarded cards:");
			for(int i=0;i<ans.size();i++){
				if(i==0)
					System.out.print(" " + ans.get(i));
				else
					System.out.print(", " + ans.get(i));
			}
			System.out.println();
			System.out.println("Remaining card: "+list.remove());
		}
	}

}
