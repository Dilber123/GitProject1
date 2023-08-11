package Animal;

public class Cat {

    String name;
    int age;

    public Cat() {
        System.out.println("cat is created");

    }

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
}
