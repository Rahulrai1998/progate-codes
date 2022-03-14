def print_hand(hand, name='Guest'):
    # Assign a list of hands to the hands variable
    hands = ['Rock','Paper','Scissors']
    
    # Update using an element of the hands variable
    print(name + ' picked: ' + hands[hand])

print('Starting the Rock Paper Scissors game!')
player_name = input('Please enter your name: ')
print('Pick a hand: (0: Rock, 1: Paper, 2: Scissors)')
player_hand = int(input('Please enter a number (0-2): '))
# Print 'Pick a hand: (0: Rock, 1: Paper, 2: Scissors)'


# Get input, convert it, and assign it to the player_hand variable


# Change the first argument to player_hand
print_hand(player_hand , player_name)