package generic;

import javax.sound.midi.SysexMessage;

public class GenericFunctions {

    public   <T extends Number> void genericFunctions(T obj){
        GenericFunctions instance=new GenericFunctions();
        instance.nonStaticMethod();
         System.out.println(Math.abs(obj.doubleValue()));
    }
    public void nonStaticMethod() {
        System.out.println("Non-static method called. Instance variable: ");
    }


    public static void main(String[] args) {
        GenericFunctions instance=new GenericFunctions();
        int x= 15;
        double y= -131.2;
        instance.genericFunctions(x);
        instance.genericFunctions(y);
    }
}