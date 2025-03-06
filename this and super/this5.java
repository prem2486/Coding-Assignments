class this5 {
    this5() {
        this(50); // Calling argument constructor
        System.out.println("Default constructor.");
    }

    this5(int num) {
        System.out.println("Parameterized constructor. Value: " + num);
    }

    public static void main(String[] args) {
        this5 obj = new this5();
    }
}
