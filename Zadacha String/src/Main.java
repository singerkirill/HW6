import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введи предложение");
        Scanner myscan = new Scanner(System.in);
        String bukva = myscan.nextLine();
        int quit =  bukva.toLowerCase().indexOf("quit");
        if (quit >= 0)
            return;

        System.out.println("Ещё одно предложение");
        String bukva2 = myscan.nextLine();
        int quit2 =  bukva2.toLowerCase().indexOf("quit");
        if (quit2 >= 0)
            return;

        System.out.println("Ещё одно предложение");
        String bukva3 = myscan.nextLine();
        int quit3 =  bukva3.toLowerCase().indexOf("quit");
        if (quit3 >= 0)
            return;

        System.out.println("Ещё одно предложение");
        String bukva4 = myscan.nextLine();
        int quit4 =  bukva4.toLowerCase().indexOf("quit");
        if (quit4 >= 0)
            return;

        System.out.println("Ещё одно предложение");
        String bukva5 = myscan.nextLine();
        int quit5 =  bukva5.toLowerCase().indexOf("quit");
        if (quit5 >= 0)
            return;
        int len1, len2, len3, len4, len5, res;
        len1 = bukva.length();
        len2 = bukva2.length();
        len3 = bukva3.length();
        len4 = bukva4.length();
        len5 = bukva5.length();
        res = len1 + len2 + len3 + len4 + len5;
        System.out.println(" Вы ввели: " + res + " символов.");



    }
}