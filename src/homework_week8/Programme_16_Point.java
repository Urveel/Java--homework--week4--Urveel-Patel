package homework_week8;

import java.awt.*;

/**
 * You have to represent a point in 2D space. Write a class with the name Point. The class needs two
 * fields (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters x and y of type int and it needs to initialize the
 * fields.
 * Write the following methods (instance methods):
 * * Method named getX without any parameters, it needs to return the value of x field.
 * * Method named getY without any parameters, it needs to return the value of y field.
 * * Method named setX with one parameter of type int, it needs to set the value of the x field.
 * * Method named setY with one parameter of type int, it needs to set the value of the y field.
 * * Method named distance without any parameters, it needs to return the distance between this Point
 * and Point 0,0 as double.
 * * Method named distance with two parameters x, y both of type int, it needs to return the distance
 * between this Point and Point x,y as double.
 * * Method named distance with parameter another of type Point, it needs to return the distance
 * between this Point and another Point as double.
 * How to find the distance between two points?
 * To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
 * d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
 * Where √ represents square root.
 */
public class Programme_16_Point {
    private int x;
    private int y;

    // No argument constructor

    // Default constructor intializes x and y to 0

    // Parameterizes cosntructor
    public class Programme_16Point {
        private int x;
        private int y;

        // No argument constructor
        public Programme_16Point() {
            // Default constructor intializes x and y to 0
        }

        // Parameterizes cosntructor
        public Programme_16Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public double distance() {
            return Math.sqrt(x * x + y * y);
        }

        public double distance(int x, int y) {
            return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
        }

        public double distance(Point another) {
            return Math.sqrt((another.getX() - this.x) * (another.getX() - this.x) + (another.getY() - this.y) * (another.getY() - this.y));
        }

        public static void main(String[] args) {
            Point point1 = new Point(3, 4);
            System.out.println("Distance to origin (0,0): " + point1.distance(0, 0));

            Point point2 = new Point(6, 8);
            System.out.println("Distance between points: " + point1.distance(point2));

        }
    }
}
