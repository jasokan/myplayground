fString="Jagan"
sString="nathan"

print("Concat ", fString..sString)
cString=fString..sString
print("Length of firstString  ", #fString)
print("Length of Jagannathan  ", #"Jagannathan")
print("Length of cString  ", #cString)
print("Upper Case  of cString  ", string.upper(cString))
print("SubString   ", string.sub(cString, 0, 5))
indexStart, indexEnd = string.find(cString, "Jagan")
print(indexStart, indexEnd)
print("global Substitution  ", string.gsub(cString, "nathan", "mohan"))
independenceDay="India got independence on 15/08/1947, thanks"
dateformat="%d%d/%d%d/%d%d%d%d"
print("Independence day  ", string.sub(independenceDay, string.find(independenceDay, dateformat)))
/*
.	all characters
%a	letters
%c	control characters
%d	digits
%l	lower case letters
%p	punctuation characters
%s	space characters
%u	upper case letters
%w	alphanumeric characters
%x	hexadecimal digits
%z	the character with representation 0
*/
