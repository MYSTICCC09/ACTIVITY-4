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

void binarySearch(){
    int left = 0;
        int middle;
        int right = ((sizeof(searchArray)/sizeof(int)) - 1);
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

        cout << "Total comparisons performed using binary search: " << binarySearchComparisonCount;
}

void sequentialSearch(){

    int sequentialSearchComparisonCount = 0;

    for(int sequentialLoop = 0; sequentialLoop < (sizeof(searchArray)/sizeof(int)); sequentialLoop++){
        sequentialSearchComparisonCount++;
        if(searchArray[sequentialLoop] == targetValue){
            break;
        }
    }
        
        cout << "Total comparisons performed using sequential search: " << sequentialSearchComparisonCount;

    }
    
int main(){
    
string userName;

    cout << "Given Array: ";
    for(int loop = 0; loop < (sizeof(searchArray)/sizeof(int)); loop++){
        cout << searchArray[loop] << " ";
    }
    
    cout << "\n";
    cout << "Target Value: " << targetValue << "\n";
    binarySearch();
    cout << "\n";
    sequentialSearch();
}