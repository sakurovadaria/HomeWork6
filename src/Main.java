public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\nTask 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("\nTask 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("\nTask 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("\nTask 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            if (i % 100 != 0 || (i % 400 == 0)) {
                System.out.println(i + " год является високосным.");
            }
        }

        System.out.println("\nTask 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("\nTask 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("\nTask 8");
        int accumulationOfMoney = 29000; //сумма, которую нужно отложить//
        int firstAccumulation = 0; //"банка"//
        for (int i = 1; i <= 12; i++) {
            firstAccumulation = firstAccumulation + accumulationOfMoney;
            System.out.println("Месяц " + i + ", сумма накоплений равна "
                    + firstAccumulation + " рублей.");
        }

        System.out.println("\nTask 9");
        int accumulationOfMoney2 = 29000; //сумма, которую нужно отложить//
        int firstAccumulation2 = 0; //"счет"//
        for (int i = 1; i <= 12; i = i + 1) {
            firstAccumulation2 = firstAccumulation2 + firstAccumulation2 / 100; //процент 1% по вкладу//
            firstAccumulation2 = firstAccumulation2 + accumulationOfMoney2;   //процент по вкладу + сумма//
            System.out.println("Месяц " + i + ", сумма накоплений равна "
                    + firstAccumulation2 + " рублей.");
        }

        System.out.println("\nTask 10");
        int i = 2;
        int c = 1;
        for (; c <= 10; c++) {
            System.out.println(i + "*" + c + "=" + c * 2);
        }


    }
}
