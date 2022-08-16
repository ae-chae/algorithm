import math

def primeNumber(N):
    if N<2:
        return False
    for i in range(2, int(math.sqrt(N))+1):
        if N%i == 0:
            return False
    return True

T = int(input())

while T:
    g = int(input())
    A = g // 2
    B = g // 2

    for i in range(g // 2):
        if primeNumber(A) and primeNumber(B):
            print(A, B)
            break
        else:
            A -= 1
            B += 1

    T -= 1