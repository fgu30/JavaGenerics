package JavaGenerics.GenericDemo01;

import java.util.ArrayList;

public class Demo01 {
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        // list.add("aaa");
        // list.add(2);

        // String data1 = (String) list.get(0);
        // // String data2 = (String) list.get(1);
        // // java.lang.ClassCastException: class java.lang.Integer cannot be cast to
        // class
        // // java.lang.String
        ArrayList<String> strlist = new ArrayList<>();
        strlist.add("a");
        strlist.add("b");
        strlist.add("c");
        for (String string : strlist) {
            System.out.println(string);
        }

    }
}
