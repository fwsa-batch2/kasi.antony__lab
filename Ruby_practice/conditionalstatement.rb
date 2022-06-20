#if statement
#example
name = gets.chomp
if name == 'kasi'
    puts "Your name is "+name
end


#if-else statement
#example
name = gets.chomp
if name == 'kasi'
    puts "Your name is"+name
else 
    puts "Who are you?"
end


#if-else-if statement
#example
mark =gets.chomp.to_i
if mark<=25
    puts "You're fail" 
elsif (mark>25 && mark<=35)
    puts "You're just pass"
else mark
    puts "You're A1"   
end


#ternary statement
#example
name = gets.chomp   
a = (name == 'kasi' ? true : false);    
puts a


#unless statement
#example
number = gets.chomp.to_i
unless number>=1
    puts "the number is #{number}"
else
    puts "the number is greater than 1"
end


#case statemment
#example
fruit = gets.chomp
case fruit
when 'orange'
    puts "I love orange"
when 'mango'
    puts "I love mango"
when 'banana'
    puts "I love banana"
else
    puts "I don't like fruits"
end


