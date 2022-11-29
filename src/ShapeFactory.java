public class ShapeFactory extends SuperFactory{
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}
