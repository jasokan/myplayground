#
# Created by Jagannathan Asokan dated 20/10/20
#
tup_list = [('Suraj', 180, 'Delhi'), ('Jagan', 170, 'Bangalore'), ('Satya', 180 , 'Mumbai'), ('Swaroop', 170, 'Kolkatta') ]

sort_choice = 3
print(sorted(tup_list, key=lambda x :x[sort_choice-1]))