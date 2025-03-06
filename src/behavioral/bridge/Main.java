package behavioral.bridge;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new Red());
        triangle
                .color
                .fill();

        triangle.draw();


        Shape circle = new Circle(new Blue());
        circle
                .color
                .fill();
    }
}
