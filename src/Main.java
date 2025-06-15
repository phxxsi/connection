public class Main {
    public static void main(String[] args) {
        Connection34 user = new Connection34(101, 36.6, true);

        System.out.println("Початкові значення:");
        user.printInfo();

        // Викликаємо метод з умовою та операторами
        System.out.println("\nВикликаємо method():");
        user.method();

        // Ще раз покажемо результат
        System.out.println("\nЗначення після виконання method():");
        user.printInfo();
    }
}
