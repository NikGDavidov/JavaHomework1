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
import java.io.*;

public class task2 {
        public static void main(String[] args) throws IOException {
            int a = 3;
            int b = 2;
            pow(a,b);
            a = 2;b =-2;
            pow(a,b);
            pow(3,0);
            a =0; b = 0;
            pow(a,b);

            BufferedReader fl = new BufferedReader(new FileReader("src\\HomeworkJava1\\pow.txt"));
            String [] arr = new String[3];
            int i = 0;
            while ((arr[i] = fl.readLine()) != null) {
                arr[i] = arr[i].split(" ")[1];

                i++;
            }
            fl.close();
            a = Integer.parseInt(arr[1]);
            b = Integer.parseInt(arr[0]);
            pow(a,b);
            File output = new File("output.txt");
            FileWriter writer = new FileWriter(output);
            writer.write(Double.toString(Math.pow(a, b)));
            writer.flush();
            writer.close();
        }

        public static void pow(int a, int b) {
            String res =  Double.toString(Math.pow(a, b));
            if ((b==0) && (a==0)) res = "не определено";
            System.out.println(a+ "**" + b + " = " + res);
        }
    }


