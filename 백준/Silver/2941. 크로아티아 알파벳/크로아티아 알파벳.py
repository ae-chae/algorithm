S = input()
alph = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

for i in alph:
    S = S.replace(i, '*')
print(len(S))