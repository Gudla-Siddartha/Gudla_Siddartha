import java.util.Scanner;

class Calculator {
    double a, b;
    String operation;

    
    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    
    public double calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mul":
                return a * b;
            case "div":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }
}

public class Program_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        sc.nextLine(); 

        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = sc.nextLine();

  
        Calculator calc = new Calculator(a, b, operation);
        double result = calc.calculate();

        
        System.out.println("Result: " + result);
    }
}
