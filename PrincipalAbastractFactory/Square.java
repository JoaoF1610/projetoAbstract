package PrincipalAbastractFactory;

public abstract class Square extends Shape {

    private float height;

    public Square(float height, String color) {
        super(color);
        this.height = height;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

}
