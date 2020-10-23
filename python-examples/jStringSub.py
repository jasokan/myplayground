#
# Created by Jagannathan Asokan
#

import re
gletters = "ytt"
gword = "hypothetical"
res=re.findall(".*".join(list(gletters)), gword)
if res:
    print("True")
else:
    print("False")