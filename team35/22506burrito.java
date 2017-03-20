import java.util.Scanner;

public class burrito {

	public static void main(String[] args){
	
	Scanner scanman = new Scanner(System.in);
	
	double times = scanman.nextDouble();
	
	for(int x = 1; times >= x; x++){
		
		double volume = scanman.nextDouble();
		double radius = scanman.nextDouble();
		
		double length = (volume/3.141592653589793)/(radius*radius);
		double pi = 3.141592653589793;
		double widthFoil = scanman.nextDouble();
		double lengthFoil = scanman.nextDouble();
		
		
		if(( (length + 2*radius <= widthFoil) && (2*pi*radius*radius <= lengthFoil) ) || ( (length + 2*radius <= lengthFoil) && (2*pi*radius*radius <= widthFoil) )){
	
			
			System.out.println("Burrito #" + (int)x + ": Don't worry, the burrito fits!");
			
		}else{
		
			System.out.println("Burrito #" + (int)x + ": Looks like a cold burrito today.");
		}
		
	}
}
}

