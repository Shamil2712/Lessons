package Lesson3_1;

public class Circle implements Programm {
    @Override
    public void fillcolor() {

        System.out.println("Цвет границ белый");

    }

    @Override
    public void borderColor() {
        System.out.println("Цвет фона синий ");

    }

    @Override
    public void calcPerimeter() {


    }

    @Override
    public void calcSquare() {
        double S;
        int r=4;
        S=Math.PI*r*r;
        System.out.println("Площадь круга "+S);

    }
}
