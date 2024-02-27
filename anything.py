pi=3.14

def area(r):
    b=pi*(r**2)
    return b

def main():
    side=int(input("enter the radius"))
    radius=area(side)
    print(radius)


main()