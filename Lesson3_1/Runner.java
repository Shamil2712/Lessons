package Lesson3_1;

public class Runner {


    public static void main(String[] args) {
    Circle circle=new Circle();
    Rectangle rectangle=new Rectangle();
    Triangle triangle=new Triangle();
Programm[] programms=new Programm[]{circle, rectangle, triangle};
        for (Programm programm : programms) {
            programm.fillcolor();
            programm.borderColor();
            programm.calcSquare();
            programm.calcPerimeter();

        }


    }
}
