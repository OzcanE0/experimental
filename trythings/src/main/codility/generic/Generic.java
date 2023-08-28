package generic;

public class Generic<T> {
    T obj;
    Generic(T obj) { this.obj = obj; }
    public T getGeneric() { return this.obj; }

    public static void main(String[] args) {
        Generic<Integer> iObj = new Generic<Integer>(15);
        System.out.println(iObj.getGeneric());

        // instance of String type
        Generic<String> sObj
                = new Generic<String>("Generic test");
        System.out.println(sObj.getGeneric());
    }
}
