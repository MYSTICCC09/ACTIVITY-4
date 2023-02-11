# /* SIXTH - NINTH PROGRAMMING EXERCISES*/
# /* SUBMITTED BY: ANDREI CAPILI (BSCPE 1-1 - PUP BC)*/
# /* SEARCH BENCHMARKS*/

def inputName():
    name = input("Hi! What's your name?:")
    return name


def introText(name):
    print("Good day! " + name + ", This program is designed to present search benchmarks).")
    print("")

searchArray = [97, 56, 12, 30, 35, 64, 46, 6, 95, 61, 82, 79, 73, 85, 53, 74, 98, 34, 10, 76]

targetValue = 30

def binarySearch():
    left = 0
    right = (len(searchArray)-1)

    binarySearchComparisonCount = 0

    while(left <= right):
        middle = (left + right) //2
        binarySearchComparisonCount+=1
        if(searchArray[middle] == targetValue):
            middle = searchArray[middle]
        elif(searchArray[middle] < targetValue):
            left = middle + 1
        else:
            right = middle -1
    print("Total comparisons performed using binary search: ", binarySearchComparisonCount)

def sequentialSearch():
    sequentialSearchComparisonCount = 0
    for sequentialLoop in range(0, len(searchArray)):
        sequentialSearchComparisonCount+=1
        if(searchArray[sequentialLoop] == targetValue):
            break


    print("Total comparisons performed during sequential search:", sequentialSearchComparisonCount)

print("Unsorted Array:", end = " ")
for loop in range(0, len(searchArray)):
    print(searchArray[loop], end = " ")
print()
print("Target Value:", targetValue)
name = inputName()
introText(name)
binarySearch()
sequentialSearch()