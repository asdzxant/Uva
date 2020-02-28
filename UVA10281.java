import java.util.*;
public class UVA10281 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double speed = 0;
		double dis = 0;
		double h = 0;
		double m = 0;
		double sec = 0;
		boolean first = true;
		double time = 0;
		double time2 = 0;
		while(sc.hasNext()){
			String input = sc.nextLine();
			boolean change = false;
			h = Double.parseDouble(input.substring(0,2));
			m = Double.parseDouble(input.substring(3,5));
			sec = Double.parseDouble(input.substring(6,8));
			time2 = time;
			time = h*3600 + m*60 + sec;
			
			if(input.length() > 8){
				change = true;
			}
			if(change){		
				dis+=(speed/3600) * ( time-time2);
				speed = Double.parseDouble(input.substring(9,input.length()));
			}
			else{
				dis+=(speed/3600) * ( time-time2);
				System.out.printf(input+" %.2f km\n",dis);
			}
			if(first){
				first = false;
				continue;
			}
			
			h = Double.parseDouble(input.substring(0,2));
			m = Double.parseDouble(input.substring(3,5));
			sec = Double.parseDouble(input.substring(6,8));
		}
	}
}