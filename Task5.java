// Parent class
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog class overriding sound()
class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

// Cat class overriding sound()
class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }
}

class Main4 {
    public static void main(String[] args) {

        // Animal reference with Dog object
        Animal a1 = new Dog();

        // Animal reference with Cat object
        Animal a2 = new Cat();

        // Calling overridden methods
        a1.sound();
        a2.sound();
    }
}