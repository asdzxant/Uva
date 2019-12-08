import java.util.*;
	
public class UVA264 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int n = sc.nextInt();
			
			int group = 1;
			int sum = 1;
			
			while(sum < n) {
				group++;
				sum+=group;
			}
			
			if(group % 2 == 1) {
				System.out.printf("TERM %d IS %d/%d\n", n, sum - n + 1, group - (sum - n));
			}
			else {
				System.out.printf("TERM %d IS %d/%d\n", n, group - (sum - n), sum - n + 1);
			}
		}
	}

}
