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
