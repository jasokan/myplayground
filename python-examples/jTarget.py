#
# Created by Jagannathan Asokan
#

import jSource
def jTFunction(self):
    print("jTFunction()")

jSource.jParent.jFunction = jTFunction
jObj = jSource.jParent()
jObj.jFunction()
