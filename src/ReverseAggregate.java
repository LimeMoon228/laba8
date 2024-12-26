/**
 * Конкретний клас агрегату, який створює ітератор для зворотного перебору.
 */
public class ReverseAggregate extends Aggregate {

    /**
     * Створює агрегат для зворотного перебору елементів.
     *
     * @param items масив символів, які потрібно перебрати
     */
    public ReverseAggregate(char[] items) {
        super(items);
    }

    /**
     * Створює зворотний ітератор, який перебирає елементи з кінця до початку.
     *
     * @return об'єкт ReverseIterator
     */
    @Override
    protected Iterator createIterator() {
        return new ReverseIterator(items);
    }
}