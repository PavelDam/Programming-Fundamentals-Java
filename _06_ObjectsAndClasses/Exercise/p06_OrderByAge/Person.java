package L06ObjectsAndClasses.Exercise.P06OrderByAge;

public class Person {
    private String name;
    private String id;
    private int age;

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.",getName(),getId(),getAge());
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }

    public Person (String name, String id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

}
