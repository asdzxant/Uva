import java.util.*;

public class UVA10812 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
        
		int n = sc.nextInt();
        while(n-->0){
        	int s = sc.nextInt();
        	int d = sc.nextInt();
        	
        	
        	if(s<d || (s+d)%2!=0){
        		System.out.println("impossible");
        	}
        	else{
        		int a = (s+d)/2;
        		int b = s-a;
        		System.out.println(a>b ? a+" "+b : b+" "+a);
        	}
        }
	}

}