import java.util.*;
public class UVA10420{
	public static void main(String args []){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		Set<String> l=new TreeSet<String>();
		String c[]=new String[t];
		sc.nextLine();
		
		for(int i=0;i<t;i++){
			String s[]=sc.nextLine().trim().split(" ");
			c[i]=s[0];
			//System.out.println(s[0]);
			l.add(s[0]);
			
		}
		Arrays.sort(c);
		String st[]=l.toArray(new String[l.size()]);
		
		for(int i=0;i<st.length;i++){
			int count=0;
			for(int j=0;j<t;j++){
				if(st[i].equals(c[j])) count++;
			}
			System.out.println(st[i]+" "+count);	
		}
			
			
		
		
		
	}
}