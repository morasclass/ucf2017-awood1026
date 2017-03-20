import java.util.*;

public class jump{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int trials = Integer.parseInt(scanner.nextLine());		
		
		ArrayList<String> data = new ArrayList<String>();
		
		for(int i = 0; i<trials; i++) {
			data.add(scanner.nextLine());
			int directions = Integer.parseInt(data.get(data.size() -1).split(" ")[2]);
			for(int j = 0; j<directions; j++) {
				data.add(scanner.nextLine());
			}
		}

		int counter = 1;
		for(int i = 0; i<data.size(); i++){
			System.out.println("Trip #" + (counter) + " :");
			int x = Integer.parseInt(data.get(i).split(" ")[0]);
			int y = Integer.parseInt(data.get(i).split(" ")[1]);
			int inTrials = Integer.parseInt(data.get(i).split(" ")[2]);
			int[][] arr = new int[x][y];
			arr = populateArr(arr);
			
			for(int j = 0; j < inTrials; j++){
				String dir = data.get(i + j + 1);			
				if(dir.equals("R")){
					arr = shiftRight(arr);
				}
				else if(dir.equals("L")){
					arr = shiftLeft(arr);
				}
				else if(dir.equals("F")){
					arr = shiftForward(arr);
				}
				else{
					arr = shiftBackward(arr);
				}

				System.out.println(checkZero(arr));
				
			}
			counter++;
			i += inTrials;
		}
	}
	
	public static int[][] populateArr(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] = 1;
			}
		}
		return arr;
	}
	
	public static int[][] shiftRight(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = arr[i].length - 1; j > 0; j--){
				arr[i][j] += arr[i][j - 1];
				arr[i][j - 1] = 0;
			}
		}
		return arr;
	}
	
	public static int[][] shiftLeft(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length - 1; j++){
				arr[i][j] += arr[i][j + 1];
				arr[i][j + 1] = 0;
			}
		}
		return arr;
	}
	
	public static int[][] shiftForward(int[][] arr){
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] += arr[i + 1][j];
				arr[i + 1][j] = 0;
			}
		}
		return arr;
	}
	
	public static int[][] shiftBackward(int[][] arr){
		for(int i = arr.length - 1; i > 0; i--){
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] += arr[i - 1][j];
				arr[i - 1][j] = 0;
			}
		}
		return arr;
	}
	
	public static int checkZero(int[][] arr){
		int counter = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				if(arr[i][j] != 0){
					counter++;
				}
			}
		}
		return counter;
	}
	
	public static void printArr(int[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}
	}
}




















