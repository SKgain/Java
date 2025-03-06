public class ConstructorExample2 extends ConstructorExample1 {
    int id;
    public ConstructorExample2(String name, int age, int id) {
        super(name, age);
        this.id = id;

    }
    @Override
    public void display() {
        super.display();
        System.out.println("ID: " + id);
    }
}
