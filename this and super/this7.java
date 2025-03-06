class Parent {
    void display() {
        System.out.println("Parent method.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        super.display(); // Calling parent method
        System.out.println("Child method.");
    }

    void callThis() {
        this.display(); // Calling current class method
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.callThis();
    }
}
