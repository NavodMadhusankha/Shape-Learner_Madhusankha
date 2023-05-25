
import models.Shape;
import models.ShapeDTO;

import java.awt.*;
import java.awt.geom.Path2D;

public class ShapeService {
    static public ShapeDTO[] shapeDTOS = new ShapeDTO[]{
            new ShapeDTO(ShapeType.Square.name(),new Square()),
            new ShapeDTO(ShapeType.Circle.name(),new Circle()),
            new ShapeDTO(ShapeType.Rectangle.name(),new Rectangle()),
            new ShapeDTO(ShapeType.Triangle.name(),new Triangle()),
            new ShapeDTO(ShapeType.Pentagon.name(),new Pentagon()),
            new ShapeDTO(ShapeType.Hexagon.name(),new Hexagon()),
            new ShapeDTO(ShapeType.Octagon.name(),new Octagon()),
            new ShapeDTO(ShapeType.Heptagon.name(),new Heptagon()),
            new ShapeDTO(ShapeType.Nonagon.name(), new Nonagon()),
            new ShapeDTO(ShapeType.Decagon.name(), new Decagon()),
            new ShapeDTO(ShapeType.Ellipse.name(),new Ellipse()),
            new ShapeDTO(ShapeType.Diamond.name(),new Diamond()),
            new ShapeDTO(ShapeType.Trapezoid.name(),new Trapezoid()),
            new ShapeDTO(ShapeType.Parallelogram.name(),new Parallelogram()),
            new ShapeDTO(ShapeType.Cloud.name(),new Cloud()),
            new ShapeDTO(ShapeType.Cross.name(),new Cross()),
            new ShapeDTO(ShapeType.Oval.name(), new Oval()),
            new ShapeDTO(ShapeType.Flower.name(), new Flower()),
            new ShapeDTO(ShapeType.Star.name(), new Star()),
            new ShapeDTO(ShapeType.Heart.name(), new Heart()),
    };
}


enum ShapeType{
    Rectangle,
    Circle,
    Triangle,
    Square,
    Pentagon,
    Hexagon,
    Octagon,
    Ellipse,
    Diamond,
    Trapezoid,
    Parallelogram,
    Cloud,
    Cross,
    Oval,
    Flower,
    Heptagon,
    Nonagon,
    Decagon,
    Star,
    Heart
}

class Ellipse implements Shape {
    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        g.fillOval(x, y, width, height);
    }
}

class Diamond implements Shape {
    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        int[] xPoints = {x + width / 2, x + width, x + width / 2, x};
        int[] yPoints = {y, y + height / 2, y + height, y + height / 2};
        g.fillPolygon(xPoints, yPoints, 4);
    }
}


class Nonagon implements Shape {
    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        int[] xPoints = new int[9];
        int[] yPoints = new int[9];

        double angle = 0;
        double angleIncrement = 2 * Math.PI / 9;
        int radius = Math.min(width, height) / 2;

        for (int i = 0; i < 9; i++) {
            xPoints[i] = (int) (x + width / 2 + radius * Math.cos(angle));
            yPoints[i] = (int) (y + height / 2 + radius * Math.sin(angle));
            angle += angleIncrement;
        }

        g.fillPolygon(xPoints, yPoints, 9);
    }
}

 class Decagon implements Shape {
    @Override
    public void draw(Graphics g, int x, int y, int width, int height) {
        int[] xCoordinates = new int[10];
        int[] yCoordinates = new int[10];

        double angle = Math.PI / 10;

        for (int i = 0; i < 10; i++) {
            xCoordinates[i] = (int) (x + width / 2 + width / 2 * Math.cos(2 * i * angle));
            yCoordinates[i] = (int) (y + height / 2 + height / 2 * Math.sin(2 * i * angle));
        }
        g.fillPolygon(xCoordinates, yCoordinates, 10);
    }
}










