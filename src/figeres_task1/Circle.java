package figeres_task1;

public class Circle extends Figure {
    double r;
    double pi;

    Circle(double r, double pi) {
        this.r = r;
        this.pi = pi;

    }

    @Override
    public void findArea() {
        area = pi * (r * r);
    }

    @Override
    public void findPerimeter() {
        perimeter = 2 * pi * r;
    }

    public void showResult() {
        System.out.println("Area Circle " + area);
        System.out.println("Perimeter Circle " + perimeter);
    }
}
