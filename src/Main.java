public class Main {
    public static void main(String[] args) {
        int currentAmount = 100;
        int paymentAmount = 1001;
        int bonus = 0;
        if (paymentAmount > 1000) {
            bonus = paymentAmount / 100;
        }
        int clientBalance = (currentAmount + paymentAmount + bonus);
        System.out.println("Ваш баланс " + clientBalance);
        System.out.println("Начислено бонусов " + bonus);
    }
}


