def larger_number(num1, num2):
    if num1 > num2:
      return num1
    
    else:
       return num2
    

#example usuage
num1 = 20
num2 = 15
result = larger_number(num1,num2)
print(f"the larger number is: {result}")

def larger_number(num1,num2):
   if num1>num2:
     return num1
   
   else:
      return num2
   
#example usuage
num1=14
num2=15
result = larger_number(num1,num2)
print(f"the larger number is: {result}")

def add_numbers(num1,num2):
   result = num1 + num2
   return result

sum = add_numbers(2,2)

print("the sum is:",sum)

def add_numvers(num1,num2):
    result = num1 + num2
    return result
sum = add_numbers(14,15)

print("the answer is:",sum)

def add_numbers(num1,num2):
   if num1> num2:
    return num1
   
   else:
      return num2
   
#example usuage
num1 = 1
num2 = 2
result = larger_number(num1,num2)
print(f"the larger number is: {result}")
   
#iterate over numbers from 1 to 20
for i in range(1,20):
   #check if the number is even, even numbers are 2,4,6,10
   if i % 2 == 0:
      # if it's even, print it
      print(i)
   
#iterate over numbers from 1 to 20
      for i in range(1,21):
         #check if the number is even, even numbers are 2,4,6,10
         if i % 2 == 0:
            print(i)

fruits = ("apple","banana","orange")
for fruit in fruits:
   print(fruit)

for i in range(14):
   print(i)

names = ("tamreen","sabreen","nayel")
for name in names:
   print(name)

for i in range(22):
   print(i)



def main ():
   print("this is main function")
   
if __name__=="__main__":
   main()

def check_guess(guess,answer):
   if guess==answer:
      return 0
   else:
      return None

   
counter = 0
while counter < 5:
    print("Button clicked!")
    counter += 1

def greet(name="friend"):
    print("Hello, " + name + "!")

greet()  # This will print "Hello, friend!"
greet("Alice")  # This will print "Hello, Alice!"

print("apple", "banana", "cherry")  # Output: apple banana cherry

# Using sep to change the separator
print("apple", "banana", "cherry", sep=", ")  # Output: apple, banana, cherry

a_range = range(2,5)
for each_number in a_range:
   print(each_number)


a_range=range(10,0)
for each_number in a_range:
   print(each_number)

for i in range(10,-1,-2):
   print(i)


