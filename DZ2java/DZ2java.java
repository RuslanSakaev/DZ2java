package DZ2java;

// +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. 
// Сводя количество выполняемых действий к минимуму. 

// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5:
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000


// +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. 

// Сводя количество выполняемых действий к минимуму. 

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