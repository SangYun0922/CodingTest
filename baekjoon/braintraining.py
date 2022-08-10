import random
from time import sleep
print('말랑말랑 두뇌트레이닝에 오신것을 환영합니다!')
sleep(1.5)
print('말랑말랑 두뇌트레이닝이란 주어진 사칙연산을 계산하여 맞추는 게임입니다!')
sleep(1.5)
print('모든 식은 2항으로 이루어져있으며, 덧셈,뺄셈,곱셈,나눗셈 몫구하기 총 4개의 연산자가 담겨있습니다!')
sleep(1.5)
print('각 숫자들의 범위는 1부터 99까지 입니다!')
sleep(1.5)
while (1) :
    score = int(0)  ##스코어 설정
    correct_tmp = int(0)
    print("말랑말랑 두뇌트레이닝을 시작하겠습니다!")
    print("--------------------------------")
    for i in range(1,6) :

        front_num = int(random.randrange(1, 100))  ##1번째 숫자를 1이상 100미만인 숫자로 범위를 설정하여 랜덤으로 생성
        rear_num = int(random.randrange(1, 100))  ##2번째 숫자도 1이상 100미만인 숫자로 범위설정
        oper_idx = int(random.randrange(0, 3))
        operators = ['+', '-', '*', '//']  ##덧셈,뺄셈,곱셈,나눗셈 몫구하기 총 4개의 연산자가 담겨있다.
        question = str(front_num) + operators[oper_idx] + str(rear_num)
        print("{}번째 문제입니다!".format(i))
        print('{}의 답은?'.format(question))
        while(1) :
            try:
                answer = int(input("정답 : "))
                break
            except ValueError as e:
                print("정수만 입력해 주세요!")
        if (operators[oper_idx] == '+') & (answer == (front_num + rear_num)): ##덧셈의 경우이고 정답일 경우
            score += 5 ##스코어에 5점을 더한다
            correct_tmp += 1 ##맞은 문제수에 1을 더해준다
            print("--------------------------------")
            print('정답입니다:)')
            print('현재점수는 : {} 입니다!'.format(score))
            print("--------------------------------")
        elif (operators[oper_idx] == '+') & (answer != (front_num + rear_num)) : ##덧셈의 경우이고 오답일 경우
            score = score - 5 ##스코어에서 5점 감점
            if (score <= 0):  ##score값이 음수일 경우에는 0으로 세팅함
                score = 0
            print("--------------------------------")
            print('오답입니다:(')
            print('현재점수는 : {} 입니다!'.format(score))
            print("--------------------------------")

        elif (operators[oper_idx] == '*') & (answer == (front_num * rear_num)) : ##곱셈의 경우이고 정답일 경우
            score += 5
            correct_tmp += 1
            print("--------------------------------")
            print('정답입니다:)')
            print('현재점수는 : {} 입니다!'.format(score))
            print("--------------------------------")
        elif (operators[oper_idx] == '*') & (answer != (front_num * rear_num)): ##곱셈의 경우이고 오답일 경우
            score = score - 5
            if (score <= 0):  ##score값이 음수일 경우에는 0으로 세팅함
                score = 0
            print("--------------------------------")
            print('오답입니다:(')
            print('현재점수는 : {} 입니다!'.format(score))
            print("--------------------------------")

        elif (operators[oper_idx] == '-') & (answer == (front_num - rear_num)): ##뺄셈의 경우이고 정답일 경우
            score += 5
            correct_tmp += 1
            print("--------------------------------")
            print('정답입니다:)')
            print('현재점수는 : {} 입니다!'.format(score))
            print("--------------------------------")
        elif (operators[oper_idx] == '-') & (answer != (front_num - rear_num)): ##뺄셈의 경우이고 오답일 경우
            score = score - 5
            if (score <= 0):  ##score값이 음수일 경우에는 0으로 세팅함
                score = 0
            print("--------------------------------")
            print('오답입니다:(')
            print('현재점수는 : {} 입니다!'.format(score))
            print("--------------------------------")

        elif (operators[oper_idx] == '//') & (answer == (front_num // rear_num)): ##몫구하기의 경우이고 정답일 경우
            score += 5
            correct_tmp += 1
            print("--------------------------------")
            print('정답입니다:)')
            print('현재점수는 : {} 입니다!'.format(score))
            print("--------------------------------")
        elif (operators[oper_idx] == '//') & (answer != (front_num // rear_num)): ##몫구하기의 경우이고 오답일 경우
            score = score - 5
            if (score <= 0):  ##score값이 음수일 경우에는 0으로 세팅함
                score = 0
            print("--------------------------------")
            print('오답입니다:(')
            print('현재점수는 : {} 입니다!'.format(score))
            print("--------------------------------")



    print("수고하셨습니다!")
    print("--------------------------------")

    if (correct_tmp == 5) : ##문제를 모두 맞춘경우
        print('총 스코어 : {} 맞힌문제 : {}'.format(score,correct_tmp))
        print('모두 맞추셨습니다! 축하드립니다!')
        sleep(1.5)
        print("한번 더 플레이 하시겠습니까?")  ## 한번더 플레이 할것을 질문
        while (1):
            retry1 = input("please enter [Y/N] : ")
            if (retry1 == 'Y'):  ##Y인 경우 버퍼를 1로 바꾸고 루프탈출
                retry_tmp1 = 1
                break
            elif (retry1 == 'N'):  ##N인 경우 버퍼를 0으로 바꾸고 루프탈출
                retry_tmp1 = 0
                break
            else:
                print('다시 입력해주세요!')
                continue
        if (retry_tmp1 == 1):  ##Y를 입력하여 버퍼가 1이 되었으므로 전체 루프 다시시작
            continue
        else:
            break  ##Y가 아닌 경우는 탈출 및 종료
    elif (correct_tmp != 5) : ##문제를 모두 맞추지 못하였을경우
        print('총 스코어 : {} 맞힌문제 : {}'.format(score,correct_tmp))
        if (correct_tmp < 3) : ##정답률이 절반이후일 경우
            print('아쉽습니다.. 정답률이 {}% 이네요! 다음엔 더 집중해 봅시다!'.format((correct_tmp/5)*100))
        elif (correct_tmp >= 3) & (correct_tmp < 5) : ##정답률이 절반 이상일 경우
            print('수고하셨습니다! 정답률이 {}% 이네요! 만점까지 얼마 남지 않았습니다:)'.format((correct_tmp/5)*100))
        sleep(1.5)
        print("한번 더 플레이 하시겠습니까?")  ## 한번더 플레이 할것을 질문
        while (1):
            retry1 = input("please enter [Y/N] : ")
            if (retry1 == 'Y'):  ##Y인 경우 버퍼를 1로 바꾸고 루프탈출
                retry_tmp1 = 1
                break
            elif (retry1 == 'N'):  ##N인 경우 버퍼를 0으로 바꾸고 루프탈출
                retry_tmp1 = 0
                break
            else:
                print('다시 입력해주세요!')
                continue
        if (retry_tmp1 == 1):  ##Y를 입력하여 버퍼가 1이 되었으므로 전체 루프 다시시작
            continue
        else:
            break  ##Y가 아닌 경우는 탈출 및 종료
print("--------------------------------")
print('게임을 이용해주셔서 감사합니다.')






