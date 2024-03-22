public class Main {
    public static void main(String[] args) {
        //task1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //task2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //task3
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        //task4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        //task5
        for (int i = 1904; i <= 2096; i = i + 4) {
            if (i % 4 == 0) {
                System.out.println(i);
            } else {
                System.out.println("Год не является високосным");
            }
        }
        //task6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        //task7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        //task8
        int money = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        //task9
        int total2 = 0;
        for (int i = 1; i <= 12; i++) {
            total2 = total2 + total2 / 100;
            total2 = total2 + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей");
        }
        //task10
        int a = 2;
        for (int i = 1; i <= 10; i++) {
            int b = a * i;
            System.out.println(a + " * " + i + " = " + b);
        }

    }
}