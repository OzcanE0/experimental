package curious;

public class VarArgs {

    public static void main(String[] args) {
        // Your existing main code here

        // Call your experimental method with varargs
        experimentalVarargsMethod("Hello", "World","can","take","all");
    }

    // Your existing methods here

    // Experimental method using varargs
    private static void experimentalVarargsMethod(String... strings) {
        System.out.print("Experimental: ");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}


