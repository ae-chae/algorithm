def solution(arr, idx):
    tmp = -1
    
    for i in range(idx, len(arr)):
        if arr[i] == 1:
            tmp = i
            break
            
    return tmp