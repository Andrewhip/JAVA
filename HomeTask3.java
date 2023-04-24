import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите 2 число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Введите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка операции");
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
