/**
 * Абстрактний клас, який визначає структуру агрегату.
 * Цей клас містить фабричний метод для створення ітераторів.
 */
public abstract class Aggregate {
    protected char[] items;

    /**
     * Конструктор агрегату.
     *
     * @param items масив елементів, які потрібно перебрати
     */
    public Aggregate(char[] items) {
        this.items = items;
    }

    /**
     * Фабричний метод для створення ітератора.
     * Кожен підклас визначає, який тип ітератора буде створено.
     *
     * @return об'єкт ітератора
     */
    protected abstract Iterator createIterator();

    /**
     * Створює ітератор за допомогою фабричного методу та повертає його.
     *
     * @return об'єкт ітератора
     */
    public Iterator getIterator() {
        return createIterator();
    }
}