import turtle

angle=60
side=100
angle1=90

def square(x):

    turtle.left(angle)
    turtle.forward(x)
    turtle.right(angle1)
    
    turtle.forward(x)
    turtle.right(angle1)
    
    turtle.forward(x)
    turtle.right(angle1)

    turtle.forward(x)
    turtle.right(angle1)
    turtle.home()
    
    
def color(y):
     turtle.fillcolor("red")
     turtle.begin_fill()
     main()
     turtle.end_fill()

def main():
    square(100)
    square(70)
    square(20)

main()



