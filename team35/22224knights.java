import java.util.Scanner;

public class knights {

	public static void main(String[] args){
		
		Scanner scanman = new Scanner(System.in);
		
		int times = Integer.parseInt(scanman.nextLine())                                                           ;
		
		for(; times > 0; times--){
			
			String num = scanman.nextLine();
			System.out.print(num);
			if(num.contains("1")){
				
				System.out.print(" knights");
			}
			if(num.contains("5")||num.contains("6")||num.contains("7")||num.contains("8")||num.contains("9")){
				
				System.out.print(" pirates");
				
			}
			if(num.contains("0")){
				
				System.out.print(" ninjas");
				
			}
			System.out.print("\n");
			
			
			
		}
		
	}
	
}
