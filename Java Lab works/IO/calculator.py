def add(X,Y):
    print("The addition of two number is",X+Y)
def sub(X,Y):
    print("The subraction of two number is",X-Y)
def mul(X,Y):
    print("The multplication of two number is",X*Y)
def div(X,Y):
    print("The division of two number is",X/Y)
A=int(input("ENTER THE FIRST NUMBER:"))
B=int(input("ENTER THE SECOND NUMBER:"))
C=str(input("ENTER THE CONDITION('+','-','*','/'):"))

if( C=='+'):
    add(A,B)
elif( C=='-'):
    sub(A,B)
elif( C=='*'):
    mul(A,B)
elif( C=='/'):
    div(A,B)
else:
    print("Enter the valid condition")