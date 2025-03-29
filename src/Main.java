public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println("\nЗадание 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("\nЗадание 3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
        System.out.println("\nЗадание 4");
        for (int i = 10; i > -10; i -= 1) {
            System.out.println(i);
        }
        System.out.println("\nЗадание 5");
        for (int i = 1904; i < 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("\nЗадание 6");
        for (int i = 7; i <= 84; i += 7) {
            System.out.println(i);
        }
        System.out.println("\nЗадание 7");
        for (int i = 1; i < 513; i *= 2) {
            System.out.println((i));
        }
        System.out.println("\nЗадание 8");
        int saving = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + saving;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("\nЗадание 9");
        int saving9 = 29000;
        int total9 = 0;
        for (int i = 1; i <= 12; i++) {
            total9 = total9 / 100 + total9 + saving9;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total9 + " рублей");
        }
        System.out.println("\nЗадание 9");
        for (int i = 1; i < 11; i++) {
            System.out.println("2*" + i + "=" + i * 2);
        }
    }
}