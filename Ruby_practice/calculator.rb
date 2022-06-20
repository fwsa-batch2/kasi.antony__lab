class Calculator

    def add(a,b)
        return a+b
    end
    def sub(a,b)
        return a-b
    end
    def mul(a,b)
        return a*b
    end
    def div(a,b)
        return a/b
    end

end

a =gets.chomp.to_i
b =gets.chomp.to_i
c =gets.chomp

obj = Calculator.new
if c == '+'
    puts obj.add(a,b)
elsif c == '-'
    puts obj.sub(a,b)
elsif c == '*'
    puts obj.mul(a,b)
else c == '/'
    puts obj.div(a,b)
end

