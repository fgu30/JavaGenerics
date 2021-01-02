package JavaGenerics.GenericDemo05;

import java.util.ArrayList;
import java.util.Random;

public class ProductGetter<T> {
    private T product;
    ArrayList<T> list = new ArrayList<>();
    Random rand = new Random();

    public void addProduct(T product) {
        list.add(product);
    }

    public T getProduct() {
        product = list.get(rand.nextInt(list.size()));
        return product;
    }

    // 泛型方法
    public <E> E getProduct(ArrayList<E> list) {
        return list.get(rand.nextInt(list.size()));
    }

    // 静态泛型方法
    public static <E, K, O> void printall(E e, K k, O o) {

        System.out.println(e + "\t" + e.getClass().getSimpleName());
        System.out.println(k + "\t" + k.getClass().getSimpleName());
        System.out.println(o + "\t" + o.getClass().getSimpleName());

    }

    //
    public static <E> void print(E... e) {
        for (E e2 : e) {
            System.out.println(e2);
        }
    }
}
