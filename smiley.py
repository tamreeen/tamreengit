from turtle import Turtle, Screen

def draw_circle(turta, x,y, radius, color):
    turta.fillcolor(color)
    turta.begin_fill()
    turta.up()
    turta.goto(x,y)
    turta.down()
    turta.circle(radius)
    turta.end_fill()
    turta.up()

def nose(turta, x,y,radius,color):
    turta.fillcolor(color)
    turta.begin_fill()
    turta.up()
    turta.goto(x,y)
    turta.down()
    turta.circle(radius)
    turta.end_fill()
    turta.up()
    print(turta.xcor(),turta.ycor())

def draw_centred_circle(turta,x,y,radius,color):
    new_y=y-radius
    draw_circle(turta,x,new_y,radius,color)
    turta.up()
    turta.goto(x,y)
    turta.down()


def draw_eyes(turta, x,y,radius,layer3_color, layer2_color, layer1_color):
    draw_centred_circle(turta, x,y,radius,layer3_color)
    draw_centred_circle(turta, x,y,radius*0.7,layer2_color)
    draw_centred_circle(turta, x,y,radius*0.3,layer1_color)     
         
    
def main():
   wind=Screen()
   T=Turtle()
   draw_circle(T,0,-100,100,"violet")
   nose(T,0,-1,5,"white")
   draw_eyes(T,-50,50,20,"white","violet","white")
   draw_eyes(T,50,50,20,"white","violet","white")
   smile(T)
   wind.extension.click()

def smile(turta):
    turta.up()
    turta.goto(50,-30)
    turta.left(90)
    turta.down()
    turta.circle(50,-180)
    turta.fillcolor("white")
    turta.begin_fill()
    turta.up()
    turta.goto(50,-30)  
    turta.left(270)
    turta.down()  
    turta.forward(100)
    turta.end_fill()


   

     

main()