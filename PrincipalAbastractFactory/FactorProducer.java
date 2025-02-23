package PrincipalAbastractFactory;

public class FactorProducer {
    
    public static AbstractFactory getFactory(String color) {
        if (color.equalsIgnoreCase("BLUE")) {
            return new BlueShapeFactory();
        } else {
            if (color.equalsIgnoreCase("RED")) {
                return new RedShapeFactory();
            }
        }
        return null;
    }

}
