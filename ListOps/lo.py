
d = [211, 22, 321, 32, 431, 232, 324]

while len(d):
    for i in range(len(d)):
        if i%2==0:
            del d[i]
    print(d)
