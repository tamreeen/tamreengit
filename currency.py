	# we will use the return statement to return to send a result back to the caller function
    # all the constant rates we have used in this program, was found from google

def aed_to_eur(money): # money is the parameter and this option willl let you convert from aed to euro
    rate = 0.25 
    return money * rate #, we are multiplying "money * rate", to calculate the equivalent amount of money in another currency.

def eur_to_aed(amount): 
    rate = 3.97
    return amount * rate #amount and money means the same thing, don't confuse yourself

def aed_to_usddollar(money):
    rate = 0.27
    return money * rate 

def usddollar_to_aed(amount):
    rate = 3.67
    return amount * rate

def aed_to_britishPound(money):
    rate = 0.21
    return money * rate

def britishPound_to_aed(amount):
    rate = 4.66
    return amount * rate


print("Welcome! this is the conversion game where you will convert:")
local_currencies = ["aed to euro", "aed to usddollar" , "aed to british pound"]
for local_currency in local_currencies:
     print(local_currency)

print("or")

foreign_currencies = ["euro to aed" , "usddollar to aed" , "british pound to aed"]
for foreign_currency in foreign_currencies:
     print(foreign_currency)


        
while True:
      start_the_game = input("to start the game, please type (yes or exit):")
      if start_the_game == 'yes':
         print("1. AED to other currencies")
         print("2. Other currencies to AED")
      elif start_the_game== 'exit':
         print("goodbye")
         break
      else:
         print("your option is invalid")


choice = input("Which option would you like to choose? (1 or 2): ")
if choice == '1':
       print("1. AED to EUR")
       print("2. AED to USD DOLLAR")
       print("3. AED to BRITISH POUND")
       sub_choice = input("Enter your choice (1, 2, or 3): ")
       money = float(input("Enter the amount in AED: "))
       if sub_choice == '1':
            converted_amount = aed_to_eur(money)
            print(f"{money} AED is equal to {converted_amount:} EUR") #f-string allows u to directly include a variable in a string:
       elif sub_choice == '3':
            converted_amount = aed_to_britishPound(money)
            print(f"{money} AED is equal to {converted_amount:} GBP")
       elif sub_choice == '2':
            converted_amount = aed_to_dollar(money)
            print(f"{money} AED is equal to {converted_amount:} USD")
       else:
            print("Your option is invalid")

elif choice == '2':
    print("1. USD to AED")
    print("2. British Pound to AED")
    print("3. EUR to AED")
        
    sub_choice = input("Enter your choice (1, 2, or 3): ")
    amount = float(input("Enter the amount: "))
        
    if sub_choice == '1':
            converted_amount = dollar_to_aed(amount)
            print(f"{amount} USD is equal to {converted_amount:} AED") 
    elif sub_choice == '2':
            converted_amount = britishPound_to_aed(amount)
            print(f"{amount} GBP is equal to {converted_amount:} AED")
    elif sub_choice == '3':
            converted_amount = eur_to_aed(amount)
            print(f"{amount} EUR is equal to {converted_amount:} AED")
    else:
        print("Your Choice is invalid")
else:
     print("Your option is invalid")


def main():
      print("thank you for playing with us")

if __name__ == "__main__":
    main()



while True:
        print("Select the conversion direction:")
        print("1. AED to other currencies")
        print("2. Other currencies to AED")
        print("3. Exit")
        choice = input("\nEnter your choice: ")
