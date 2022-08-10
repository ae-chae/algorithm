from string import ascii_lowercase

s = list(input())
alphabet_list = list(ascii_lowercase)

for i in range(26):
    if alphabet_list[i] in s:
        alphabet_list[i] = s.index(alphabet_list[i])
    else:
        alphabet_list[i] = -1
    
print(*alphabet_list)