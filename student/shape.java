package student;

abstract class Shapes {
    int dimension1;
    int dimension2;
    abstract void printArea();
}

class Rectangle extends Shapes {
    public Rectangle(int length, int breadth) {
        this.dimension1 = length;
        this.dimension2 = breadth;
    }
    
    void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shapes {
    public Triangle(int base, int height) {
        this.dimension1 = base;
        this.dimension2 = height;
    }

    void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shapes {
    public Circle(int radius) {
        this.dimension1 = radius;
    }

    void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Area of Circle: " + area);
    }
}

class Shape {
    public static void main(String[] args) {
        Shapes rectangle = new Rectangle(10, 5);
        rectangle.printArea();

        Shapes triangle = new Triangle(6, 8);
        triangle.printArea();

        Shapes circle = new Circle(7);
        circle.printArea();
    }
}
