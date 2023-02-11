package benchmarks;

import java.util.Scanner;

public class capilisortingbenchmarks {
	
	/* SIXTH - NINTH PROGRAMMING EXERCISES*/
	/* SUBMITTED BY: ANDREI CAPILI (BSCPE 1-1 - PUP BC)*/ 
	/* SORTING BENCHMARKS*/ 
	
	
    public static void NameAsk(){
        Scanner input = new Scanner(System.in);
        System.out.print("Hi! What's your name?: ");
        String userName = input.nextLine();
        introText(userName);
        

        input.close();
    }
    public static void introText (String userName) {
        System.out.println("Good day! " + userName + ", This program is designed to present a sample of sorting benchmarks.");
	
    }
    
    public static int[] bubbleSortArray = {97, 56, 12, 30, 35, 64, 46, 6, 95, 61, 82, 79, 73, 85, 53, 74, 98, 34, 10, 76};
    public static int[] insertionSortArray = {97, 56, 12, 30, 35, 64, 46, 6, 95, 61, 82, 79, 73, 85, 53, 74, 98, 34, 10, 76};
    public static int[] selectionSortArray = {97, 56, 12, 30, 35, 64, 46, 6, 95, 61, 82, 79, 73, 85, 53, 74, 98, 34, 10, 76};

    
    public static void bubbleSort(){
        int bubbleSwapCount = 0;

        for(int bubbleLoop1 = 1; bubbleLoop1 < bubbleSortArray.length; bubbleLoop1++){
            for(int bubbleLoop2 = 0; bubbleLoop2 < (bubbleSortArray.length-1); bubbleLoop2++){
                if(bubbleSortArray[bubbleLoop2] > bubbleSortArray[bubbleLoop2+1]){
                    int bubbleTemp = bubbleSortArray[bubbleLoop2+1];         
                    bubbleSortArray[bubbleLoop2+1] = bubbleSortArray[bubbleLoop2];  
                    bubbleSortArray[bubbleLoop2] = bubbleTemp;               
                    bubbleSwapCount++;
                }
            } 
        }

        System.out.print("Bubble Sorted Array: ");

        for(int loop = 0; loop < bubbleSortArray.length; loop++){
            System.out.print(bubbleSortArray[loop] + " ");
        }
        System.out.println();

        System.out.println("Swaps performed: " + bubbleSwapCount); 
    }

    public static void insertionSort(){
        int insertionSwapCount = 0;

        for(int insertionLoop1 = 1; insertionLoop1 < insertionSortArray.length; insertionLoop1++){
            for(int insertionLoop2 = insertionLoop1; insertionLoop2 > 0 && insertionSortArray[insertionLoop2-1] > insertionSortArray[insertionLoop2]; insertionLoop2--){                
                    int insertionTemp = insertionSortArray[insertionLoop2-1];
                    insertionSortArray[insertionLoop2-1] = insertionSortArray[insertionLoop2];
                    insertionSortArray[insertionLoop2] = insertionTemp;
                insertionSwapCount++;
            }
        }

        System.out.print("Insertion Sorted Array: ");

        for(int loop = 0; loop < insertionSortArray.length; loop++){
            System.out.print(insertionSortArray[loop] + " ");
        }

        System.out.println();

        System.out.println("Swaps performed: " + insertionSwapCount);
    }

    public static void selectionSort(){
        int selectionSwapCount = 0;
        int selectionLoop2;

        for(int selectionLoop1 = 0; selectionLoop1 < selectionSortArray.length; selectionLoop1++){
            int smallerValue = selectionLoop1;
            for(selectionLoop2 = (selectionLoop1+1); selectionLoop2 < selectionSortArray.length; selectionLoop2++){
                if(selectionSortArray[selectionLoop2] < selectionSortArray[smallerValue]){
                    smallerValue = selectionLoop2;
                }
            }
            if(smallerValue != selectionLoop1){                
                int selectionTemp = selectionSortArray[selectionLoop1];
                selectionSortArray[selectionLoop1] = selectionSortArray[smallerValue];
                selectionSortArray[smallerValue] = selectionTemp;
                selectionSwapCount++;
            }
        }

        System.out.print("Selection Sorted Array: ");

        for(int loop = 0; loop < selectionSortArray.length; loop++){
            System.out.print(selectionSortArray[loop] + " ");
        }

        System.out.println();

        System.out.println("Swaps performed: " + selectionSwapCount);
    }

    public static void main(String[] args) {
        
    	NameAsk();
        introText();
        
        System.out.print("Unsorted Array: ");
        for(int bubbleLoop = 0; bubbleLoop < bubbleSortArray.length; bubbleLoop++ ){
        System.out.print(bubbleSortArray[bubbleLoop] + " ");
        }

        System.out.println();
        System.out.println();

        bubbleSort();
        System.out.println();

        insertionSort();
        System.out.println();

        selectionSort();
    }
	private static void introText() {
		// TODO Auto-generated method stub
		
	}

}
