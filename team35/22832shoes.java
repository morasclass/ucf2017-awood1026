import java.util.ArrayList;
import java.util.Scanner;

public class shoes {

	public static void main(String[] args){
		
	Scanner scanman = new Scanner(System.in);
	int count = Integer.parseInt(scanman.nextLine());
	
	for(int x = 1; x <= count; x++){
		
		int shoes = 0;
		ArrayList sizes = new ArrayList();
		
		int times = Integer.parseInt(scanman.nextLine());
		String list = scanman.nextLine();
		Scanner boi = new Scanner(list);
		for(; times>0; times--){
			
			sizes.add(boi.nextInt());
			
		}
		sizes.sort(null);
		
		while(sizes.size() > 0){
			int y = 0;
			int catdick = (int) sizes.get(0);
			if(sizes.size()>1 &&((sizes.get(0)==sizes.get(1)) || catdick+1==(int)sizes.get(1))){
				shoes++;
				sizes.remove(0);
				sizes.remove(0);
				
			}
			else{
				shoes++;
				sizes.remove(0);
			}
			
		}
		System.out.println("Litter #" + x + ": " + shoes);
		
	}
	
	
	}
}
