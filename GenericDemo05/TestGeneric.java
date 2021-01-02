package JavaGenerics.GenericDemo05;

import java.util.ArrayList;

public class TestGeneric {
    public static void main(String[] args) {
        ProductGetter<String> prodget = new ProductGetter<>();
        ArrayList<String> strlist = new ArrayList<>();
        strlist.add("ipad");
        strlist.add("iphone");
        strlist.add("lenovo");

        String product1 = prodget.getProduct(strlist);
        System.out.println(product1);

        System.out.println("++++++++++++++++++++++++++++++");

        ProductGetter<String> prodget01 = new ProductGetter<>();
        prodget01.addProduct("apple");
        prodget01.addProduct("pear");
        prodget01.addProduct("orange");
        String s2 = prodget01.getProduct();
        System.out.println(s2);

        System.out.println("--------------------------------");
        ProductGetter.printall("a", 100, 10.0);
        System.out.println("=================================");
        ProductGetter.print(1, 2, 3, 4, 5, 6, 7);
        ProductGetter.print('a', 'b', 'c');

    }
}
