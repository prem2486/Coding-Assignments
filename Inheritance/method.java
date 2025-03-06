class A {
    void methodA1() {
        System.out.println("Method A1 from Class A");
    }

    void methodA2() {
        System.out.println("Method A2 from Class A");
    }

    void overrideMethod() {
        System.out.println("Override Method in Class A");
    }
}

class B extends A {
    void methodB1() {
        System.out.println("Method B1 from Class B");
    }

    void methodB2() {
        System.out.println("Method B2 from Class B");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override Method in Class B");
    }
}

class C extends B {
    void methodC1() {
        System.out.println("Method C1 from Class C");
    }

    void methodC2() {
        System.out.println("Method C2 from Class C");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override Method in Class C");
    }
}
