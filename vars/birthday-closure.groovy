println("Your going to practice Closure concept in Groovy Scripting")
println ""
println("Tell mewho are you?")
def whoami = { name, age -> 
    return "Your name is: $name and Your age is: $age" }
println(whoami("John",36))
println ""
println("What is your occupation?")
def occupation = { job, employer ->
    return "Your occupation is: $job and Your employer name is: $employer" }
println(occupation("Software Engineer", "try-devops.xyz"))
println ""
println("Whenis your birthday?")
def birthday = { date, month, year ->
    return "Your birth day is: $date and the month is: $month and the year you born is: $year" }
println(birthday(7, "August", 1988))
