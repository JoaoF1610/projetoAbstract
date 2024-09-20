package PrincipalAbastractFactory;

public class RedRectangle extends Rectangle {

    public RedRectangle(float base) {
        super("RED", base);
    }

    @Override
    public void draw() {
        System.out.println("* * * * * * *");
        System.out.println("* *  RED  * *");
        System.out.println("* * * * * * *");
    }
    
    
}
