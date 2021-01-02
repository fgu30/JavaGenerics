package JavaGenerics.GenericDemo06;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        Box<Number> box = new Box<>();
        box.setFirst(10.0);
        showBox(box);
    }

    public static void showBox(Box<? extends Number> box) {
        Number first = box.getFirst();
        System.out.println(first);
        System.out.println(first.getClass().getSimpleName());

    }

}