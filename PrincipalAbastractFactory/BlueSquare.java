package PrincipalAbastractFactory;

public class BlueSquare extends Square {

    public BlueSquare(float height) {
        super(height, "BLUE");
    }

    @Override
    public void draw() {
        System.out.println("* * * * *");
        System.out.println("* * * * *");
        System.out.println("* BLUE  *");
        System.out.println("* * * * *");
        System.out.println("* * * * *");
    }
    
}
