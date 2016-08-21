def rev(s):
  newString=''
  j=len(s)-1
  while j>=0:
    newString+=s[j]
    j=j-1
  return int(newString)	
	

t=int(raw_input())
for i in range(t):
  Numbers=[]
  Numbers=(raw_input().split())
  n1=rev(Numbers[0])
  n2=rev(Numbers[1])
  sum=n1+n2
  revsum=rev(str(sum))
  print(revsum)