import java.util.*;

public class UVA11000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 		
 		while(sc.hasNext()){
 			int n = sc.nextInt();
 			
 			if(n==-1)
 				break;
 				
 			long female = 1, male = 0;
 			for(int i=1;i<=n;i++){
 				long girl = male+1;
 				long boy = male+female;
 				
 				female = girl;
 				male = boy;
 			}
 			
 			System.out.println(male+" "+(female+male));
 		}
	}

}