println("In Groovy, a closure is a block of code that can be assigned to a variable, passed as a parameter, and executed at a later time")
println("add function in groovy")
def add = { x,y -> x+y }
println(add(5,10))
sleep(1000)
println("subtract function in groovy")
def subtract = { x,y -> x-y }
println(subtract(5,10))
sleep(1000)
println("two argument passing")
def welcome = { name, age -> 
    return "Your good name is: $name and your age is: $age"
}
println(welcome("thangadurai", 36))

