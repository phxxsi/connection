public class Connection34 {
    private int userId;               // Ціле число — ідентифікатор користувача
    private double temperature;       // Число з крапкою — температура
    private boolean isActive;         // true/false — активний користувач чи ні

    public Connection34(int userId, double temperature, boolean isActive) {
        this.userId = userId;
        this.temperature = temperature;
        this.isActive = isActive;
    }

    public int getUserId() {
        return userId;
    }

    public double getTemperature() {
        return temperature;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void printInfo() {
        System.out.println("User ID: " + userId);
        System.out.println("Temperature: " + temperature);
        System.out.println("Is Active: " + isActive);
    }

    // 🔽 Цей метод — відповідь на нове завдання
    public void method() {
        // 1. Використання умовного оператора
        if (temperature > 37.0) {
            // Якщо температура вища за 37.0, то виводимо повідомлення
            System.out.println("Коментар: Температура підвищена, можливо, користувач хворіє.");
        } else {
            // Інакше — все в нормі
            System.out.println("Коментар: Температура в межах норми.");
        }

        // 2. Унарний оператор: зміна активності на протилежну
        isActive = !isActive; // інверсія значення — було true, стало false

        // 3. Бінарний оператор + оператор присвоєння: збільшення userId на 5
        userId = userId + 5;  // це бінарна операція (додавання) і присвоєння

        // Після змін покажемо нові значення
        System.out.println("Коментар: Значення змінено після виконання методу:");
        printInfo(); // використовуємо вже існуючий метод
    }
}
