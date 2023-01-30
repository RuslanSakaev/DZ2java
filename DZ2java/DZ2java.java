package DZ2java;

import java.util.Scanner;

public class DZ2java {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("\nВведите число: ");
        int a = iScanner.nextInt();
        System.out.print("Введите степень числа: ");
        int b = iScanner.nextInt();
        iScanner.close();

        if (a == 0 && b == 0) {
            System.out.println("Число " + a + " в нулевой степени = не определено");
        } else if (b == 0) {
            System.out.println("Число " + a + " в нулевой степени = 1");
        } else if (b == 1) {
            System.out.println("Число " + a + " ^ " + b + " = " + a + " ");
        }else {
            double c = a;
            for (int i = 1; i < Math.abs(b); i++) {
                c = c * a;
            }
            if (0 < b) {
                System.out.println("Число " + a + " ^ " + b + " = " + c + " ");
            }
            if (b < 0) {
                System.out.println("Число " + a + " ^ " + b + " = " + 1 / c + " ");
            }
        }

    }
}