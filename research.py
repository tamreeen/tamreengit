def takeresearchpapers():
    Researchpaper1= input("Name your research paper")
    count=1
    print(count, Researchpaper1)

def add(firstnum, secnum):
    print(firstnum+ secnum)

def division(firstnum,secnum):
    result = firstnum/secnum 
    #this result variable is holding 6 in it
    #i will return the result which is 6 to that place where
    #it is called
    return result

    
    # call to add function
    firstnum=10
    secnum=20
    add(firstnum,secnum)


    divnum1=30
    divnum2=5
    returnedresult= division(divnum1, divnum2)
    print(returnedresult)    

    
    