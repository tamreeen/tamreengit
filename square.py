import turtle
def square(x):
    turtle.forward(x)
    turtle.right(90)
    turtle.forward(x)
    turtle.right(90)
    turtle.forward(x)
    turtle.right(90)
    turtle.forward(x)
    turtle.right(90)
    turtle.home()

def main():
    square(80)
    square(40)
    square(20)
    
main()