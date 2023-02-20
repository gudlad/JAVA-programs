public abstract class Abstract_class_features {
    int x=10;
    static int y=20;

    public abstract void fun1();

    void fun2() {
        System.out.println("concrete method");
    }
    
    public static void main(String[] args)
    {
        System.out.println("static method");
    }

    // we can have constructor
    public Abstract_class_features()
    {
        System.out.println("this is constructor");
    }

    // static block
    static{
        System.out.println("static block");
    }

    // we can reference of type of abstract class
    // but we can't instantiate abstract class
    public static void fun5()
    {
        Abstract_class_features acf;
    }

}
