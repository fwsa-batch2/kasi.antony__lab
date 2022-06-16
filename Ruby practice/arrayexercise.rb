# Problem 1. Given a nested array of first names and last names, return a new array with the full names.
#   names = [["Jhumpa", "Lahiri"], ["J. K", "Rowling"], ["Devdutt", "Pattanaik"]]
#   # fill in code that will return a new array of the full names:
#   #   ["Jhumpa Lahiri", "J.K Rowling", ...]


##PROBLEM 1:

main_array=[["kasi","antony"],["Rishi","Atgondan"],["Chithu","raj"]]
name = []
for i in 0...main_array.length
    j = 0
    name.push(main_array[i][j] +" " +main_array[i][j+1])
end
print name
