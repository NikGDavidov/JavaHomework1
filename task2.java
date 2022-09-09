package HomeworkJava1;
//1.	+Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
//        Пример 1: а = 3, b = 2, ответ: 9
//        Пример 2: а = 2, b = -2, ответ: 0.25
//        Пример 3: а = 3, b = 0, ответ: 1
//        Пример 4: а = 0, b = 0, ответ: не определено
//        Пример 5
//        входные данные находятся в файле input.txt в виде
//        b 3
//        a 10
//        Результат нужно сохранить в файле output.txt
//        1000
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task2 {
        public static void main(String[] args) throws IOException {
            double a = 3;
            double b = 2;
            System.out.println(pow(a,b));
            a = 2;b =-2;
            System.out.println(pow(a,b));
            System.out.println(pow(3,0));
            a =0; b = 0;
            System.out.println(pow(a,b));
            BufferedReader fl = new BufferedReader(new FileReader("pow.txt"));
            String [] arr = new String[3];
            int i = 0;
            while ((arr[i] = fl.readLine()) != null) {
//                System.out.println(arr[i]);
                arr[i] = arr[i].split(" ")[1];
//                System.out.println(arr[i]);
                i++;
            }
            fl.close();
            double result = pow(Double.parseDouble(arr[1]), Double.parseDouble(arr[0]));
            System.out.println(result);
        }

        public static double pow(double value, double powValue) {
            return  Math.pow(value, powValue);
        }
    }


