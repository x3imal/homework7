import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
            task1();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int accumulation = 15_000;
        int total = 0;
        int mans = 0;
        while (total < 2_459_000) {
            total = total + accumulation;
            mans = total / accumulation;
            System.out.println("Месяц " + mans + " сумма накоплений " + total + " рублей");
        }
        //System.out.println("За " + mans + " месяцев, можно накопить 2 459 000 рублей");
    }
}