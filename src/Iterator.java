/**
 * Інтерфейс ітератора.
 * Визначає методи для перебору колекції елементів.
 */
public interface Iterator {

    /**
     * Перевіряє, чи є наступний елемент у колекції.
     *
     * @return true, якщо є наступний елемент, false – якщо немає
     */
    boolean hasNext();

    /**
     * Повертає наступний елемент колекції.
     *
     * @return наступний елемент
     */
    char next();
}