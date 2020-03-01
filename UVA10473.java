import java.util.*;
public class UVA10473 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) {
			String s=sc.next();
			
			
			if(s.charAt(0)=='0') {
				s=s.substring(2,s.length());
				//System.out.println(s);
				int val=Integer.valueOf(s,16);
				System.out.println(val);
				
			}else {
				if(Integer.parseInt(s)<0) {
					break;
				}
				String str=Integer.toHexString(Integer.parseInt(s));
				
				String ans="";
				for(int i=0;i<str.length();i++) {
					if(Character.isLetter(str.charAt(i))) {
						ans+=Character.toUpperCase(str.charAt(i));
					}else {
						ans+=str.charAt(i);
					}
				}
				System.out.println("0x"+ans);
				
				
			}
		}
		
	}

}
