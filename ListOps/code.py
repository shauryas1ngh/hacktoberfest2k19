'''
Task: Delete alternate elements of the given list, starting from index 0,
      print the list after each traversal.

Example: given list -> [1,2,3,4,5]
                o/p: [2, 4]
                     [4]
                     []

'''

d = [211, 22, 321, 32, 431, 232, 324]

while len(d):
    for i in range(len(d)):
        if i%2==0:
            del d[i]
    print(d)
