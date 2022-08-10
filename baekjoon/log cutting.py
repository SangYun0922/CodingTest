import sys

t = int(sys.stdin.readline())
for __ in range(t) :
    log = list(map(int, sys.stdin.readline().split()))
    k = log[1] + 1
    k_list = sorted(list(map(int, sys.stdin.readline().split())))
    page = []  # 자른 조각을 list로 저장하기 위한 공간
    tmp = 0
    for e in range(0, log[1]):
        if (e == 0):
            tmp = max(k_list[e], log[0] - k_list[e])
            page.append(min(k_list[e], log[0] - k_list[e]))
        else:
            page.append(k_list[e] - sum(page))
            tmp = tmp - (k_list[e] - sum(page))
            if (e == log[1] - 1):
                page.append(log[0] - sum(page))

    table = [[0]*k for _ in range(k)]
    for i in range(k-1):
        table[i][i+1] = page[i] + page[i+1]
        for j in range(i+2, k):
            table[i][j] = table[i][j-1] + page[j]

    for d in range(2,k):
        for i in range(k-d):
            j = i+d
            minimum = [table[i][k] + table[k+1][j] for k in range(i, j)]
            table[i][j] += min(minimum)

    print(table[0][k-1])

