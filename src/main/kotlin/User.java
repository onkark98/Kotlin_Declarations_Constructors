public class User {
    private final String name;
    private final int age;

    public User(String name, int age) {
        if(age< 18) {
            throw new IllegalArgumentException("User must be adult");
        }
        this.name = name;
        this.age = age;
    }

    public User(String name) {
        this(name, 18);
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
}