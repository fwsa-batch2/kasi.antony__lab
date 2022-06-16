## Problem 1. Given a nested array of first names and last names, return a new array with the full names.
#   names = [["Jhumpa", "Lahiri"], ["J. K", "Rowling"], ["Devdutt", "Pattanaik"]]
#   # fill in code that will return a new array of the full names:
#   #   ["Jhumpa Lahiri", "J.K Rowling", ...]

main_array=[["kasi","antony"],["Rishi","Atgondan"],["Chithu","raj"]]
name = []
for i in 0...main_array.length
    j = 0
    name.push(main_array[i][j] +" " +main_array[i][j+1])
end
print name


## Problem 2. Given two arrays books and authors, merge them and print who wrote which book.
#   books = ["Design as Art", "Anathem", "Shogun"]
#   authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
#   # fill in code that will print:
#   #   Design As Art was written by Bruno Munari
#   #   Anathem was written by Neal Stephenson
#   #   ...

books=["Harry potter","ponniyin selvan","Design as art"]
author=["J.K.rowling","Kalki","Bruno munari"]
for i in 0...books.length do
    puts "#{books[i]} was written by #{author[i]}"
end


## Problem 3. Print the given list of todos by category. (You haven't learned Hashes yet, so use only arrays.)
# todos = [
#   ["Send invoice", "money"],
#   ["Clean room", "organize"],
#   ["Pay rent", "money"],
#   ["Arrange books", "organize"],
#   ["Pay taxes", "money"],
#   ["Buy groceries", "food"]
# ]
# # Fill in code that will print:
# #   money:
# #     Send invoice
# #     Pay rent
# #     Pay taxes
# #   organize:
# #     Clean room
# #     Arrange books
# #   food:
# #     Buy groceries

todos = [
    ["Send invoice", "money"]
    ["Clean room", "organize"]
    ["Pay rent", "money"]
    ["Arrange books", "organize"]
    ["Pay taxes", "money"]
    ["Buy groceries", "food"]
  ]
  money=[]
  organizer=[]
  food=[]
##Money
puts "Money: "
for i in 0...todos.length 
  var=todos[i][1] 
  if var == "money"
     money.push(todos[i][0]) 
  end
end
puts money
##Organizer
puts "Organize: "
for i in 0...todos.length 
  var=todos[i][1] 
  if var == "organize"
     organizer.push(todos[i][0]) 
  end
end
puts organizer
##Food
puts "Food: "
for i in 0...todos.length 
var=todos[i][1] 
if var == "food"
   food.push(todos[i][0]) 
end
end
puts food
