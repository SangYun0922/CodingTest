
count = int(0)
def move (src, dst) :
    print(src,dst)

def hanoi (N, src, dst, via) :

    if ( N == 1 ) :
        move(src,dst)
    else :
        hanoi(N-1,src,via,dst)
        move(src, dst)
        hanoi(N-1,via,dst,src)

a = int(input())
if a == 1 :
    count += 1
    print(count)
else :
    count = 2**a - 1
    if (a <= 20) :
        print(count)
        hanoi(a, '1', '3', '2')
    else :
        print(count)

