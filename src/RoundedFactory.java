public class RoundedFactory extends SuperFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("Rectangle")){
            return new RoundedRectangle();
        }
        if (shapeType.equalsIgnoreCase("Square")){
            return new RoundedSquare();
        }
        return null;
    }
}
