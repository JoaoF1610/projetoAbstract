package PrincipalAbastractFactory;

public class Circle extends Shape {
    private float ray;

    public Circle(String color, float ray) {
        super(color);
        this.ray = ray;
    }

    public float getRay() {
        return ray;
    }

    public void setRay(float ray) {
        this.ray = ray;
    }

    @Override
    public void draw(){}

    
}
