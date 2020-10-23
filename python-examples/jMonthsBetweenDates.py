#
# Created by Jagannathan Asokan
#

from datetime import datetime, timedelta, date
from collections import OrderedDict

sdate = date(2019, 1, 1)
edate = date(2019, 7, 15)

dates=[str(sdate), str(edate)]
start, end = [datetime.strptime(_, "%Y-%m-%d") for _ in dates]
orderedmonths = OrderedDict(((start + timedelta(_)).strftime(r'%B'), None) for _ in range((end - start).days)).keys()
print(list(orderedmonths))