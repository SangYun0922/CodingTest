testcase = int(input())
for i in range (0, testcase) :
    a = input().split()
    sum = 0
    aver = 0
    count = 0
    result = 0
    for j in range (1, int(a[0]) + 1) :
        sum += int(a[j])
    aver = round(sum/int(a[0]), 3)
    for k in range (1, int(a[0]) + 1) :
        if (int(a[k]) > aver) :
            count += 1
    result = round((count/int(a[0]))*100,3)
    print(f"{result:.3f}%")

