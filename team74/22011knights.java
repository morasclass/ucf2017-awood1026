import java.util.Scanner;
import java.util.*;
public class knights {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int cases = Integer.parseInt(scanner.nextLine());
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i = 0; i < cases; i++){
			String input = scanner.nextLine();
			String total = input;
			
			if(knight(input)){
				total = total + " knights";
			}
			if(pirate(input)){
				total = total + " pirates";
			}
			if(ninja(input)){
				total = total + " ninjas";
			}
			arr.add(total);
		}
		for(int i = 0; i < arr.size(); i++){
			System.out.println(arr.get(i));
		}
	}
	
	public static boolean pirate(String input){
		if(input.contains("5") || input.contains("6") || input.contains("7") || input.contains("8") || input.contains("9")){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean knight(String input){
		if(input.contains("1")){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static boolean ninja(String input){
		if(input.contains("0")){
			return true;
		}
		else{
			return false;
		}
	}
}
