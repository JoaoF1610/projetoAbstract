package PrincipalAbastractFactory;

public class Rectangle extends Shape {
    private float base;

    public Rectangle(String color, float base) {
        super(color);
        this.base = base;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public void draw() {}

}
