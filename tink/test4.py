

n = int(input('введите кол-во дней: '))
otr = input('введите изменения баланса по дням через пробел: ').split()

while n != len(otr):
    print('Неверно введены данные, введите заново: ')
    n = int(input('введите кол-во дней: '))
    otr = input('введите изменения баланса по дням через пробел: ').split()

for i in range(len(otr)):
    otr[i] = int(otr[i])
print(otr)

k=0
res = []
for i in range(len(otr)+1):
    if sum(otr[0:i]) >= 0 and len(otr[0:i]) > 1:
        res.append(otr[0:i])



print(res)

