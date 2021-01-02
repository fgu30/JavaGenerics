package JavaGenerics.GenericDemo03;

public class TestGeneric {
    public static void main(String[] args) {
        ChildFirst<String> cld1 = new ChildFirst<>();
        cld1.setValue("checkout");
        String s = cld1.getValue();
        System.out.println(s);

        System.out.println("----------------------------");
        ChildSecond cld2 = new ChildSecond();
        cld2.setValue("ohhh");
        String s1 = cld2.getValue();
        System.out.println(s1);
    }
}
