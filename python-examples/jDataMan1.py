#
# Created by Jagannathan Asokan
#

import pandas as pandaData

# installing Pandas
# pip install numpy
# sudo apt-get install python3-dev
# pip install pandas

jdataSeries = pandaData.read_csv("test.csv", squeeze=True)
print(jdataSeries.count())
print(jdataSeries.sum())