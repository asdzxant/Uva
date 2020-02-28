import java.util.*;
public class UVA10282 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Map data = new TreeMap();
		while(sc.hasNext()) {
			String input = sc.nextLine();
			if(input.equals(""))break;
			String[] s = input.split(" ");
			data.put(s[1], s[0]);
		}
		boolean first = true;
		while(sc.hasNext()) {
			String key = sc.next();
			if(!first) {
				System.out.println();
			}
			if(!data.containsKey(key)) {
				System.out.print("eh");
			}
			else {
				System.out.print(data.get(key));
			}
			if(first) {
				first = false;
			}
		}
		System.out.println();
	}
}
