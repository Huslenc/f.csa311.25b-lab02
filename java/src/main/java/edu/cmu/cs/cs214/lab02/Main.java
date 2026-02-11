package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2, 3);
        Circle circle = new Circle(5);
        Square square = new Square(4);

        Renderer r1 = new Renderer(rectangle);
        Renderer r2 = new Renderer(circle);
        Renderer r3 = new Renderer(square);

        r1.draw();
        r2.draw();
        r3.draw();
    }
}
