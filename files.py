example_line1 = "      Hello"
print(example_line1.strip()) #this removes the space


#split
example_line2 = "Hello world" 
print(example_line2.split())

examples = "Hello World"
for example in examples.split():
    print(example)

def print_lines(file1):
    files = open(file1)
    for line in files:
        size = len(line)

def main():
    filename = input("enter the file name with file path")
    print_lines(filename)




