/**
 * Конкретний клас агрегату, який створює ітератор для прямого перебору.
 */
public class ForwardAggregate extends Aggregate {

    /**
     * Створює агрегат для прямого перебору елементів.
     *
     * @param items масив символів, які потрібно перебрати
     */
    public ForwardAggregate(char[] items) {
        super(items);
    }

    /**
     * Створює прямий ітератор, який перебирає елементи з початку до кінця.
     *
     * @return об'єкт ForwardIterator
     */
    @Override
    protected Iterator createIterator() {
        return new ForwardIterator(items);
    }
}