items = {'apple': 2, 'banana': 4, 'orange': 6}
for item_name in items:
    print('--------------------------------------------------')
    print('Each ' + item_name + ' costs ' + str(items[item_name]) + ' dollars')
    
    # Receive a value by using input(), and assign it to the input_count variable
    input_count = input('How many '+ item_name +  's  do you want?: ')
    print('You will buy ' + input_count + ' ' + item_name +'s')
    count = int(input_count)
    total_price = count * items[item_name]
    print('The total price is' + str(total_price)  + 'dollars')
    # Print 'You will buy ___ ___s' by using input_count and item_name
    
    
    # Convert input_count to an integer and assign it to the count variable
    
    # Multiply the price of each item and the count variable, and assign it to the total_price variable
    
    # By using total_price and type conversion, print 'The total price is ___ dollars'
    