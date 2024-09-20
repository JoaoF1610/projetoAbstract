package PrincipalAbastractFactory;

public class BlueCircle extends Circle {

    public BlueCircle(float ray) {
        super("BLUE", ray);
    }

    @Override
    public void draw() {
        System.out.println("   ***   ");
        System.out.println(" *     * ");
        System.out.println("*  BLUE *");
        System.out.println("*       *");
        System.out.println(" *     * ");
        System.out.println("   ***   ");
    }
    
    
}
