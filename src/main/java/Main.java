import java.util.Arrays;
import java.util.Random;

//public class Main {

//    public static void main (String[] args) {
//        System.out.println("Hello to me");
//    char[] chars = new char[10];
//    int[] chars1 = new int[]{10, 100, 1000};
//    char[] chars2 = new char[] {1,2,3,4,5,6};
//        System.out.println(Arrays.toString(chars1));
//        for (int i = 0; i < ; i++) {
//
//
// Создать строку с текстом. Вывести только чётные символы.
//        String s1 = "dfkgghjd";
//            for (int i = 0; i < s1.length() ; i++) {
////                if (i % 2 == 0) System.out.print(s1.charAt(i));
//            }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
////        Написать алгоритм расчёта арифметической прогрессии.
////        14:18
////        от 0 до 10
////        1
//        int start = 0;
//        int stop = 10;
//        int step = 1;
//        int sum = 0;
////        for (int i = start; i < stop; i+=step, sum+=i);
//        for (int i = start, j = stop; i < stop; i+=step, j -= step, sum+=i);
//        System.out.println(sum);
//    }
//}

//    Выкинуть случайное число, сохранить в переменную.
//        14:37
//        Целое число от 0 ло 1000
//public class Main {
//    public static void main(String[] args) {
//    int num = new Random().nextInt(10001);
//    }
//}
//    Найти старший значащий бит выпавшего числа!)

//public class Main {
//    public static void main(String[] args) {
//        int num = new Random().nextInt(10001);
//        System.out.println(num);
//        var a = 0;
//        while (num != 0) {
//            num = num / 2;
//            a++;
//        }
//        System.out.println(a);
//    }
//}

//    а теперь решить использую высокоуровневые инструменты

//public class Main {
//    public static void main(String[] args) {
//        int num = new Random().nextInt(10001);
//        System.out.println(num);
//        System.out.println(Integer.toBinaryString(num).length());
//    }
//}