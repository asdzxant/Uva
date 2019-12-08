import java.util.*;

public class UVA272 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int f = 0;
		while(sc.hasNext()) {
			String s = sc.nextLine();
			
			for(int i=0;i<s.length();i++) {
				char c = s.charAt(i);
				
				if(c=='"') {
					if(f==0) {
						System.out.print("``");
					}
					else {
						System.out.print("''");
					}
					f ^= 1;
				}
				else {
					System.out.print(c);
				}
			}
			
			System.out.println();
		}
	}

}
