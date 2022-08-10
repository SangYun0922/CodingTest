import random
from time import sleep

print('숫자 야구 게임에 오신것을 환영합니다.')
sleep(1.5)
print('숫자 야구 게임이란 감춰진 3개의 숫자가 무엇인지 맞추는 게임입니다!')
sleep(1.5)
print('제한횟수 10회안에 3자리 숫자와 위치를 맞추면 승리하게 됩니다!')
sleep(1.5)
print('숫자와 위치를 맞추면 스트라이크! 숫자만 맞으면 볼! 전부 맞지 않을경우는 아웃입니다!')
sleep(1.5)
print('숫자는 0~9까지 구성되어 있으며, 각 숫자는 서로 다른 수로 구성되어있습니다!')

while(1) : ##한번 실행하고 종료하는것이 아닌 계속 재도전을 할수있게 무한루프를 설정
    ranarr = [0, 0, 0]
    ranarr[0] = int(random.randrange(0, 10))
    ranarr[1] = ranarr[0]
    ranarr[2] = ranarr[1]
    while (ranarr[0] == ranarr[1]):  ## 기존 숫자와 같을 경우 계속 random생성을 실행시켜서 다른 것이 추출되도록함
        ranarr[1] = int(random.randrange(0, 10))
    while (ranarr[0] == ranarr[2] or ranarr[1] == ranarr[2]):  ##마찬가지로 ranarr가 서로 다를때까지 계속 while루프안에서 랜덤 생성
        ranarr[2] = int(random.randrange(0, 10))
    ##print(ranarr) 테스트용도로 사용한 출력문
    sleep(1.5)
    print('숫자 야구 게임을 시작하겠습니다!')
    print('---------------------------')
    sleep(1.5)

    strike_tmp = 0  ##strike buffer
    user_cnt = 0  ##사용자가 시도한 횟수

    for i in range(1, 11):
        numbers = list(input('숫자 3자리를 입력해주세요 : '))
        strike_cnt = 0  ##스트라이크가 발생한 횟수
        ball_cnt = 0  ##볼이 발생한 횟수
        out_cnt = 0  ##아웃이 발생한 횟수
        for j in range(0, 3):
            for k in range(0, 3):
                if (int(numbers[j]) == ranarr[k]) & (j == k): ##만약 자리도 같고 값도 같다면 스트라이크 횟수 1증가
                    strike_cnt = strike_cnt + 1
                elif (int(numbers[j]) == ranarr[k]) & (j != k): ##같은 같은데 자리가 다르다면 볼 횟수 1증가
                    ball_cnt = ball_cnt + 1
        if (strike_cnt == 0) & (ball_cnt == 0): ## 만약 현재 시도에서 스트라이크 볼 이 하나도 등장하지 않았다면 아웃카운트 1증가
            out_cnt = out_cnt + 1
        if (strike_cnt != 3): ##스트라이크 카운트가 3이 아닐때 : 게임을 계속진행
            print('{}번째 결과 : {} STRIKE {} BALL {} OUT'.format(i, strike_cnt, ball_cnt, out_cnt))
            print('남은 기회 : {}'.format((10 - i)))
        elif (strike_cnt == 3): ##스트라이크 카운트가 3이 되면, 이 카운트값과 현재 횟수를 기록을 하고 루프탈출
            strike_tmp = strike_cnt
            user_cnt = i
            break
    if (strike_tmp == 3): ##스트라이크 카운트가 3이 되어서, 정상적으로 탈출했다면,
        retry_tmp1 = 0 ##재도전 버퍼
        print("축하드립니다! {}번 만에 정답을 맞추셨습니다!".format(user_cnt)) ##횟수와 같이 print
        print("한번 더 플레이 하시겠습니까?") ## 한번더 플레이 할것을 질문
        while(1) :
            retry1 = input("please enter [Y/N] : ")
            if (retry1 == 'Y'): ##Y인 경우 버퍼를 1로 바꾸고 루프탈출
                retry_tmp1 = 1
                break
            elif (retry1 == 'N'): ##N인 경우 버퍼를 0으로 바꾸고 루프탈출
                retry_tmp1 = 0
                break
            else:
                print('다시 입력해주세요!')
                continue
        if (retry_tmp1 == 1) : ##Y를 입력하여 버퍼가 1이 되었으므로 전체 루프 다시시작
            continue
        else:
            break ##Y가 아닌 경우는 탈출 및 종료
    elif (strike_tmp != 3): ##기회를 모두 소진하여 탈출했을때도 똑같다
        retry_tmp2 = 0
        print("아쉽게도 기회를 모두 소진하셨습니다!")
        print("재도전 하시겠습니까?")
        while(1) :
            retry2 = input("please enter [Y/N] : ")
            if (retry2 == 'Y'):
                retry_tmp2 = 1
                break
            elif (retry2 == 'N'):
                retry_tmp2 = 0
                break
            else:
                print('다시 입력해주세요!')
                continue
        if (retry_tmp2 == 1) :
            continue
        else:
            break
print('게임을 이용해주셔서 감사합니다.')









