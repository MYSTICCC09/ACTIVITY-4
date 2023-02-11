# /* SIXTH - NINTH PROGRAMMING EXERCISES*/
# /* SUBMITTED BY: ANDREI CAPILI (BSCPE 1-1 - PUP BC)*/
# /* LOTTERY NUMBER GENERATOR*/

import random

def main():
    name = inputName()
    introText(name)
    lotteryNumberGenerator()


def inputName():
    name = input("Hi! What's your name?:")
    return name


def introText(name):
    print("Good day! " + name + ", This program is designed to generate random numbers).")
    print("")


def lotteryNumberGenerator():
    loop = 0
    lotteryNumbers = [0] * 7

    while loop < len(lotteryNumbers):
        lotteryNumbers[loop] = random.randint(0, 9)  # Generates a random integer in the range of 0 to 9
        print(lotteryNumbers[loop], end=" ")
        loop += 1

name = inputName()
introText(name)


print("Generated Lottery Numbers: ", end="")
lotteryNumberGenerator()