def validate(hand):
    if hand < 0 or hand > 2:
        return False
    return True

def print_hand(hand, name='Guest'):
    hands = ['Rock', 'Paper', 'Scissors']
    print(name + ' picked: ' + hands[hand])

# Define the judge function
def judge(player,computer):
    if player ==computer:
        return 'Draw'
    elif player==0 and computer==1:
         return 'Lose'
    elif player == 1 and computer == 2:
         return 'Lose'
    elif player == 2 and computer == 0:
         return 'Lose'   
    else:
         return 'Win'
    # Add control flow based on the comparison of player and computer
    
    

print('Starting the Rock Paper Scissors game!')
player_name = input('Please enter your name: ')

print('Pick a hand: (0: Rock, 1: Paper, 2: Scissors)')
player_hand = int(input('Please enter a number (0-2): '))

if validate(player_hand):
    computer_hand = 1
    
    print_hand(player_hand, player_name)
    print_hand(computer_hand, 'Computer')
    result = judge(player_hand,computer_hand)
    print('Result:' + result)
    
    # Assign the return value of judge to the result variable
    
    # Print the result variable
    
else:
    print('Please enter a valid number')
