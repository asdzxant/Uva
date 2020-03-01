import java.util.*;
public class UVA10469 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String s1=Integer.toBinaryString(sc.nextInt());
			String s2=Integer.toBinaryString(sc.nextInt());
			for(int i=s1.length();i<32;i++) {
				s1="0"+s1;
			}
			for(int i=s2.length();i<32;i++) {
				s2="0"+s2;
			}
			String ans="";
			//System.out.println(s1);
			//System.out.println(s2);
			for(int i=0;i<32;i++) {
				if(s1.charAt(i)=='0'&&s2.charAt(i)=='0') {
					ans=ans+"0";
				}else if(s1.charAt(i)=='1'&&s2.charAt(i)=='1') {
					ans=ans+"0";
				}else {
					ans=ans+"1";
				}
			}
			System.out.println(Integer.valueOf(ans,2));
		}
		
		
	}

}
