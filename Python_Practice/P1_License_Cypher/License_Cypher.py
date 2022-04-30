import string

def textLimit(plate):
    plateText = plate.get()
    if len(plateText) > 8: 

alphabet_letters = list(string.ascii_uppercase)
print('Hey! What\'s going on? Oh traffic! \nFun \nLet\'s mess with some license plates to pass the time!')
plate = input('Okay gimmie a license plate: ')
print('So the plate is: '+ plate)
plate.trace('w', textLimit)
print(alphabet_letters)

# Function 1: Takes the plate and does a few things:
#   1. Every keystroke calls a funtion that checks string length and then once it hits 7 won't accept more text 
#       a.) Need a regex check to add a - between the third and fourth letter not counting the - regex: /^(?!.*-).*/
#   2. After user hits enter calls a funtion to check if all entries are valid (I.E only contains numbers and letters no special characters)
#       a.) If special characters are detected handle 1 of 2 ways:
#           aa.) Remove them as typed with regex - It's gonna be this one I don't even know why I'm pretending it won't be
#           bb.) Remove them when the user presses enter let them know