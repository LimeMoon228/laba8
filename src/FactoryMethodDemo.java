/**
 * Головний клас для демонстрації роботи патерна Factory Method.
 */
public class FactoryMethodDemo {

    /**
     * Головний метод для запуску демонстрації.
     *
     * @param args аргументи командного рядка
     */
    public static void main(String[] args) {
        // Масив символів для перебору
        char[] items = {'1', '2', '3', '4'};

        // Створення агрегату з прямим ітератором
        Aggregate forwardAggregate = new ForwardAggregate(items);
        Iterator forwardIterator = forwardAggregate.getIterator();

        System.out.println("Прямий перебір:");
        while (forwardIterator.hasNext()) {
            System.out.print(forwardIterator.next() + " ");
        }

        System.out.println("\n");

        // Створення агрегату з зворотним ітератором
        Aggregate reverseAggregate = new ReverseAggregate(items);
        Iterator reverseIterator = reverseAggregate.getIterator();

        System.out.println("Зворотний перебір:");
        while (reverseIterator.hasNext()) {
            System.out.print(reverseIterator.next() + " ");
        }
    }
}