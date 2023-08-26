package curious.reflection;

public class PersonModel {
    private String name;
    private int age;

    public PersonModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}
