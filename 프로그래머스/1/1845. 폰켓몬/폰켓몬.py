def solution(nums):
    answer = 0
    count = len(nums) // 2  # 나눗셈 결과를 정수로 변환

    unique_nums = set()  # set 객체를 생성

    for i in nums:
        unique_nums.add(i)  # set에 요소를 추가
    
    if len(unique_nums) < count:
        answer = len(unique_nums)
    else:
        answer = count

    return answer
