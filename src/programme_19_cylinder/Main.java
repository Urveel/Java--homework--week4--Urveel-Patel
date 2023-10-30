package programme_19_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle= new Circle(3.75);
        System.out.println("circle.radium ="+circle.getRadius());
        System.out.println("circle.area= "+ circle.getArea());
        Cylinder cylinder= new Cylinder(5.55, 7.25);
        System.out.println("cyclinder.radius = " + cylinder.getRadius());
        System.out.println("cyclinder.radius = " + cylinder.getHeight());
        System.out.println("cylinder.area= "+ cylinder.getArea());
        System.out.println("cylinder.volume="+ cylinder.getVolume());
    }
}
