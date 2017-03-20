import java.util.*;

public class shift {

	public static void main(String[] args){
		
		Scanner scanman = new Scanner(System.in);
		
		for(int times = Integer.parseInt(scanman.nextLine()); times > 0; times--){
			
		String symbols = "~!@#$%^&*()_+{}|:\"<>?QWERTYUIOPASDFGHJKLZXCVBNM";
		String input = scanman.nextLine();
		int recentUpper = 0;
		int nums = 0;
		
		for(int i=0; i<input.length(); i++){
			if(symbols.contains(input.substring(i, i+1)) && recentUpper==0){
				recentUpper=1;
				nums++;
			}
			else if(recentUpper==1 && symbols.contains(input.substring(i, i+1))&& !(input.substring(i, i+1).equals(" "))){
				
				recentUpper=1;
				
			}
			else{
				recentUpper=0;
			}
			
		}
		System.out.println("The shift key was pressed " + nums + " times.");
		
		}
		
	}
}
