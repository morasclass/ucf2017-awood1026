import java.util.*;
public class shoes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int tests = scan.nextInt();
		
		for(int i = 0; i<tests; i++) {
			
		}
		
		for(int i = 0; i<tests; i++) {
			int horses = scan.nextInt();
			int pairs = 0;
			
			ArrayList<Integer> sizes = new ArrayList<Integer>();
			int[] s = new int[horses];
			for(int j = 0; j<horses; j++) {
				s[j] = scan.nextInt();
			}
			
			Arrays.sort(s);
			for(int j = 0; j<s.length; j++) {
				sizes.add(s[j]);
			}
			
			for(int j = sizes.size() - 1; j>=1; j--) {
				if(sizes.get(j) == sizes.get(j-1) || sizes.get(j) == sizes.get(j-1) -1 || sizes.get(j) == sizes.get(j-1)+1 ) {
					sizes.remove(j);
					sizes.remove(j-1);
					j--;
					pairs++;
					
				}
			}
			System.out.println("Litter #" + (i + 1) + ": " + (pairs + sizes.size()));
			
		}
	}

}
