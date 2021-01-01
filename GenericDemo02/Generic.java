package JavaGenerics.GenericDemo02;

/**
 * @param<T> 泛型类表示-类型形参 Generic
 */
public class Generic<T> {
    T key;

    public Generic(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "" + key;
    }
}