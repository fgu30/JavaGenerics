package JavaGenerics.GenericDemo03;

/**
 * 需要明确 泛型类型
 */
public class ChildSecond extends Parent<String> {
    @Override
    public String getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(String value) {
        super.setValue(value);
    }
}
