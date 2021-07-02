package Java_Inheritance;

public class TestInheritance {
    public static void main(String[] args) {

        Animal animal = new Dog();
       animal.breath();
       animal = new Animal();
       animal.breath();
       animal = new Cat();
       animal.breath();
    }
}
