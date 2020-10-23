#
# Created by Jagannathan Asokan
#
import math

def checkArmstrong(givenNumber):
    digitCount = 3
    number = givenNumber
    total = 0
    while number > 0:
        lastDigit = number % 10
        number = math.floor( number/ 10)
        total = total + lastDigit**digitCount

    # If condition satisfies
    return total == givenNumber


testnumber=153
print(checkArmstrong(testnumber))


