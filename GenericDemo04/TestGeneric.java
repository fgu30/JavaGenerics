package JavaGenerics.GenericDemo04;

public class TestGeneric {
    public static void main(String[] args) {
        Imp001 imp01 = new Imp001();
        String s = imp01.getkey();
        System.out.println(s);

        System.out.println("-----------------------");
        imp002<String, Integer> imp02 = new imp002<String, Integer>("a", 100);
        String s1 = imp02.getkey();
        int s2 = imp02.getValue();
        System.out.println(s1);
        System.out.println(s2);

    }

}
