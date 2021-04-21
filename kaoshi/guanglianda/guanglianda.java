


    n=int(input())
    An=[int(i) for i in input().strip().split()]
    niu=[]
    yang=[]
            An.sort()
            for i in range(len(An)//2):
    niu.append(An.pop())
            yang.append(An.pop())
            if len(An)>0:
            niu.append(An.pop())
    print(sum(niu)-sum(yang))

