#
# Created by Jagannathan Asokan dated 20/10/20
#
test_list = [78,90,170,300,520,510,550,600]

check_increase=all(i < j for i, j in zip(test_list, test_list[1:]))

print(check_increase)