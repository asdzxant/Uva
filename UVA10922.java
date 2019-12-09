import java.util.*;

public class UVA10922 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	
    	while(sc.hasNext()){
    		String num = sc.next();
    		if(num.equals("0"))
    			break;
    		
    		int sum = 0;
    		for(int i=0;i<num.length();i++){
    			sum+=num.charAt(i)-'0';
    		}
    		
    		if(sum%9!=0){
    			System.out.println(num+" is not a multiple of 9.");
    		}
    		else{
    			int cnt = 1;
    			int n = sum;
    			while(n%9==0 && n!=9){
    				sum = 0;
    				while(n>0){
    					sum+=n%10;
    					n/=10;
    				}
    				n = sum;
    				if(n%9==0)
    					cnt++;
    			}
    			
    			System.out.printf("%s is a multiple of 9 and has 9-degree %d.\r\n", num, cnt);
    		}
    	}
	}

}