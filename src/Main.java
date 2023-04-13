public class Main {
    public static void main(String[] args) {
        int balance = 100;//начальный счет клиента
        int money = 1100;//сумма пополнения
        int bonus = 100;//бонус за каждые 100 рублей

        if (money > 1000) {
            System.out.println(money / bonus + balance + money);
        } else {
            System.out.println(money + balance);
        }
    }
}