public interface Interfaces {

    public static final int x=10;
    int y=20; // by default public static final

    public abstract void fun1();
    void fun2(); // by default public abstract

    // interface can have static methods
    public static void main(String[] args)  {
        System.out.println("static fun");
    }
    
    // can have default methods

    public default void fun4() {
        System.out.println("default fun");
    }
 
}
