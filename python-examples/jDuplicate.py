#
# Created by Jagannathan Asokan
#

from sys import argv
x = argv[1]
uniq_chars = set()
dup_chars = set()
for c in x:
   if c in uniq_chars:
      dup_chars.add(c)
   else:
      uniq_chars.add(c)
print dup_chars
