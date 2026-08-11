public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Max"),
            new Animal("Generic Animal")
        };

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
