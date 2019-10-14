package example.java.design.patterns.principles.structural.facade;

public class ShapeFacade {

    private Shape square;
    private Shape rectangle;
    private Shape circle;

    public ShapeFacade() {
        square = new Square();
        rectangle = new Rectangle();
        circle = new Circle();
    }


    public static void main(String[] args) {
        ShapeFacade facade = new ShapeFacade();
        facade.drawCircle();
        facade.drawRectangle();
        facade.drawSquare();
    }

    private void drawSquare() {
        square.draw();
    }

    private void drawRectangle() {
        rectangle.draw();
    }

    private void drawCircle() {
        circle.draw();
    }

    interface Shape {
        void draw();
    }

    class Square implements Shape {

        @Override
        public void draw() {
            System.out.println("square: draw()");
        }
    }

    class Rectangle implements Shape {

        @Override
        public void draw() {
            System.out.println("rectangle: draw()");
        }
    }

    class Circle implements Shape {

        @Override
        public void draw() {
            System.out.println("circle: draw()");
        }
    }
}
