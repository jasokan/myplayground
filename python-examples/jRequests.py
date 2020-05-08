import requests

webrequest = requests.get('http://www.google.com')
print(webrequest.elapsed)
print(webrequest.status_code)

