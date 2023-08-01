import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = sca.nextInt();
        switch (age){
            case 0:
                System.out.println("Вы родились!");
                break;
            case 10:
                System.out.println("Вы школьник!");
                break;
            case 20:
                System.out.println("Вы студент!");
                break;
        }
    }
}