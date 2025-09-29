N = int(input())
T_list = list(map(int, input().split()))
T_P_size = list(map(int, input().split()))

A = 0
for i in range(6):
    A += T_list[i] // T_P_size[0]
    if T_list[i] % T_P_size[0] != 0:
        A += 1
        
B = N // T_P_size[1]
C = N % T_P_size[1]

print(A)
print(f"{B} {C}")