import PrincipalAbastractFactory.AbstractFactory;
import PrincipalAbastractFactory.FactorProducer;
import PrincipalAbastractFactory.Shape;

public class Principal {
    public static void main(String[] args) {
        AbstractFactory blueShapeFactory = FactorProducer.getFactory("BLUE");
        
        Shape blueCircle = blueShapeFactory.getRectangle(1);
        blueCircle.draw();
    }
    
}