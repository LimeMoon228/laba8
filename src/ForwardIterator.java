/**
 * Ітератор для прямого перебору елементів колекції.
 */
public class ForwardIterator implements Iterator {
    private char[] items;
    private int position = 0;

    /**
     * Створює ітератор для прямого перебору.
     *
     * @param items масив символів, які потрібно перебрати
     */
    public ForwardIterator(char[] items) {
        this.items = items;
    }

    /**
     * Перевіряє, чи є наступний елемент у колекції.
     *
     * @return true, якщо є наступний елемент, false – якщо немає
     */
    @Override
    public boolean hasNext() {
        return position < items.length;
    }

    /**
     * Повертає наступний елемент і збільшує позицію.
     *
     * @return наступний символ у колекції
     */
    @Override
    public char next() {
        return items[position++];
    }
}