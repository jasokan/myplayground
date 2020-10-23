#
# Created by Jagannathan Asokan
#

import re
jInputString = "Even if the string; contains multiple delimiters, python will * split ** the string properly!"
jSplitString = re.split(';|,|\\*|\n', jInputString)
for jIndString in jSplitString :
    print(jIndString.strip())
