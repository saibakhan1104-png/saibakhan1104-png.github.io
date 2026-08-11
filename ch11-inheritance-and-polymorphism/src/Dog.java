public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " says: Woof!");
    }

    public void fetch() {
        System.out.println(name + " is fetching.");
    }

    public static void main(String[] args) {
        Animal animal = new Dog("Buddy");
        animal.sound();

        if (animal instanceof Dog) {
            ((Dog) animal).fetch();
        }
    }
}
