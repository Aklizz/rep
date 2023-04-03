import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter 2 numbers");

        double first = reader.nextDouble();
        double second = reader.nextDouble();
        System.out.println("Enter an operator (+, -, *, /)");
        double result;
        char operator = reader.next().charAt(0);
        switch (operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }
        // printing the result of the operations
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
        reader.close();
    }
}
