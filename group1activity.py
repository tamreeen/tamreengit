from turtle import Turtle
import turtle


turtle.bgcolor("cyan")

 






def hexagon(turta,):
    turta.fillcolor("red")
    turta.begin_fill()
    turta.pencolor("yellow")
    turta.forward(60)
    turta.right(300)
    turta.forward(60)
    turta.right(300)
    turta.forward(60)
    turta.right(300)
    turta.forward(60)
    turta.right(300)
    turta.forward(60)
    turta.end_fill()

    turta.up()
    turta.goto(130,50)
    turta.down()
    turta.fillcolor("red")
    turta.begin_fill()
    turta.forward(60)
    turta.right(300)
    turta.forward(60)
    turta.right(300)
    turta.forward(60)
    turta.right(300)
    turta.forward(60)
    turta.right(300)
    turta.forward(60)
    turta.end_fill()

    turta.up()
    turta.goto(350,-20)
    turta.backward(50)
    turta.down()
    turta.fillcolor("red")
    turta.begin_fill()
    turta.forward(60)
    turta.right(300)
    turta.forward(60)
    turta.right(300)
    turta.forward(60)
    turta.right(300)
    turta.forward(60)
    turta.right(300)
    turta.forward(60)
    turta.end_fill()
 
def draw_circle(turta,x,y,radius, color):
     turta.fillcolor(color)
     turta.begin_fill()
     turta.pencolor("yellow")
     turta.up()
     turta.right(90)
     turta.goto(x,y)
     turta.down()
     turta.circle(radius)
     turta.end_fill()
     turta.up()

def draw_circle_2(turta,x,y,radius, color):
    turta.fillcolor(color)
    turta.begin_fill()
    turta.pencolor("yellow")
    turta.right(70)
    turta.up()
    turta.goto(x,y)
    turta.right(90)
    turta.down()
    turta.circle(radius)
    turta.end_fill()
    turta.up()

def circle_three(turta,x,y,radius, color):
    turta.fillcolor(color)
    turta.begin_fill()
    turta.pencolor("yellow")
    turta.right(70)
    turta.up()
    turta.goto(x,y)
    turta.right(90)
    turta.down()
    turta.circle(radius)
    turta.end_fill()
    turta.up()

def square(turta,x): 

    turta.penup()
    turta.right(40)
    turta.backward(280)
    turta.forward(100)
    turta.pendown()

    turta.fillcolor("blue")
    turta.begin_fill()
    turta.pencolor("yellow")
    turta.right(90)
    turta.forward(x)
    turta.right(90)
    turta.forward(x)
    turta.right(90)
    turta.forward(x)
    turta.right(90)
    turta.end_fill()

def draw_square2(turta,x):

    turta.penup()
    turta.forward(50)
    turta.left(90)
    turta.forward(50)
    turta.pendown()

    turta.fillcolor("blue")
    turta.begin_fill()
    turta.pencolor("yellow")
    turta.forward(x)
    turta.right(90)
    turta.forward(x)
    turta.right(90)
    turta.forward(x)
    turta.right(90)
    turta.forward(x)
    turta.right(90)
    turta.end_fill()

def draw_square3(turta,x):
    turta.penup()
    turta.forward(180)
    turta.right(90)
    turta.forward(150)
    turta.pendown()

    turta.fillcolor("blue")
    turta.begin_fill()
    turta.pencolor("yellow")
    turta.forward(x)
    turta.right(90)
    turta.forward(x)
    turta.right(90)
    turta.forward(x)
    turta.right(90)
    turta.forward(x)
    turta.right(90)
    turta.end_fill()
 



 
def main():
    T=Turtle()
    hexagon(T)
    draw_circle(T,200,100,50,"green")
    draw_circle_2(T,450,80,50,"green")
    circle_three(T,520,-40,50,"green")
    square(T,100)
    draw_square2(T,100)
    draw_square3(T,100)
    turtle.pencolor("yellow")

    

    
    
  
   

main()

