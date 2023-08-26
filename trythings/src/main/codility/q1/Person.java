package q1;

public class Person {
    private String name;
    private int age;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
        this.city = "ibita";
    }
    public Person(){
        this.name = "took ";
        this.age = 5;
        this.city = "pill ibita";

    }
}