public class Main {
    public static void main(String[] args) {

        SuperFactory sf = FactoryProducer.getFactory(false);
        Shape shape1 = sf.getShape("Rectangle");
        shape1.draw();
        Shape shape2 = sf.getShape("Square");
        shape2.draw();
        SuperFactory sf2 = FactoryProducer.getFactory(true);
        Shape shape3 = sf2.getShape("Rectangle");
        shape3.draw();
        Shape shape4 = sf2.getShape("Square");
        shape4.draw();
    }
}