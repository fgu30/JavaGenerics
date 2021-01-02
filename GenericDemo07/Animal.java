package JavaGenerics.GenericDemo07;

public class Animal {

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return "My name is: " + name;
    }
}
