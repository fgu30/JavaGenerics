package JavaGenerics.GenericDemo07;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Cat> catset = new TreeSet<>(new catComparator().reversed());
        catset.add(new Cat("ww", 20));
        catset.add(new Cat("aa", 10));
        catset.add(new Cat("bb", 25));
        catset.add(new Cat("qq", 8));

        for (Cat cat : catset) {
            System.out.println(cat);
        }

    }
}

class animalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        // TODO Auto-generated method stub
        return o1.name.compareTo(o2.name);
    }
}

class catComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        // TODO Auto-generated method stub
        return o1.age - (o2.age);
    }
}

class minicatComparator implements Comparator<MiniCat> {

    @Override
    public int compare(MiniCat o1, MiniCat o2) {
        // TODO Auto-generated method stub
        return o1.color.compareTo(o2.color);
    }
}
