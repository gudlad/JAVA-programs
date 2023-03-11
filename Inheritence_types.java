public class Inheritence_types {
/*
 * 1. single inheritance
 * 2. multiple inheritance   -- not supported implemented using interfaces
 * 3. hierarchical inheritance
 * 4. multi level inheritance  
 * 5. hybrid inheritance    -- not supported implemented using interfaces
 */
    
    public static void main(String[] args) {
        B b=new B();
        b.greet();
        System.out.println();
        // ----------------------------------------------------------------
        E e=new E();
        e.greet();
        System.out.println();
        // ---------------------------------------------------------------- 
        G g=new G();
        g.greet();
        H h=new H();
        h.greet();
        System.out.println();

    }

}

class A{
    public void greet()
    {
        System.out.println("hello");
    }
}

class B extends A{

}

class C{
    public void greet()
    {
        System.out.println("I am C");
    }
}

class D extends C{
    public void greet()
    {
        super.greet();
        System.out.println("I am C");
    }
}

class E extends D{
    public void greet()
    {
        super.greet();
        System.out.println("I am E");
    }
}


class F{
    public void greet()
    {
        System.out.println("I am F");
    }
}

class G extends F{
    public void greet()
    {
        super.greet();
        System.out.println("I am G");
    }
}

class H extends F{
    public void greet()
    {
        super.greet();
        System.out.println("I am H");
    }
}
