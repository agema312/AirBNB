package payment;

public class PaymentForm {
    public static void main(String[] args) {
        int result = sum(5, 10); // Вызов метода sum
        System.out.println("Сумма: " + result); // Вывод результата
    }
    // methods
    public static int sum(int a, int b) {
        return a + b; // Возвращает сумму
    }
}
