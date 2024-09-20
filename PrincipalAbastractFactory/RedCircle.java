package PrincipalAbastractFactory;

public class RedCircle extends Circle {

    public RedCircle(float ray) {
        super("RED", ray);
    }

    @Override
    public void draw() {
        System.out.println("   ***   ");
        System.out.println(" *     * ");
        System.out.println("*  RED  *");
        System.out.println("*       *");
        System.out.println(" *     * ");
        System.out.println("   ***   ");
    }

}
