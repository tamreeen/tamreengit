import turtle

def square(x): 

    turtle.fillcolor("blue")
    turtle.begin_fill()
    turtle.forward(x)
    turtle.right(90)
    turtle.forward(x)
    turtle.right(90)
    turtle.forward(x)
    turtle.right(90)
    turtle.forward(x)
    turtle.right(90)
    turtle.home()
    turtle.end_fill()
 
    turtle.penup()
    turtle.forward(180)
    turtle.right(90)
    turtle.forward(100)
    turtle.pendown()

    turtle.fillcolor("blue")
    turtle.begin_fill()
    turtle.forward(x)
    turtle.right(90)
    turtle.forward(x)
    turtle.right(90)
    turtle.forward(x)
    turtle.right(90)
    turtle.forward(x)
    turtle.right(90)
    turtle.end_fill()

    turtle.penup()
    turtle.home()
    turtle.right(180)
    turtle.forward(50)
    turtle.penup()

    turtle.fillcolor("blue")
    turtle.begin_fill()
    turtle.forward(x)
    turtle.right(90)
    turtle.forward(x)
    turtle.right(90)
    turtle.forward(x)
    turtle.right(90)
    turtle.forward(x)
    turtle.right(90)
    turtle.end_fill()
    
    turtle.penup()
    turtle.left(90)
    turtle.forward(180)
    turtle.pendown()


    turtle.fillcolor("green")
    turtle.begin_fill()
    turtle.circle(50)
    turtle.end_fill()

    turtle.penup()
    turtle.right(180)
    turtle.forward(90)
    turtle.pendown()

    turtle.fillcolor("green")
    turtle.begin_fill()
    turtle.circle(50)
    turtle.end_fill()

    turtle.penup()
    turtle.forward(170)
    turtle.left(90)
    turtle.forward(180)
    turtle.pendown()

    turtle.fillcolor("green")
    turtle.begin_fill()
    turtle.circle(50)
    turtle.end_fill()

    turtle.penup()
    turtle.forward(130)
    turtle.pendown()

    turtle.fillcolor("red")
    turtle.begin_fill()
    turtle.forward(60)
    turtle.right(300)
    turtle.forward(60)
    turtle.right(300)
    turtle.forward(60)
    turtle.right(300)
    turtle.forward(60)
    turtle.right(300)
    turtle.forward(60)
    turtle.right(300)
    turtle.forward(60)
    turtle.end_fill()

    turtle.penup()
    turtle.backward(240)
    turtle.pendown()

    turtle.fillcolor("red")
    turtle.begin_fill()
    turtle.forward(60)
    turtle.right(300)
    turtle.forward(60)
    turtle.right(300)
    turtle.forward(60)
    turtle.right(300)
    turtle.forward(60)
    turtle.right(300)
    turtle.forward(60)
    turtle.right(300)
    turtle.forward(60)
    turtle.end_fill()

    turtle.penup()
    turtle.right(90)
    turtle.forward(70)
    turtle.right(90)
    turtle.pendown()

    turtle.fillcolor("red")
    turtle.begin_fill()
    turtle.forward(60)
    turtle.right(300)
    turtle.forward(60)
    turtle.right(300)
    turtle.forward(60)
    turtle.right(300)
    turtle.forward(60)
    turtle.right(300)
    turtle.forward(60)
    turtle.right(300)
    turtle.forward(60)
    turtle.end_fill()
    
    





    
    




turtle.color("yellow")
turtle.bgcolor("cyan")

def main():
    square(80)
   




main()

turtle.done()