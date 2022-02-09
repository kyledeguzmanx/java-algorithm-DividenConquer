import java.io.File;  //  File class
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindMaxSum {
	
	public static void main(String args[]) {
			
			int numElements;
			int finalSum;
	
			try {
				//Create file, read file, and create array
				File file = new File("input.txt");
				Scanner scanner = new Scanner(file);
				numElements = scanner.nextInt();
				int [] array = new int [numElements];
				
				
				//Input Text File to Array
				for(int i=0; i < numElements; i++) {
					array[i] = scanner.nextInt();
				}
				
				finalSum = maxOfArray(array,0,numElements-1);
				System.out.println(finalSum);		
			}
			 catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			}
	}//end-main
	
	static int maxOfArray(int arry[], int startIndex, int endIndex) {
		if(startIndex == endIndex) return arry[endIndex];
		int pivot  = (startIndex+endIndex)/2;  //split array into 2
		
		return Math.max(
				Math.max(maxOfArray(arry,startIndex, pivot),   //from start to pivot
						maxOfArray(arry, pivot+1, endIndex)),  // from pivot to end
						maxOfTotalArray(arry, startIndex, endIndex, pivot)); //entire array
	}
	
	static int maxOfTotalArray(int arry[], int startIndex, int endIndex, int pivot) {
		int sum=0, leftSum = 0,  rightSum = 0, i = pivot;

		do {
			sum += arry[i];
			leftSum = sum>leftSum ? sum : leftSum;
			i--;
		}while(i >= startIndex);
		
		sum=0;
		i = pivot + 1;
		
		do {
			sum += arry[i];
			rightSum = sum > rightSum ? sum : rightSum;
			i++;
		}while(i <= endIndex);
		
		return Math.max(Math.max(leftSum, rightSum),leftSum + rightSum); //which is bigger? left? right? entire array?
		
	}
	
}
