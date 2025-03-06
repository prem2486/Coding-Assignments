package Interfaces;

interface MyInterface {
    int VALUE = 100; // public static final by default

    void display();
}

class interface8 implements MyInterface {
    @Override
    public void display() {
        System.out.println("Interface VALUE: " + VALUE);
    }

    public static void main(String[] args) {
        interface8 obj = new interface8();
        obj.display();
    }
}
