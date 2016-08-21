# your code goes here
def f(x):  
    if x == 0:  
        return 1  
    else:  
        return x * f(x-1)  
  
i=int(raw_input())
for t in range(0,i):  
    print "%d" % f(input()) 