package curious.reflection;

import q1.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionEx {

    public static void main(String[] args) {
        Class<Person> personClass = Person.class;

        // Inspect fields
        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field Name: " + field.getName());
            System.out.println("Field Type: " + field.getType());
            System.out.println("Is Field Accessible: " + field.isAccessible());
            System.out.println();
        }

        // Inspect methods
        Method[] methods = personClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method Name: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType());
            System.out.println("Parameter Types: ");
            for (Class<?> paramType : method.getParameterTypes()) {
                System.out.println("  " + paramType);
            }
            System.out.println();
        }
    }
}
