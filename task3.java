package HomeworkJava1;

public class task3 {

    //Написать программу вычисления n-ого треугольного числа.

        public static void main(String[] args) {
            System.out.println(triangleNum(12));
        }

        public static int triangleNum(int n) {
        //    Рекуррентная формула для n-го треугольного числа
       //  T_{n}=T_{n-1}+n}
            if (n == 1) return 1;
            else return (triangleNum(n - 1) + n);
}
}
