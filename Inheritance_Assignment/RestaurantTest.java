package Inheritance_Assignment;

interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println(name + " cooks delicious meals.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }
    public void performDuties() {
        System.out.println(name + " serves customers.");
    }
}

public class RestaurantTest {
    public static void main(String[] args) {
        Worker c = new Chef("John", 1);
        Worker w = new Waiter("Sarah", 2);
        c.performDuties();
        w.performDuties();
    }
}
