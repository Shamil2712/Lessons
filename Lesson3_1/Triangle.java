package Lesson3_1;

public class Triangle implements Programm {
    @Override
    public void calcPerimeter() {
        int a=3;
        int b=4;
        int c=5;
        int P;
        P=a+b+c;
        System.out.println("ПЕриметр треугольника "+P);

    }

    @Override
    public void calcSquare() {
        int a=3;
        int b=4;
        int c=5;
        int S;
        S=(a*b)/2;
        System.out.println("Площадь треугольника "+S);

    }

    @Override
    public void fillcolor() {
        System.out.println("Цвет границ синий ");

    }

    @Override
    public void borderColor() {
        System.out.println("Цвет фона белый ");

    }
}
