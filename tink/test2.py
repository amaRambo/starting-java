from math import ceil

inp = input()
inp = inp.split()
n = int(inp[0])
m = int(inp[1])
k = int(inp[2])

while k<1 or k > m or m > n or n > 10000:
    inp = input('введите заново: ')
    inp = inp.split()
    n = int(inp[0])
    m = int(inp[1])
    k = int(inp[2])

print(ceil(n * k / m))