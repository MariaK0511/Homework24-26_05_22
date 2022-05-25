package figeres_task1;
import java.lang.Math;

public class Triangle extends Figure {
    double a, b, c;
    double pp = (a + b + c) / 2.0;
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;


    }

    @Override
    public void findArea() {
        Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }

    @Override
    public void findPerimeter() {

perimeter=a+b+c;
    }

    @Override
    public void showResult() {
        System.out.println("Area Triangle " + area);
        System.out.println("Perimeter Triangle " + perimeter);

    }
}
