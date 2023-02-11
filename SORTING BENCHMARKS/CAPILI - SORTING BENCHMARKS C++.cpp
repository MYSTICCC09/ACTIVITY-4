/* SIXTH - NINTH PROGRAMMING EXERCISES*/
/* SUBMITTED BY: ANDREI CAPILI (BSCPE 1-1 - PUP BC)*/
/* SEARCH BENCHMARKS*/

#include<iostream>

using namespace std;

int searchArray[] = {97, 56, 12, 30, 35, 64, 46, 6, 95, 61, 82, 79, 73, 85, 53, 74, 98, 34, 10, 76};
int targetValue = 30;

string greetUser (){
        string userName;
        cout<<"Hi! What's your name?:";
        cin>>userName;
        cout<<"Good day! " + userName + ", This program is designed to generate random numbers."<<endl;
        return userName;
    };

int bubbleSortArray[] = {97, 56, 12, 30, 35, 64, 46, 6, 95, 61, 82, 79, 73, 85, 53, 74, 98, 34, 10, 76};
int insertionSortArray[] = {97, 56, 12, 30, 35, 64, 46, 6, 95, 61, 82, 79, 73, 85, 53, 74, 98, 34, 10, 76};
int selectionSortArray[] = {97, 56, 12, 30, 35, 64, 46, 6, 95, 61, 82, 79, 73, 85, 53, 74, 98, 34, 10, 76};

void bubbleSort(){
    int bubbleSwapCount = 0;

    for(int bubbleLoop1 = 1; bubbleLoop1 < (sizeof(bubbleSortArray)/sizeof(int)); bubbleLoop1++){
        for(int bubbleLoop2 = 0; bubbleLoop2 < ((sizeof(bubbleSortArray)/sizeof(int))-1); bubbleLoop2++){
            if(bubbleSortArray[bubbleLoop2] > bubbleSortArray[bubbleLoop2+1]){
                int bubbleTemp = bubbleSortArray[bubbleLoop2];
                bubbleSortArray[bubbleLoop2] = bubbleSortArray[bubbleLoop2+1];
                bubbleSortArray[bubbleLoop2+1] = bubbleTemp;
                bubbleSwapCount++;
            }
        }
    }

    cout << "Bubble Sorted Array: ";

    for(int loop = 0; loop < (sizeof(bubbleSortArray)/sizeof(int)); loop++){
        cout << bubbleSortArray[loop] << " ";
    }

    cout << "\n";

    cout << "Number of swaps performed: " << bubbleSwapCount;

}

void insertionSort(){

    int insertionSwapCount = 0;

        for(int insertionLoop1 = 1; insertionLoop1 < (sizeof(insertionSortArray)/sizeof(int)); insertionLoop1++){
            for(int insertionLoop2 = insertionLoop1; insertionLoop2 > 0 && insertionSortArray[insertionLoop2-1] > insertionSortArray[insertionLoop2]; insertionLoop2--){                
                    int insertionTemp = insertionSortArray[insertionLoop2-1];
                    insertionSortArray[insertionLoop2-1] = insertionSortArray[insertionLoop2];
                    insertionSortArray[insertionLoop2] = insertionTemp;
                insertionSwapCount++;
            }
        }
    
    cout << "Insertion Sorted Array: ";

    for(int insertionLoop = 0; insertionLoop < (sizeof(insertionSortArray)/sizeof(int)); insertionLoop++){
        cout << insertionSortArray[insertionLoop] << " ";
    }

    cout << "\n";

    cout << "Number of swaps performed: " << insertionSwapCount;
}

void selectionSort(){
    int selectionSwapCount = 0;
    int selectionLoop2;

    for(int selectionLoop1 = 0; selectionLoop1 < (sizeof(selectionSortArray)/sizeof(int)); selectionLoop1++){
        int smallerValue = selectionLoop1;
        for(selectionLoop2 = (selectionLoop1+1); selectionLoop2 < (sizeof(selectionSortArray)/sizeof(int)); selectionLoop2++){
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

    cout << "Selection Sorted Array: ";

    for(int loop = 0; loop < (sizeof(selectionSortArray)/sizeof(int)); loop++){
        cout << selectionSortArray[loop] << " ";
    }

    cout << "\n";
    
    cout << "Number of swaps performed: " << selectionSwapCount;

}

int main(){

string userName;

cout << "Unsorted Array: ";

for(int bubbleLoop = 0; bubbleLoop < (sizeof(bubbleSortArray)/sizeof(int)); bubbleLoop++){
    cout << bubbleSortArray[bubbleLoop] << " ";
}

cout << "\n";
cout << "\n";
bubbleSort();
cout << "\n";
cout << "\n";
insertionSort();
cout << "\n";
cout << "\n";
selectionSort();
}