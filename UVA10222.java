import java.util.*;
public class UVA10222 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String data = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
		while(sc.hasNext()) {
			String input = sc.nextLine();
			input = input.toLowerCase();
			for(int i = 0 ; i<input.length(); i++) {
				if(input.charAt(i)==' ') {
					System.out.print(" ");
				}
				else {
					int pos = data.indexOf(input.charAt(i));
					pos = pos-2<0 ? 0:pos-2;
					System.out.print(data.charAt(pos));
				}
				
			}
			System.out.println();
			
		}
	}
}
