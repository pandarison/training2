
{USERCODE}

_,x,y = input().split(" ")
x = int(x)
y = int(y)
solution = Solution()
for i in range(x):
    a, b = input().split(" ")
    a = int(a)
    b = int(b)
    solution.setFamily(a, b)
for i in range(y):
    a, b = input().split(" ")
    a = int(a)
    b = int(b)
    if solution.isFamily(a, b):
        print("Yes")
    else:
        print("No")

