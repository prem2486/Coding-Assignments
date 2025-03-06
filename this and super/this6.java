class Parent {
    Parent() {
        System.out.println("Parent constructor called.");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calling parent class constructor
        System.out.println("Child constructor called.");
    }

    public static void main(String[] args) {
        Child obj = new Child();
    }
}
