class ExceptionHandlingExample {
    static void exceptionHandlingDemo() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception Handling Example: " + e.getMessage());
        }
    }
}