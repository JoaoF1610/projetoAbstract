package PrincipalAbastractFactory;

public class RedSquare extends Square {

    public RedSquare(float height) {
        super(height, "RED");
    }

    @Override
    public void draw() {
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("*  RED  *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
    }

}
