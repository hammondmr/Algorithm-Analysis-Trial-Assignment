//Moriah Hammond
import java.util.Scanner;

public class cmsc401 {
	
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		sc.nextLine();
		Integer [][] arr = new Integer[rows][1000];
		
		for(int i = 0; i<=rows+1; i++) {
			int col = 0;
			if(sc.hasNextLine()){
				String line = sc.nextLine();
				Scanner lineScan = new Scanner(line);
				//System.out.println("Line: " + line);
				int entries = lineScan.nextInt();
				//System.out.println("Entry: " + entries);
				arr[i][0] = entries;
				for (int j = 1; j<=entries; j++) {
					if(lineScan.hasNextInt()){
						arr[i][j] = lineScan.nextInt();
						//System.out.println(arr[i][j]);
					}
				}
				lineScan.close();
			}	
		}

/*
		for(int i = 0; i < rows; i++){
    		for(int j = 0; j < 1000; j++){
  	  		if(arr[i][j] != null)
       			System.out.printf("%5d ", arr[i][j]);
    		}
    		System.out.println();
 		}
 		*/
 		sc.close();

 		for (int i = 0; i<rows; i++) {
 			int length = arr[i][0];
			int index1 = arr[i][length];
			int index2 = arr[i][length-1];
 			//System.out.println("Row: " + i + " Length: " + length + " Index1: " + index1 + " Index2: " + index2);
 			//System.out.println("Value1 " + arr[i][index1] + " Value2 " + arr[i][index2]);
 			System.out.println(arr[i][index1] * arr[i][index2]);
 		}
 		
 		/*
 		for(int i = 0; i<rows; i++) {
			int length = arr[i][0];
			int index1 = arr[i][length-1];
			int index2 = arr[i][length-2];
			System.out.println(arr[i][index1]*arr[i][index2]);
		}
		*/
	}
}