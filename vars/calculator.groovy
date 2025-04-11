def add(x, y) {
    def result = x + y
    echo "Sum of ${x} and ${y} is ${result}"
    return result
}
def subtract(x, y) {
    def result = x - y
    echo "Subtraction of ${x} and ${y} is ${result}"
    return result
}
def multiply(x, y) {
    def result = x * y
    echo "Multiplication of ${x} and ${y} is ${result}"
    return result
}
def divide(x, y) {
    if (y == 0) {
        echo "Cannot divide by zero!"
        return null
    }
    def result = x / y
    echo "Division of ${x} by ${y} is ${result}"
    return result
}
