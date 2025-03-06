class GenericsExample<T> {
    T value;

    GenericsExample(T value) {
        this.value = value;
    }

    void display() {
        System.out.println("Generics Example: " + value);
    }
}