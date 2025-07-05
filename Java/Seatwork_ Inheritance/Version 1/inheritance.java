package Seatwork;

//main code//
public class inheritance {
    public static void main(String[] args) {
        //run the mother class 2 times//
        System.out.println("Parent Class Instantiations");
        Shape shp1 = new Shape("Shape 1", 0);
        Shape shp2 = new Shape("Shape 2", 0);

        //display the information two times//
        shp1.displayInfo();
        System.out.println();
        shp2.displayInfo();
        System.out.println();

        //run subclass triangle 5 times//
        System.out.println("Triangle Class Instantiations");
        Triangle triangle1 = new Triangle(25, 15);
        triangle1.x = 2;
        Triangle triangle2 = new Triangle(36, 20);
        triangle1.x = 3;
        Triangle triangle3 = new Triangle(47, 35);
        triangle1.x = 4;
        Triangle triangle4 = new Triangle(58, 40);
        triangle1.x = 5;
        Triangle triangle5 = new Triangle(69, 55);
        //display triangle information 5 times//
        triangle1.displayInfo();
        System.out.println();
        triangle2.displayInfo();
        System.out.println();
        triangle3.displayInfo();
        System.out.println();
        triangle4.displayInfo();
        System.out.println();
        triangle5.displayInfo();
        System.out.println();

        //run rectangle subclass 5 times//
        System.out.println("Rectangle Class Instantiations");
        Rectangle rec1 = new Rectangle(25, 15);
        Rectangle.x = 2;
        Rectangle rec2 = new Rectangle(36, 20);
        Rectangle.x = 3;
        Rectangle rec3 = new Rectangle(47, 35);
        Rectangle.x = 4;
        Rectangle rec4 = new Rectangle(58, 40);
        Rectangle.x = 5;
        Rectangle rec5 = new Rectangle(69, 55);

        //display 5 times rectangle//
        rec1.displayInfo();
        System.out.println();
        rec2.displayInfo();
        System.out.println();
        rec3.displayInfo();
        System.out.println();
        rec4.displayInfo();
        System.out.println();
        rec5.displayInfo();
        System.out.println();


        //run circle subclass 5 times//
        System.out.println("Circle Class Instantiations");
        Circle crl1 = new Circle(25);
        Circle.x = 2;
        Circle crl2 = new Circle(36);
        Circle.x = 3;
        Circle crl3 = new Circle(47);
        Circle.x = 4;
        Circle crl4 = new Circle(58);
        Circle.x = 5;
        Circle crl5 = new Circle(69);

        //display 5 times//
        crl1.displayInfo();
        System.out.println();
        crl2.displayInfo();
        System.out.println();
        crl3.displayInfo();
        System.out.println();
        crl4.displayInfo();
        System.out.println();
        crl5.displayInfo();
        System.out.println();

    }

}
