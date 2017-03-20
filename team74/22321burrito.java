import java.util.*;
import java.math.*;
public class burrito {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int cases = Integer.parseInt(scan.nextLine());
		
		for(int i=0; i<cases; i++){
			int v = scan.nextInt();
			int r = scan.nextInt();
			int l = scan.nextInt();
			int w = scan.nextInt();
			BigDecimal c = circ(r);
			double bl = length(v,r);
			boolean shi = false;
			if((new BigDecimal("" + r).add(new BigDecimal(bl)).compareTo(new BigDecimal("" + w)) <= -1)){
				if(c.compareTo(new BigDecimal("" + l)) <= -1){
					shi = true;
				}
			}
			else if((new BigDecimal("" + r).add(new BigDecimal(bl))).compareTo(new BigDecimal("" + l)) <= -1) {
				if(c.compareTo(new BigDecimal("" + w)) <= -1){
					shi = true;
				}
			}
			
			if(shi==true){
				System.out.println("Burrito #" + (i+1) +  " Don't worry, the burrito fits!");
			}
			else{
				System.out.println("Burrito #" + (i+1) +  " Looks like a cold burrito today.");
			}
			
		}
		
		
	}
	
	public static BigDecimal circ(int r){
		BigDecimal a = new BigDecimal(""+r);
		a.multiply(new BigDecimal("2")).multiply(new BigDecimal("3.141592653589793"));
		return a;
	}
	public static double length(int v, int r){
		double l = v / Math.pow(r, 2) / 3.141592653589793;
		return l;
	}
	
}
