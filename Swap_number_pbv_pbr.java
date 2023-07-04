class Swap{
    int a,b;
    Swap(int a,int b)
    {
        this.a = a;
        this.b = b;
    }

    public static void swap(int a, int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+" b="+b);

    }

    public void swap()
    {
        
        System.out.println("a="+this.a+" j="+this.b);
        this.a=this.a+this.b;
        this.b=this.a-this.b;
        this.a=this.a-this.b;
        System.out.println("a="+this.a+" j="+this.b);
    }
}

public class Swap_number_pbv_pbr {
    public static void main(String[] args) {
        // pass by value
        int a=12;
        int b=32;
        Swap.swap(a,b); 

        // pass by reference
        Swap s=new Swap(12,14);
        s.swap();
        System.out.println("a="+s.a+" j="+s.b);

    }
}
