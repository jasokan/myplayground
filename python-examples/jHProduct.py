
from sys import argv
from itertools import islice

# array backed by python list
def array_insert(arr, index, elem):
   if index == 0:
      arr[0] = elem
   elif index == 1:
      arr[0] = arr[1]
      arr[1] = elem
   else:
      arr[0] = arr[1]
      arr[1] = arr[2]
      arr[2] = elem

a = eval(argv[1])
if len(a) <=3:
   largest_3 = a
else:
   largest_3 = sorted([a[0], a[1], a[2]])
   print largest_3
   for i in islice(a, 3, None):
      if i > largest_3[2]:
         array_insert(largest_3, 2, i)
         print largest_3
      elif i > largest_3[1]:
         array_insert(largest_3, 1, i)
         print largest_3
      elif i > largest_3[0]:
         array_insert(largest_3, 0, i)
         print largest_3
      else:
         print largest_3
prod = 1
for i in largest_3:
   prod *= i
print prod
