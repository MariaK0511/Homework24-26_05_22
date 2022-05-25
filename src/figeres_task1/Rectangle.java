package figeres_task1;

public class Rectangle extends Figure {
    double a, b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void findArea() {
        area = a * b;
    }

    @Override
    public void findPerimeter() {
        perimeter = a + a + b + b;
    }

    @Override
    public void showResult() {
        System.out.println("Area rectangle " + area);
        System.out.println("Perimeter rectangle " + perimeter);

    }
}
