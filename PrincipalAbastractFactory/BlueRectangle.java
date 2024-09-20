package PrincipalAbastractFactory;

public class BlueRectangle extends Rectangle {

    public BlueRectangle(float base) {
        super("BLUE", base);
    }

    @Override
    public void draw() {
        System.out.println("* * * * * * *");
        System.out.println("* *  BLUE * *");
        System.out.println("* * * * * * *");
    }

}
