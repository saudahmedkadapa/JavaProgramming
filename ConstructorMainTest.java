///import ConstructorAccessModifiers.InnerClass;

//import ConstructorAccessModifiers.PriInnerClass;

public class ConstructorMainTest {
    public static void main(String[] args) {
        ConstructorAccessModifiers obj=new ConstructorAccessModifiers();
        ConstructorAccessModifiers.InnerClass InObj=obj.new InnerClass();
        ConstructorAccessModifiers .PriInnerClass priObj=obj.new PriInnerClass();

    }
    
}
