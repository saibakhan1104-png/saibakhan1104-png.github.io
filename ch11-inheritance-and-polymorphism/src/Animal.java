public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println(name + " makes a sound.");
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "'}";
    }
}
