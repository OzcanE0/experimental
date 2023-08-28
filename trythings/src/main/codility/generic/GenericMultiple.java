package generic;

public class GenericMultiple<T,U> {
    public GenericMultiple(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    T obj1;
    U obj2;

    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);



    }



    public static void main(String[] args) {
        GenericMultiple<Integer,String> obj = new GenericMultiple<Integer,String>(15,"xxx");
        obj.print();

}
}
