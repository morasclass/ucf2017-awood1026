import java.util.*;
public class shift {

	
	static char[] shifted = {'~','!','@', '#','$','%','^','&','*','(',')','_','+','{','}','|',':','"','<','>','?','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = Integer.parseInt(scan.nextLine());
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i=0; i<cases; i++){
			arr.add(scan.nextLine());
		}
		
		for(int i=0; i<arr.size(); i++){
			String x = arr.get(i);
			
			int timesShifted = 0;
			
			for(int j = 0; j<x.length(); j++) {
				if(isShifted(x.charAt(j))) {
					int index = j;
					while(index < x.length() && isShifted(x.charAt(index))) {
						index++;
					}
					j = index;
					timesShifted++;
				}
			}
			
			System.out.println("The shift key was pressed " + timesShifted + " times.");
			
		}
		
	}
	
	public static boolean isShifted(char c) {
		for(int i = 0; i<shifted.length; i++) {
			if(c == shifted[i]) {
				return true;
			}
		}
		
		return false;
	}
}
