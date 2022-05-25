package figeres_task1;

public class Main {
    public static void main(String[] args) {
        /*
        1. Написать иерархию классов «Фигуры».
Фигура -> Треугольник -> Прямоугольник -> Круг.
Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
периметра.
Создать массив из 5 фигур.
Вывести на экран сумму периметра всех фигур в массиве.
         */
        int sumPerimeters = 0;
        Circle circle = new Circle(6, 3.14);
        Rectangle rectangle = new Rectangle(8, 4);
        Rectangle rectangle1 = new Rectangle(3, 5);
        Triangle triangle = new Triangle(2, 4, 6);
        Triangle triangle1 = new Triangle(3, 5, 7);

        Figure[] figures = new Figure[5];
        figures[0] = circle;
        figures[1] = rectangle;
        figures[2] = rectangle1;
        figures[3] = triangle;
        figures[4] = triangle1;
        for (Figure figure : figures) {
            figure.findPerimeter();
            figure.findArea();
            figure.showResult();

            sumPerimeters += figure.perimeter;
        }
        System.out.println("Sum of Perimeters " + sumPerimeters);
    }
}
