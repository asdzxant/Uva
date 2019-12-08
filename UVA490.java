import java.util.*;

public class UVA490 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str[] = new String[100];
		
		int cnt = 0;
		int maxL = 0;
		while(sc.hasNext()) {
			str[cnt] = sc.nextLine();
			maxL = Math.max(maxL, str[cnt].length());
			cnt++;
		}
		
		for(int i=0;i<maxL;i++) {
			for(int j=cnt-1;j>=0;j--) {
				if(str[j].length() <= i) {
					System.out.print(" ");
				}
				else {
					System.out.print(str[j].charAt(i));
				}
			}
			System.out.println();
		}
	}

}
