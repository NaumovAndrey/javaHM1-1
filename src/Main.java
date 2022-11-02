import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа вычисления n-ого треугольного числа");

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите n последовательность: ");
        int n = iScanner.nextInt();
        iScanner.close();

        int summ = 0;
        for (int i = 0; i <= n; i++) {
            summ += i;
        }
        System.out.printf("Последовательность числа %d = %d", n, summ);
    }
}