public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        User user = new User("John", 18);
        User user2 = new User("Alice");
        System.out.println("User created: " + user);
        System.out.println("User created: " + user2);
    }
}