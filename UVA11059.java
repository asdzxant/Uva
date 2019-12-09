import java.util.*;

public class UVA11059 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int kase=1;
		while(sc.hasNext()){
			
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			
			long max = 0;
			for(int i=0;i<n;i++){
				long num = arr[i];
				
				if(num>max)
					max=num;
				
				for(int j=i+1;j<n;j++){
					num*=arr[j];
					
					if(num>max)
						max=num;
				}
			}
			
			System.out.println("Case #"+kase+": The maximum product is "+max+".");
			System.out.println();
			kase++;
		}
	}

}