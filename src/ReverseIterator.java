/**
 * Ітератор для зворотного перебору елементів колекції.
 */
public class ReverseIterator implements Iterator {
    private char[] items;
    private int position;

    /**
     * Створює ітератор для зворотного перебору.
     *
     * @param items масив символів, які потрібно перебрати
     */
    public ReverseIterator(char[] items) {
        this.items = items;
        this.position = items.length - 1;
    }

    /**
     * Перевіряє, чи є наступний елемент у колекції (при зворотному переборі).
     *
     * @return true, якщо є наступний елемент, false – якщо немає
     */
    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    /**
     * Повертає наступний елемент і зменшує позицію.
     *
     * @return наступний символ у колекції (при зворотному переборі)
     */
    @Override
    public char next() {
        return items[position--];
    }
}