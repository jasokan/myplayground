#
# Created by Jagannathan Asokan
#

import urllib.request

web_content = urllib.request.urlopen('http://jagannathan.info').read().decode('utf8')

print(web_content)