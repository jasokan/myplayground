#
# Created by Jagannathan Asokan
#

glist = [1,2,3,4,5,6,7,8,9,0,11,12,13,14,15,16]
split_count = 4
slist = [glist[i:i + split_count] for i in range(0, len(glist), split_count)]
for i in range(0, len(slist)):
    print(slist[i])