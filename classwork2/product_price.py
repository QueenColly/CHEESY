#collect user input of product and price
#if user iputs at least once of their request, ask them if they want to enter another 
#if user inputs no, print thanks for your patronage, break

product = input("Enter a product: ")
price = int(input("Enter price of product: "))


while (True):
   
    question = input("Do you want to add more product? ").lower()
    if question == "yes":        
        product = input("Enter a product: ")
        price = int(input("Enter price of product: "))

    else:
        print("thanks for your patronage")
        break
   
   
       


