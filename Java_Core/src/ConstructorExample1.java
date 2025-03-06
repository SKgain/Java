class ConstructorExample1 {
    String name;
    int age;

    ConstructorExample1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Constructor Example: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}