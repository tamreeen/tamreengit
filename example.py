def aed_to_eur(money):
    rate = 0.22
    return money * rate

def aed_to_britishPound(money):
    rate = 0.18
    return money * rate

def aed_to_dollar(money):
    rate = 0.27
    return money * rate

def dollar_to_aed(amount):
    rate = 3.67
    return amount * rate

def britishPound_to_aed(amount):
    rate = 4.74
    return amount * rate

def eur_to_aed(amount):
    rate = 4.50
    return amount * rate

def main():
    print("Welcome to the Currency Converter")
    print("1. AED to other currencies")
    print("2. Other currencies to AED")
    choice = input("Enter your choice (1 or 2): ")

    if choice == '1':
        print("1. AED to EUR")
        print("2. AED to British Pound")
        print("3. AED to USD")
        sub_choice = input("Enter your choice (1, 2, or 3): ")
        amount = float(input("Enter the amount in AED: "))
        if sub_choice == '1':
            converted_amount = aed_to_eur(amount)
            print(f"{amount} AED is equal to {converted_amount:.2f} EUR")
        elif sub_choice == '2':
            converted_amount = aed_to_britishPound(amount)
            print(f"{amount} AED is equal to {converted_amount:.2f} GBP")
        elif sub_choice == '3':
            converted_amount = aed_to_dollar(amount)
            print(f"{amount} AED is equal to {converted_amount:.2f} USD")
        else:
            print("Invalid choice")
    elif choice == '2':
        print("1. USD to AED")
        print("2. British Pound to AED")
        print("3. EUR to AED")
        sub_choice = input("Enter your choice (1, 2, or 3): ")
        amount = float(input("Enter the amount: "))
        if sub_choice == '1':
            converted_amount = dollar_to_aed(amount)
            print(f"{amount} USD is equal to {converted_amount:.2f} AED")
        elif sub_choice == '2':
            converted_amount = britishPound_to_aed(amount)
            print(f"{amount} GBP is equal to {converted_amount:.2f} AED")
        elif sub_choice == '3':
            converted_amount = eur_to_aed(amount)
            print(f"{amount} EUR is equal to {converted_amount:.2f} AED")
        else:
            print("Invalid choice")
    else:
        print("Invalid choice")

if __name__ == "__main__":
    main()

