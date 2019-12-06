import java.util.*;

public class UVA11483 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kase = 1;
		
		while(true) {
			int n = sc.nextInt();
			
			if(n==0)
				break;
			
			System.out.println("Case "+ kase++ + ":");
			System.out.println("#include<string.h>");
			System.out.println("#include<stdio.h>");
			System.out.println("int main()\n{");

			sc.nextLine();
			for(int i=0;i<n;i++) {
				String s = sc.nextLine();
				
				System.out.print("printf(\"");
				
				for(int j=0;j<s.length();j++) {
					char c = s.charAt(j);
					if(c=='\\' || c=='"') {
						System.out.print("\\" + c);
					}
					else {
						System.out.print(c);
					}
				}
				
				System.out.println("\\n\");");
			}
			System.out.println("printf(\"\\n\");");
			System.out.println("return 0;");
			System.out.println("}");
		}
	}

}
