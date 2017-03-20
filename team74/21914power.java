import java.util.*;
public class power {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cases = scan.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0; i<cases; i++) {
			arr.add(scan.nextInt());
		}
		
		for(int i = 0; i<arr.size(); i++) {
			System.out.println((int)(Math.pow(2,arr.get(i)) - 1));
		}
	}

}
