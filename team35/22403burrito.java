import java.util.Scanner;

public class burrito {

	public static void main(String[] args){
	
	Scanner scanman = new Scanner(System.in);
	
	double times = scanman.nextDouble();
	
	for(int x = 1; times >= x; x++){
		
		double volume = scanman.nextDouble();
		double radius = scanman.nextDouble();
		
		double length = (volume/3.141592653589793)/(radius*radius);
		
		double widthFoil = scanman.nextDouble();
		double lengthFoil = scanman.nextDouble();
	
		if((length + 2*radius <= widthFoil || length + 2*radius <= lengthFoil) && (2*3.141592653589793*radius*radius <= widthFoil || 2*3.141592653589793*radius*radius <= lengthFoil )){
	
			
			System.out.println("Burrito #" + (int)x + ": Don't worry, the burrito fits!");
			
		}else{
		
			System.out.println("Burrito #" + (int)x + ": Looks like a cold burrito today.");
		}
		
	}
}
}

