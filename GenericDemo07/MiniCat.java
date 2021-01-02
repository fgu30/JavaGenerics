package JavaGenerics.GenericDemo07;

public class MiniCat extends Cat {
    public String color;

    public MiniCat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public String toString() {

        return "my name is" + name + "my age is" + age + "my color is" + color;
    }

}
