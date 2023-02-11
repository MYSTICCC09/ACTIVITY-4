# /* SIXTH - NINTH PROGRAMMING EXERCISES*/
# /* SUBMITTED BY: ANDREI CAPILI (BSCPE 1-1 - PUP BC)*/
# /* SORTING BENCHMARKS*/

def main():
    inputName()
    introText()
    insertionSort()
    selectionSort()

def inputName():
    name = input("Hi! What's your name?:")
    return name

def introText(name):
    print("Good day! " + name + ", This program is designed to present sorting benchmarks).")
    print("")


bubbleSortArray = [97, 56, 12, 30, 35, 64, 46, 6, 95, 61, 82, 79, 73, 85, 53, 74, 98, 34, 10, 76]
insertionSortArray = [97, 56, 12, 30, 35, 64, 46, 6, 95, 61, 82, 79, 73, 85, 53, 74, 98, 34, 10, 76]
selectionSortArray = [97, 56, 12, 30, 35, 64, 46, 6, 95, 61, 82, 79, 73, 85, 53, 74, 98, 34, 10, 76]

def bubbleSort():

    bubbleSwapCount = 0

    for bubbleLoop1 in range(1, len(bubbleSortArray)):
        for bubbleLoop2 in range(0, (len(bubbleSortArray)) - 1):
            if (bubbleSortArray[bubbleLoop2] > bubbleSortArray[bubbleLoop2 + 1]):
                bubbleSortArray[bubbleLoop2], bubbleSortArray[bubbleLoop2 + 1] = bubbleSortArray[bubbleLoop2 + 1], \
                                                                                 bubbleSortArray[bubbleLoop2]
                bubbleSwapCount += 1

    print("Bubble Sorted Array:", end=" ")
    loop = 0
    while (loop < len(bubbleSortArray)):
        print(bubbleSortArray[loop], end=" ")
        loop += 1

    print()

    print("Swaps performed:", bubbleSwapCount)


def insertionSort():
    insertionSwapCount = 0

    for insertionLoop1 in range(1, len(insertionSortArray)):
        insertionLoop2 = insertionLoop1
        while insertionLoop2 > 0 and insertionSortArray[insertionLoop2 - 1] > insertionSortArray[insertionLoop2]:
            insertionSortArray[insertionLoop2], insertionSortArray[insertionLoop2 - 1] = insertionSortArray[
                                                                                             insertionLoop2 - 1], \
                                                                                         insertionSortArray[
                                                                                             insertionLoop2]
            insertionSwapCount += 1
            insertionLoop2 -= 1

    print("Insertion Sorted Array:", end=" ")
    loop = 0
    while (loop < len(insertionSortArray)):
        print(insertionSortArray[loop], end=" ")
        loop += 1

    print()

    print("Swaps performed:", insertionSwapCount)

def selectionSort():
    selectionSwapCount = 0

    for selectionLoop1 in range(0, len(selectionSortArray)):
        smallerValue = selectionLoop1
        selectionLoop2 = selectionLoop1 + 1
        for selectionLoop2 in range(selectionLoop2, len(selectionSortArray)):
            if (selectionSortArray[selectionLoop2] < selectionSortArray[smallerValue]):
                smallerValue = selectionLoop2
        if (smallerValue != selectionLoop1):
            selectionSortArray[selectionLoop1], selectionSortArray[smallerValue] = selectionSortArray[smallerValue], \
                                                                                   selectionSortArray[selectionLoop1]
            selectionSwapCount += 1



    print("Selection Sorted Array:", end=" ")
    loop = 0
    while (loop < len(selectionSortArray)):
        print(selectionSortArray[loop], end=" ")
        loop += 1

    print()



    print("Swaps performed:", selectionSwapCount)


print("Unsorted Array:", end=" ")
for bubbleLoop in range(0, len(bubbleSortArray)):
    print(bubbleSortArray[bubbleLoop], end=" ")

print()
print()


bubbleSort()
print()
insertionSort()
print()
selectionSort()

inputName()
introText()