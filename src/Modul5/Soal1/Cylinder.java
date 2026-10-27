package Modul5.Soal1;

public class Cylinder extends Shape {
    private double radius, height;

    public Cylinder(double r, double h) {
        super("Cylinder");
        this.radius = r;
        this.height = h;
    }

    @Override
    public double area() {
        return Math.PI * (radius * radius) * height;
    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
