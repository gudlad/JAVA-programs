public class Polymorphism
{
    public static void main(String[] args) {

        Shape s;
        // s = new Square();    // s acts like a square
        s = new Rectangle(); // s acts like a rectangle
        // s = new Cricle();   // s acts like a circle

        methods(s);

    }
    public static void methods(Shape shape) // to avoid duplicating code
    {
        shape.draw();
        shape.display();
    }
}
abstract class Shape{ 
    // methods in Shape class are not used by it's children
    // we can't completle remove these methods
    // if these methods are removed then we can't access these
    // methods using Parent class reference
    // methods being present in parent class is important to achieve the polymorph
    // so make these methods as abstract
    abstract public void draw();
   abstract public void display();
}

class Square extends Shape
{
    public void draw(){
        System.out.println("Drawing a square");
    }
    public void display(){
        System.out.println("Displaying a square");
    }
}

class Rectangle extends Shape
{
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
    public void display(){
        System.out.println("Displaying a rectangle");
    }
}

class Cricle extends Shape
{
    public void draw(){
        System.out.println("Drawing a cricle");
    }
    public void display(){
        System.out.println("Displaying a cricle");
    }
}