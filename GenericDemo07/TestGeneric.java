package JavaGenerics.GenericDemo07;

import java.util.ArrayList;

/**
 * TestGeneric
 */
public class TestGeneric {
    private static Animal animal;

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<MiniCat> minicats = new ArrayList<>();

        showAnimal(cats);
        showAnimal(minicats);

    }

    public static void showAnimal(ArrayList<? extends Cat> list) {
        for (int i = 0; i < list.size(); i++) {
            Cat cat = list.get(i);
            System.out.println(cat);
        }
    }

}