# your code goes here
for _ in xrange(int(raw_input())):
    i=raw_input()
    n=raw_input()
    a,sum=n.split('=')
    x,y=str(a).split('+')
    if "machula" in sum:
        x=int(x)
        y=int(y)
        print "%s + %s = %s"%(x,y,x+y)
    elif "machula" in x:
        sum=int(sum)
        y=int(y)
        print "%s + %s = %s"%(sum-y,y,sum)
    else:
        x=int(x)
        sum=int(sum)
        print "%s + %s = %s"%(x,sum-x,sum)
