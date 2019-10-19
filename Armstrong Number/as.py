n2=int(input("Enter number to be checked"))
n1=n2
s=0
d1=0
while n1>0:
 d1=n1%10
 s=s+d1**3
 n1=n1/10
if n2==s:
 print("Armstrong")
else:
 print("Not Armstrong")
