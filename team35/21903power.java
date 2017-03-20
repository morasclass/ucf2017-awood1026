import java.util.Scanner;

public class power {

	public static void main(String[] args){
		
		Scanner scanman = new Scanner(System.in);
		
		int num = scanman.nextInt();
		for(; num > 0; num--){
			
			int powe = scanman.nextInt();
			int dodang = (int) (Math.pow(2, powe)-1);
			System.out.println(dodang);
			
			
		}
		
	}
	
	
}
