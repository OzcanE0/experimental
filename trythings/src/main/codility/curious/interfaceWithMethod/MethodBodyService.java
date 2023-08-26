package curious.interfaceWithMethod;

public interface MethodBodyService {
    void regularMethod();  // Regular abstract method

    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}
