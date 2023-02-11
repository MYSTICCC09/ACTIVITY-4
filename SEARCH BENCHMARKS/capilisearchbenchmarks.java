package benchmarks;

import java.util.Scanner;
import java.util.Arrays;

public class capilisearchbenchmarks {

	/* SIXTH - NINTH PROGRAMMING EXERCISES*/
	/* SUBMITTED BY: ANDREI CAPILI (BSCPE 1-1 - PUP BC)*/ 
	/* SEARCH BENCHMARKS*/
	
	public static void NameAsk(){
        Scanner input = new Scanner(System.in);
        System.out.print("Hi! What's your name?: ");
        String userName = input.nextLine();
        introText(userName);
        

        input.close();
    }
    public static void introText (String userName) {
        System.out.println("Good day! " + userName + ", This program is designed to present a sample of search benchmarks.");
	
    }
	
    public static int[] searchArray = {97, 56, 12, 30, 35, 64, 46, 6, 95, 61, 82, 79, 73, 85, 53, 74, 98, 34, 10, 76};
    public static int targetValue = 30;

    public static void binarySearch(){

        int left = 0;
        int middle;
        int right = (searchArray.length - 1);
        int binarySearchComparisonCount = 0;

        while(left <= right){
            middle = (left + right) / 2;
            binarySearchComparisonCount++;
            if(searchArray[middle] == targetValue){
                break;
            }else if(searchArray[middle] < targetValue){
                left = middle + 1;
            }else{
                right = middle - 1;
            }
        
        }

        System.out.println("Total comparisons performed using binary search: " + binarySearchComparisonCount);
    }

    public static void sequentialSearch(){

        int sequentialSearchComparisonCount = 0;

        for(int sequentialLoop = 0; sequentialLoop < searchArray.length; sequentialLoop++){
            sequentialSearchComparisonCount++;
            if(searchArray[sequentialLoop] == targetValue){
                break;
            }
        }
        
        System.out.println("Total comparisons performed using sequential search: " + sequentialSearchComparisonCount);

    }

    public static void main(String[] args){
    	
    	NameAsk();
        introText();

    	System.out.print("Given Array: ");
        for(int loop = 0; loop < searchArray.length; loop++){
            System.out.print(searchArray[loop] + " ");}
        
        
        System.out.println();

        System.out.println("Target Value: " + targetValue);
        
  
        }
	private static void introText() {
		// TODO Auto-generated method stub
		
	}
        

      
    
}