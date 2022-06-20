#forloop
#example
print "Enter a number: "
n = gets.chomp.to_i
for i in  do
    sum = n * i 
    puts "#{n} x #{i} = #{sum}"
end


#foreach
#example
my_array = [1,2,3,4,5,6,7,8,9,10]
my_array.each do 
   puts "#{x}"
end



#kasi
#kasika
#kasiisakasis
#kasika
#kasi



















print "What's your first name? "
first_name = gets.chomp
first_name.capitalize!

print "What's your last name? "
last_name = gets.chomp
last_name.capitalize!

print "What city are you from? "
city = gets.chomp
city.capitalize!

print "What state or province are you from? "
state = gets.chomp
state.upcase!

puts "Your name is #{first_name} #{last_name} and you're from #{city}, #{state}!"
