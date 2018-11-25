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
