#pseudocode:
#1. initialize the function
#2. intialize the string variable - count
#3. Using a loop, run through the string passed into the function as an argument
#4. For each char found, increment count
#5. return count


def get_length(word):
    count = 0
    for char in word:
        count +=1
    return count

result = get_length("fault")
print (result)


def get_product(a ,b):
    product = a*b
    return product

answer = get_product(2,5)
print(answer)

#does sum and minus, multiplies the result of sum and minus and returns the result
#initialise function
#initialise 2 int variable
#add both numbers 
#subtract both numbers
#multiply the sum and difference
#return result
#

def get_multiply(c,d):
    addition = c+d
    subtraction = c - d
    multiply = addition * subtraction
    return multiply

value = get_multiply(5,5)
print(value)

#initialise function that takes a string as argument
#initialize a new empty string
#loop through the string from the back- reverse
#Concatenate the chars into a new string variable
#return variable

def get_string(word):
    new_word = ""
    for char in range(len(word) -1, -1,-1):
        new_word += word[char]
    return new_word

result = get_string("eggroll")
print (result)


#initialise function
#initialise a variable minute
# numbers 
# numbers
#multiply 
#return result
#

def get_secs_hour(minutes):
    hours = minutes/60  
    seconds = 60 * minutes
#    return (hour, "hours", seconds,"seconds" )
    return hours,seconds 

result1,result2 = get_secs_hour(30)
print(result1,"hours","and",result2,"seconds")
#print(result2,"seconds")


