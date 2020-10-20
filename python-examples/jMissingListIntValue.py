#
# Created by Jagannathan Asokan dated 20/10/20
#
test_list = [22,23,24,26]

print(set(range(test_list[0], test_list[-1])))
print(set(test_list))
print(sorted(set(range(test_list[0], test_list[-1])) - set(test_list))[0])
print(sorted(set(range(test_list[0], test_list[-1])) - set(test_list)))