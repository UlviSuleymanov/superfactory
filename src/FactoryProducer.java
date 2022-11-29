public class FactoryProducer {
    public static SuperFactory getFactory(boolean rounded) {
        if (rounded) {
            return new RoundedFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
