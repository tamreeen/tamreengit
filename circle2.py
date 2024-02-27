from turtle import Turtle, Screen


def draw_circle(turta,x,y,radius,color):
    turta.pencolor("yellow")
    turta.fillcolor(color)
    turta.begin_fill()
    turta.up()
    turta.goto(x,y)
    turta.circle(radius)
    turta.end_fill()
    turta.down()

def nose(turta,x,y,radius,color):
    turta.pencolor("yellow")
    turta.fillcolor(color)
    turta.begin_fill()
    turta.up()
    turta.goto(x,y)
    turta.circle(radius)
    turta.end_fill()
    turta.down()
    

def main():
    T=Turtle()
    draw_circle(T,0,0,100,"violet")
    nose(T,0,100,7,"white")


main()
  