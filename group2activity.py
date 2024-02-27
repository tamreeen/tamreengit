"""
Group2- Safa Umer, Joud, Mahmoud

The following code uses the turtle library to draw 3 lines of hexagon, circle and square 
with appropriate spaces between them. 8 functions have been used out of which 5 functions 
are those mentioned in the rubrics. All the functions are finally combined directly or indirectly in 
the main(). 
Initially, the code will ask for input from the user and based on the input the colors of the figures
vary. These inputs are passed as arguments for the other functions. For this very reason, I have 
made the variables that hold the input values global. 
Once the input is obtained, the main() is encountered. the background color and the turtle's initial
position is set in main(). Following this, the pattern is drawn. (pattern())




"""
from turtle import Turtle,Screen 

#the following commands are used to take input(colors) from the user
hexcolor=input("Enter the color of hexagon:")
circcolor=input("Enter the color of circle:")
squacolor=input("Enter the color of square:")
border=input("Enter border color:")

t=Turtle()

"""
t will be serving as turtle() function now 
so any built in function used from the turtle module can be called by just t.function()

"""


def xpos():
    currentx=t.xcor()
    x=currentx-200
    return x


"""
this function will determine the x value of where the turtle needs
to be moved for the next shape to be drawn. This is done by 
determining the current position of x first, followed by specifying the change in x coordinate
this value is then returned to wherever the function is called. Similarly the below function 
does the same but for the y coordinate.

 """
   
def ypos():
    currenty=t.ycor()
    y=currenty-150
    return y
    
def setpos(turta,x,y):
    turta.goto(x,y)

#The function above then moves the turtle to the specific x and y coordinates 

"""The functions below draws a hexagon,circle and square and the parameters passed will
 be based on the input from the user."""
def hexagon(turta,hexagoncolor,bordercolor):
    turta.down()
    turta.pencolor(bordercolor)
    turta.fillcolor(hexagoncolor)
    turta.begin_fill()
    turta.forward(50)
    turta.left(60)
    turta.forward(50)
    turta.left(60)
    turta.forward(50)
    turta.left(60)
    turta.forward(50)
    turta.left(60)
    turta.forward(50)
    turta.left(60)
    turta.forward(50)
    turta.left(60)
    turta.end_fill()
    turta.up()

def circle(turta,circlecolor,bordercolor):
    turta.forward(160)#this command will make a space between each of the figure
    turta.down()
    turta.pencolor(bordercolor)
    turta.fillcolor(circlecolor)
    turta.begin_fill()
    turta.circle(50)
    turta.end_fill()
    turta.up()

def square(turta,squarecolor,bordercolor):

    turta.forward(110)
    turta.down()
    turta.pencolor(bordercolor)
    turta.fillcolor(squarecolor)
    turta.begin_fill()
    turta.forward(90)
    turta.left(90)
    turta.forward(90)
    turta.left(90)
    turta.forward(90)
    turta.left(90)
    turta.forward(90)
    turta.left(90)
    turta.end_fill()
    turta.up()
    """after every function that draws figure a t.up() command is 
    passed so that when the turtle is moved there will be no trace"""



def pattern(turta,hexacolor,circacolor,squarcolor,bordercolr):
    #this function will make the a line of the pattern

    hexagon(turta,hexacolor,bordercolr)
    circle(turta,circacolor,bordercolr)
    square(turta,squarcolor,bordercolr)
    setpos(turta,xpos(),ypos())
#the function above will set the turtle in the next line where the next sequence of pattern is drawn

def main():
    wind=Screen()  
    t.up()
    t.goto(-245,150) #initial start point
    wind.bgcolor("light blue")
    pattern(t,hexcolor,circcolor,squacolor,border) 
    pattern(t,hexcolor,circcolor,squacolor,border) 
    pattern(t,hexcolor,circcolor,squacolor,border) 
    #the function is called three times to get that pattern thrice
    wind.exitonclick()



    

main()
