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
