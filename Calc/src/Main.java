import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("Введите первое число");
        Scanner myscan = new Scanner(System.in);
        double a = myscan.nextDouble();
        System.out.println("Выберите: + - * / ");
        char z = (char) System.in.read();
        System.out.println("Введите второе число");
        double b = myscan.nextDouble();
        double x = 0;
        if (z == '+') {
            x = a + b;
            System.out.println(x);
        } else if (z == '-') {
            x = a - b;
            System.out.println(x);
        } else if (z == '*') {
            x = a * b;
            System.out.println(x);
        } else if (z == '/') {
            x = a / b;
            System.out.println(x);
        } else {
            System.out.println("Вы не правы!");
        }
        System.out.println("Выберите: + - * / ");
        z = (char) System.in.read();
        System.out.println("Введите третье число");
        double d = myscan.nextDouble();
        double y = 0;
        if (z == '+') {
            y = x + d;
            System.out.println(y);
        } else if (z == '-') {
            y = x - d;
            System.out.println(y);
        } else if (z == '*') {
            y = x * d;
            System.out.println(y);
        } else if (z == '/') {
            y = x / d;
            System.out.println(y);
        } else {
            System.out.println("Вы не правы!");
        }
    }
}
    