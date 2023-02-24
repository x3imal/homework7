public class Main {
    public static void main(String[] args) {
            task1();
            task2();
            task3();
            task4();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int accumulation = 15_000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + accumulation;
            month = total / accumulation;
            System.out.println("Месяц " + month + " сумма накоплений " + total + " рублей");
        }
        //System.out.println("За " + mans + " месяцев, можно накопить 2 459 000 рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");

        int a = 1;
        while (a <= 10) {
            System.out.print(" " + a++);
            }
        System.out.println();

        for (; a > 0; a--) {
            if (a < 11)
            System.out.print(" " + a);
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");

        int peopleCountry = 12_000_000;
        int fertilityPeopleOneYear = peopleCountry / 1000 * 17;
        int dayPeopleOneYear = peopleCountry / 1000 * 8;
        for (int year = 1; year < 11; year++) {
            peopleCountry = peopleCountry + (fertilityPeopleOneYear - dayPeopleOneYear);
            System.out.println("Год " + year +" численность населения составляет " + peopleCountry);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");

        int deposit = 15000;
        int total = 12_000_000;
        int month = 0;
        while (deposit < total) {
            deposit = deposit + deposit * 7/100;
            month += 1;

            System.out.println("Месяц " + month + " численность накоплений составляет " + deposit);
        }
    }
}