public class Main {
    public static void main(String[] args) {

//        //        // Количество символов
//        String str1 = ("Dot saw I was Tod");
//        int len = str1.length();
//        System.out.println("String Length is " + len);
//         Вывод: String Length is 17

//        // Соединение строк
//        String str2 = ("Coco");
//        String str3 = (" Jambo");
//        String str4 = (" !!!");
//        String str5 = ("  - - -");
//        System.out.println(str2.concat(str3 + str4 + str5 + " Шалом!"));
//Вывод: Coco Jambo !!!  - - - Шалом!

// Выводит символ по индексу (номеру, начиная с 0)
//        String line1 = "Strings are immutable";
//        char res = line1.charAt(8);
//        System.out.println(res);
//Вывод: a

//        //Сравнение строк лексикографически. Если возвращаемое
//        значение "0" строки равны, mеньше "0" или больше "0"
//        String str1 = "Я буду хорошим программистом!";
//        String str2 = "буду хорошим программистом!";
//        String str3 = "отил66";
//
//int res = str1.compareTo(str2);
//        System.out.println(res);
//
//        res = str2.compareTo(str3);
//        System.out.println(res);
//
//        res = str3.compareTo(str1);
//        System.out.println(res);
//        Вывод: -2
//                -13
//        15


//        // Приведение массива символов к строке
//        String str1;
//        char[] helloArray = {'J', 'a', 'v', 'a'};
//        str1 = String.valueOf(helloArray);
//        System.out.println(str1);
//        Вывод: Java

//        // Объединить строки с учетом разделителя
//        String str5 = "Apple";
//        String str6 = "Vinegar";
//        String str7 = String.join("   ©   ", str5, str6);
//        System.out.println(str7);
//        Вывод: Apple   ©   Vinegar

        // Извлечь группу символов или подстроку (по индексу, от и до...)
//        String str8 = "I Love India";
//        int start = 7;
//        int end = 12;
//        char[] dst = new char[end - start];
//        str8.getChars(start, end, dst, 0);
//        System.out.println(dst);
//Вывод: India

        //// Для сравнения строк используются методы
//// equals() (с учетом регистра) и equalsIgnoreCase() (без учета регистра)
//        String line1 = "Robot";
//        String line2 = "robot";
//        String line3, line4;
//
//        System.out.println(line1.equals(line2));
//        System.out.println(line1.equalsIgnoreCase(line2));
//Вывод: false
//        true

        // Метод regionMatches() сравнивает отдельные подстроки в рамках двух строк
//        String tr = "Orange";
//        String tr1 = "My Wrangler";
//        boolean result = tr.regionMatches(1, tr1, 4, 4);
//        System.out.println(result);
//        Вывод: true

//        // Метод indexOf() находит индекс первого вхождения подстроки в строку,
//        // а метод lastIndexOf() - индекс последнего вхождения.
//        // Если подстрока не будет найдена, то оба метода возвращают -1:
//        String str9 = "Elvis Presley";
//        int ind1 = str9.indexOf('v');
//        int ind2 = str9.indexOf('s');
//        int ind3 = str9.lastIndexOf("ey");
//        int ind4 = str9.indexOf('I');
//        System.out.println(ind1 + " " + ind2 + " " + ind3 + " " + ind4);
//        Вывод: 2 4 11 -1

////        Метод startsWith() позволяют определить начинается ли строка с определенной
////        подстроки, а метод endsWith() позволяет определить заканчивается строка на
////        определенную подстроку:
//        String lun = "My game";
//        boolean start = lun.startsWith("my");
//        boolean end = lun.endsWith("ame");
//        System.out.println(start+ " " +end);
//        Вывод: false true

      // Метод replace() позволяет заменить в строке
//        // одну последовательность символов на другую:
//        String st1 = "Aqua Air Stone";
//        String rpls1 = st1.replace('a', 'A');
//        String rpls2 = st1.replace("Stone", "Fish");
//        System.out.println(rpls1);
//        System.out.println(rpls2);
//        System.out.println(String.join(" © ",st1, rpls2));
//        Вывод: AquA Air Stone
//        Aqua Air Fish
//        Aqua Air Stone © Aqua Air Fish

//        // Метод trim() позволяет удалить начальные и конечные пробелы
//        String stri1 = "     Привет из Китая!            ";
//        System.out.println(stri1 = stri1.trim());
//        Вывод: Привет из Китая!

//        // Метод substring() возвращает подстроку, начиная с определенного индекса
//        // до конца или до определенного индекса
//        String stri2 = "Разделитель - какой-нибудь символ или набор символов передается" +
//                "в качестве параметра в метод";
//        String subs1 = stri2.substring(10);
//        String subs2 = stri2.substring(10, 39);
//        System.out.println(subs1);
//        System.out.println(subs2);
//        Вывод:
//        ь - какой-нибудь символ или набор символов передаетсяв качестве параметра в метод
//        ь - какой-нибудь символ или н

        // Метод toLowerCase() переводит все символы строки в нижний регистр,
        // а метод toUpperCase() - в верхний
//        String line1 = "Красный кот";
//        System.out.println(line1.toLowerCase());
//        System.out.println(line1.toUpperCase());
////        Вывод: красный кот
////        КРАСНЫЙ КОТ


//           //Метод split() позволяет разбить строку на подстроки по определенному
//           разделителю. Разделитель - какой-нибудь символ или набор символов
//           передается в качестве параметра в метод.
//        String line1 = "I love, Java, lessons";
//        String[] mas = line1.split(", ");
//        for (String line2 : mas) {
//            System.out.println(line2);
//        }
//        Вывод:
//        I love
//        Java
//        lessons




    }
}