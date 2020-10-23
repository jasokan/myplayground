#
# Created by Jagannathan Asokan
#

import numpy as np

notrials=10
probability=1/6

s=np.random.binomial(notrials, probability, size=10)
print(s)