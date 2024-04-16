package arithmetic;
public class ArithmeticOperations implements Addition, Subtraction, Multiplication, Division {

public double add(double num1, double num2) {
return num1 + num2;
}

public double subtract(double num1, double num2) {
return num1 - num2;
}

public double multiply(double num1, double num2) {
return num1 * num2;
}

public double divide(double num1, double num2) {
if (num2 == 0) {
throw new ArithmeticException("Division by zero error!");
}
return num1 / num2;
}
}
