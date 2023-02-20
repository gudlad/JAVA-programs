public class StaticBlock {

    // The static block execution happens before
    // the main method is executed 
    // when we want to display something or execute some code 
    // before main we can use static block
    static{
        System.out.println("Name of App : Sun App");
        System.out.println("Purpose of App : To calculate the sum of no's ");
    }

    public static void main(String[] args) {
        int a=4;
        double b=19.3;
        System.out.println(a+b);
        
    }
}
