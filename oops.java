public class oops {

    public static void main(String args[]) {

        animal a = new cat();   // polymorphism
        a.walk();

        cat c = new cat();
        c.setName("Kitty");     // encapsulation
        System.out.println(c.getName());

        c.sound();              // interface implementation
    }
}

/* --------- Abstraction --------- */
interface pet {
    void sound();
}

/* --------- Encapsulation + Base Class --------- */
class animal {

    private String name;   // encapsulated variable

    animal() {
        System.out.println("Animal created");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void walk() {
        System.out.println("animal walks");
    }
}

/* --------- Inheritance + Polymorphism --------- */
class cat extends animal implements pet {

    cat() {
        System.out.println("cat created");
    }

    @Override
    void walk() {   // method overriding (runtime polymorphism)
        System.out.println("cat walks silently");
    }

    public void sound() {   // abstraction via interface
        System.out.println("cat meows");
    }
}