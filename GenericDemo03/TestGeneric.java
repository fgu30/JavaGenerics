package JavaGenerics.GenericDemo03;

public class TestGeneric {
    public static void main(String[] args) {
        ChildFirst<String> cld1 = new ChildFirst<>();
        cld1.setValue("checkout");
        String s = cld1.getValue();
        System.out.println(s);
    }
}
