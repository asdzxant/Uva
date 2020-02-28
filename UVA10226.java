import java.util.*;
public class UVA10226 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		sc.nextLine();
		while(T-- > 0) {
			Map<String, Integer> data= new HashMap<String,Integer>();
			String[] tree = new String[10000];
			Arrays.fill(tree, "");
			int tp = 0;
			double cnt = 0;
			while(sc.hasNext()) {
				String input = sc.nextLine();
				if(input.equals(""))break;
				if(data.containsKey(input)) {
					int value = data.get(input);
					data.replace(input, ++value);
				}
				else {
					data.put(input, 1);
					tree[tp] = input;
					tp++;
				}
				cnt++;
			}
			Arrays.sort(tree);
			for(int i = 0 ; i<tree.length; i++) {
				if(!tree[i].equals("")) {
					double value = data.get(tree[i]);
					System.out.printf("%s %.4f\n",tree[i],(value/cnt)*100);
				}
			}
			if(T!=0)System.out.println();
		}
	}
}