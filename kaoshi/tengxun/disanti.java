
def at(a,b):
        res =a|(a+b)
        return res
        def calculate(s):
        stack = []
        operate,res="+",0
        l=len(s)
        for i in range(l):
        if s[i].isdigit():
        res = res * 10 + int(s[i])
        if s[i] in "+x@" or i==l-1:
        if operate =="+":
        stack.append(res)
        elif operate == "x":
        stack.append(stack.pop()*res)
        else:
        stack.append(at(stack.pop(),res))
        operate = s[i]
        res=0
        return sum(stack)

        s = input()
        result = calculate(s)
        print(result)