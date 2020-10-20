#
# Created by Jagannathan Asokan dated 20/10/20
#
number = 145898

total = 0
while(number > 0):
    digit = number % 10
    total = total + digit
    number = number // 10

print(total)
if total % 2 > 0:
    print('ODD')
else:
    print('EVEN')