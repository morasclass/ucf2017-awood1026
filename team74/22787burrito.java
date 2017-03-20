import java.util.*;

public class burrito{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int trials = Integer.parseInt(scanner.nextLine());
		ArrayList<String> data = new ArrayList<String>();
		
		for(int i = 0; i<trials*2; i++) {
			data.add(scanner.nextLine());
		}
		
		ArrayList<String> output = new ArrayList<String>();
		
		for(int i = 0; i<data.size() - 1; i+=2) {
			int v = Integer.parseInt(data.get(i).split(" ")[0]);
			int r = Integer.parseInt(data.get(i).split(" ")[1]);
			int l = Integer.parseInt(data.get(i + 1).split(" ")[0]);
			int w = Integer.parseInt(data.get(i + 1).split(" ")[1]);
			
			double bl = v/(3.141592653589793*Math.pow(r,2));
			double c = 2 * 3.141592653589793 * r;
			
			if(l>=c && w>=(bl+(2*r))){
				output.add("Burrito #" + ((i/2) + 1) + ": Don't worry, the burrito fits!");
			}
			else if(w>=c && l>=(bl+(2*r))){
				output.add("Burrito #" + ((i/2) + 1) + ": Don't worry, the burrito fits!");
			}
			else {
				output.add("Burrito #" + ((i/2) + 1) + ": Looks like a cold burrito today.");
			}
		}
		
		for(String s : output) {
			System.out.println(s);
		}
	}
}