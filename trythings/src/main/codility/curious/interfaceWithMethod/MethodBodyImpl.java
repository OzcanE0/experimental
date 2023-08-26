package curious.interfaceWithMethod;

public class MethodBodyImpl implements MethodBodyService{
    private UserRepository userRepository;

    public static void main(String[] args){
    MethodBodyImpl methodBody=new MethodBodyImpl();
    methodBody.defaultMethod();
    methodBody.regularMethod();
}

    @Override
    public void regularMethod() {
        System.out.println("this is regular one");

    }

    @Override
    public void defaultMethod() {
        MethodBodyService.super.defaultMethod();
    }
}