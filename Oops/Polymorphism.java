public class Polymorphism
{
    public static void main(String[] args) {
        // tight coupling doesn't allow the polymorphism
        /*  
        Shape s = new Shape();
        Square sq = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        */

        
        // use loose coupling to use polymorphism
        Shape s;
        // s = new Square();    // s acts like a square
        s = new Rectangle(); // s acts like a rectangle
        // s = new Circle();   // s acts like a circle

        methods(s);

    }
    public static void methods(Shape shape) // to avoid duplicating code
    {
        shape.draw();
        shape.display();
    }
}
class Shape{
    public void draw(){
        System.out.println("Drawing a shape");
    }
    public void display(){
        System.out.println("Displaying a shape");
    }
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

class Circle extends Shape
{
    public void draw(){
        System.out.println("Drawing a Circle");
    }
    public void display(){
        System.out.println("Displaying a Circle");
    }
}