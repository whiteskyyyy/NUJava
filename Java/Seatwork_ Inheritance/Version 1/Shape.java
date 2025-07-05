package Seatwork;

//mother class//
class Shape {
    //name for shapes//
    private String shapeName;
    //variable for number of sides//
    private int sides;

    //shape input of name and number of sides//
    public Shape(String shapeName, int sides) {
        this.shapeName = shapeName;
        this.sides = sides;
    }

    //ask for shapename//
    public String getShapeName() {
        return shapeName;
    }

    //ask for number of sides//
    public int getSides() {
        return sides;
    }

    //ask for area//
    public double getArea() {
        return 0.0;
    }

    //ask for perimeter//
    public double getPerimeter() {
        return 0.0;
    }

    //code for displaying all of the important data//
    public void displayInfo() {
        System.out.println("Shape Name: " + shapeName);
        System.out.println("Number of Sides: " + sides);
        System.out.println("Area: " + Math.round(getArea()));
        System.out.println("Perimeter: " + Math.round(getPerimeter()));
    }
}

//subclass for triangle//
class Triangle extends Shape {
    //variable for triangle specifically
    private double base;
    private double height;

    public static int x = 1;

    //ask for 2 numbers//
    public Triangle(double base, double height) {
        //name of the subclass//
        super("Triangle " + x, 3);
        this.base = base;
        this.height = height;
    }

    //area of a triangle//
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    //triangle doesn't have any perimeter//
    @Override
    public double getPerimeter() {
        return 0.0;
    }
}

//This class provides a method to calculate the area of a rectangle.//
class Rectangle extends Shape {
    //variables for rectangle specifically
    private double length;
    private double width;
    public static int x = 1;
    //rectangle ask for 2 numbers//
    public Rectangle(double length, double width) {
        super("Rectangle " + x, 4);
        this.length = length;
        this.width = width;
    }

    //calculate the area//
    @Override
    public double getArea() {
        return length * width;
    }

    //calculate the perimeter//
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
//This class provides a method to calculate the area of a circle.//
class Circle extends Shape {
    //The radius of the circle//
    private double radius;
    public static int x = 1;
    //Constructor for objects of type Circle//
    public Circle(double radius) {
        super("Circle " + x, 0);
        this.radius = radius;
    }

    //Calculates the area of this circle//
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    //Calculates the Perimeterr of this circle//
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

}


