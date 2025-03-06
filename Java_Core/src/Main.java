public class Main {
    public static void main(String[] args) {
        // Data Types
        DataTypesExample.dataTypesDemo();

        // Class and Object
        ClassAndObjectExample classAndObject = new ClassAndObjectExample();
        classAndObject.display();

        // Static Variable and Method
        StaticExample.staticMethod();
        System.out.println("Static Variable: " + StaticExample.staticVar);

        // String Manipulation
        StringManipulationExample.stringManipulation();

        // Anonymous Object
        new AnonymousObjectExample().display();

        // Constructor
        ConstructorExample2 constructorExample2 = new ConstructorExample2("Saikat", 24, 22103320);
        constructorExample2.display();

        // Encapsulation
        EncapsulationExample encapsulationExample = new EncapsulationExample();
        encapsulationExample.setName("Alice");
        System.out.println("Name: " + encapsulationExample.getName());

        // Inheritance
        InheritanceExample inheritanceExample = new InheritanceExample();
        inheritanceExample.display();

        // Method Overloading
        MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();
        methodOverloadingExample.display();
        methodOverloadingExample.display("Overloaded Method");

        // Method Overriding
        MethodOverridingExample methodOverridingExample = new MethodOverridingExample();
        methodOverridingExample.display();

        // Abstract Class
        AbstractClassExample abstractClassExample = new AbstractClassExample() {
            @Override
            void display() {
                System.out.println("Abstract Class Example: Display method implemented in anonymous class");
            }
        };
        abstractClassExample.display();

        // Enum Class
        EnumExample enumExample = EnumExample.MONDAY;
        enumExample.display();

        // Type Casting
        TypeCastingExample.typeCastingDemo();

        // Wrapper Class
        WrapperClassExample.wrapperClassDemo();

        // Exception Handling
        ExceptionHandlingExample.exceptionHandlingDemo();

        // Multi-threading
        MultiThreadingExample multiThreadingExample = new MultiThreadingExample();
        multiThreadingExample.start();

        // Interface
        InterfaceExample interfaceExample = new InterfaceExample() {};
        interfaceExample.display();

        // User Defined Exception
        try {
            throw new UserDefinedException("This is a user defined exception");
        } catch (UserDefinedException e) {
            System.out.println(e.getMessage());
        }

        // Java Generics
        GenericsExample<String> genericsExample = new GenericsExample<>("Hello Generics");
        genericsExample.display();

        // Lambda Expression
        LambdaExample lambdaExample = () -> System.out.println("Lambda Expression Example");
        lambdaExample.display();

        // Record
        RecordExample recordExample = new RecordExample("Record Example", 2023);
        System.out.println(recordExample);
    }
}