import java.util.*;
public class UVA10260 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> data = new HashMap<Character, Integer>();
		data.put('B', 1);data.put('F',1);data.put('P',1);data.put('V',1);
		data.put('C',2);data.put('G',2);data.put('J',2);data.put('K',2);data.put('Q',2);
		data.put('S',2);data.put('X',2);data.put('Z',2);
		data.put('D',3);data.put('T',3);
		data.put('L',4);
		data.put('M',5);data.put('N',5);
		data.put('R',6);
		while(sc.hasNext()) {
			int front = -1;
			String input = sc.nextLine();
			for(int i = 0 ; i<input.length(); i++) {
				if(data.containsKey(input.charAt(i)) && data.get(input.charAt(i)) != front) {
					System.out.print(data.get(input.charAt(i)));
					front = data.get(input.charAt(i));
				}
				else if (!data.containsKey(input.charAt(i))){
					front = -1;
				}
			}
			System.out.println();
		}
	}
}
