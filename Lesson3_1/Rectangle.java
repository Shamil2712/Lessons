package Lesson3_1;

public class Rectangle implements Programm {
    @Override
    public void calcPerimeter() {
        int a = 4;
        int b=5;
        int P;
        P=2*(a+b);
        System.out.println("Периметр прямоугольника "+P);

    }

    @Override
    public void calcSquare() {
        int a = 4;
        int b=5;
        int S;
        S=a*b;
        System.out.println("Площадь прямоугольника "+S);

    }

    @Override
    public void fillcolor() {
        System.out.println("Цвет границ зеленый ");

    }

    @Override
    public void borderColor() {
        System.out.println("Цвет фона красный ");

    }
}
