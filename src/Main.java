public class Main {
    public static void main(String[] args) {
        int money = 100;//начальный счет клиента
        int x = 2000;//сумма пополнения
        int bonus = 100;//бонус за каждые 100 рублей
        if (x >= 1000) {
            System.out.println(x / bonus + money + x);
        }
        if (x < 1000) {
            System.out.println(x + money);
        }


    }
}
