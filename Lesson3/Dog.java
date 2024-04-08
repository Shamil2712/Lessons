package Lesson3;

public class Dog extends Animal{
    String name;
    static int countDog=0;
    Dog(String name){
        super();
        countDog++;
        this.name=name;

    }

    @Override
    void run(int range) {
        if(range>500){
            System.out.println(name+" Не может бежать дальше "+range+"m");
        }
        else {
            System.out.println(name+" Пробежал "+range+ " м");}
    }

    @Override
    void swim(int range) {
       if(range>10){
           System.out.println(name+" Не может плыть дальше "+range+" м");
       }
       else {
           System.out.println(name+" Проплыл "+range+" m");
       }
    }
    static int getCountDog(){
        return countDog;
    }
}
