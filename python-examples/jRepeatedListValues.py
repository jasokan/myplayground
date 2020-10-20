#
# Created by Jagannathan Asokan dated 20/10/20
#

test_list=['Bangalore', 'Bangalore', 'Bangalore', 'Delhi', 'Delhi', 'Mumbai','Mumbai', 'Pune', 'Pune']

count = len(test_list)
dict={}
for i in test_list:
    if i not in dict:
        dict[i]=1
    else:
        dict[i]=dict[i]+1

print(dict)

highest_value = max(dict, key= lambda x: dict[x])
print(highest_value)
print(dict[highest_value])