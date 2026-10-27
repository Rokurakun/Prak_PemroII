package Modul5.Soal1;

abstract class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    protected abstract double area();

    @Override
    public String toString() {
        return shapeName;
    }
}
