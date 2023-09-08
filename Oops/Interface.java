public class Interface {
    public static void main(String[] args) {
        Shape s;
        s = new Square();    // s acts like a square
        methods(s);

        s = new Rectangle(); // s acts like a rectangle
        methods(s);


        s = new Circle();   // s acts like a circle
        methods(s);

    }
    public static void methods(Shape shape) // to avoid duplicating code
    {
        shape.draw();
        shape.display();
    }
}


interface Shape{ 
     void draw(); // by default abstract public
    void display();
}

class Square implements Shape
{
    public void draw(){
        System.out.println("Drawing a square");
    }
    public void display(){
        System.out.println("Displaying a square");
    }
}

class Rectangle implements Shape
{
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
    public void display(){
        System.out.println("Displaying a rectangle");
    }
}

class Circle implements Shape
{
    public void draw(){
        System.out.println("Drawing a circle");
    }
    public void display(){
        System.out.println("Displaying a circle");
    }
}


