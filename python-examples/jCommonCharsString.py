#
# Created by Jagannathan Asokan dated 20/10/20
#

s1 = 'An independent clause can stand alone as a sentence. It contains a subject and a verb and is a complete idea.'
s2 = 'A dependent clause is not a complete sentence. It must be attached to an independent clause to become complete. This is also known as a subordinate clause.'

check = list(set(s1) & set(s2))
check.sort()
if len(check):
    for char in check:
        print(char)
