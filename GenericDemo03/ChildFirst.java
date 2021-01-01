package JavaGenerics.GenericDemo03;

/**
 * @param <T>
 */

public class ChildFirst<T> extends Parent<T> {
    // 必须一致

    @Override
    public T getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(T value) {
        super.setValue(value);
    }
}
