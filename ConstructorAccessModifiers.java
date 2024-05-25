public class ConstructorAccessModifiers {
    ConstructorAccessModifiers()                    // Default Constructor
    {
        System.out.println("Default Constructor");

    }

    class InnerClass{
        public InnerClass()                        //public COnstructor
        {
            System.out.println("Public Constructor");

        }
    }

    class PriInnerClass{
        protected PriInnerClass()                         //Protected
        {
            System.out.println("Protected ");

        }
    }
    
}

