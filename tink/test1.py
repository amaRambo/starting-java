






b = input().split()

for i in range(len(b)):
    b[i] = int(b[i])

flag = True
i = 0
while flag:
    if b[i] > b[i+1]:
        flag = False
    i += 1
    if i == len(b)-1:break

if flag == True:
    print('YES')
else:
    print('NO')