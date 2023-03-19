








size = int(input())
str = input()
while size != len(str):
    print('длина строка не совпадает с введенным размером. ВВедите заново')
    size = int(input())
    str = input()
i = 0
Flag = True
if "a" in str and "b" in str and "c" in str and "d" in str:
    while (Flag):
        if "a" in str[i+1:size] and "b" in str[i+1:size] and "c" in str[i+1:size] and "d" in str[i+1:size]:
            i+=1
        elif "a" in str[i:size-1] and "b" in str[i:size-1] and "c" in str[i:size-1] and "d" in str[i:size-1]:
            size-=1
        else: Flag = False
        Result = str[i:size]
    print(len(Result))
else:
    print(-1)





