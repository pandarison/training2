
{USERCODE}

x,y = input().split(" ")
x = int(x)
y = int(y)
solution = Solution()
solution.setRoad(x)
for i in range(y):
    a, b = input().split(" ")
    a = int(a)
    b = int(b)
    solution.removeTrees(a, b)
print(solution.getTrees())
