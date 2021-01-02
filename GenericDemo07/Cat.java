package JavaGenerics.GenericDemo07;

public class Cat extends Animal {

    public int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public String toString() {

        return "M name is" + name + " my age is" + age;
    }

}