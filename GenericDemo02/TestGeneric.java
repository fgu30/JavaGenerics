package JavaGenerics.GenericDemo02;

public class TestGeneric {
    public static void main(String[] args) {
        // integer
        Generic<String> strgen = new Generic<>("abc");
        System.out.println("strgen: " + strgen);
        // int
        Generic<Integer> intgen = new Generic<Integer>(100);
        System.out.println("intgen: " + intgen);
        // object if no type
        Generic noGen = new Generic("hello");
        System.out.println(noGen);

        System.out.println("--------------------------------------");
        System.out.println(strgen.getClass());
        System.out.println(intgen.getClass());
        System.out.println(noGen.getClass());

    }
}
