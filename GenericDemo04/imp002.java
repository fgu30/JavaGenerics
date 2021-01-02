package JavaGenerics.GenericDemo04;

/**
 * imp002 泛型类要一致
 * 
 * @param <T>
 * @param <E>
 * 
 */
public class imp002<T, E> implements Interface001<T> {
    private T key;
    private E value;

    public imp002(T key, E value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public T getkey() {
        return key;
    }

    public E getValue() {
        return value;
    }

}