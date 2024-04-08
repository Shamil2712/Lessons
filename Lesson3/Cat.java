package Lesson3;

public class Cat extends Animal{
    static String name;
    static int countcat=0;
    public static int eat;
    public int hungry;
    public boolean fullness;


    Cat(String name){
        super();
        countcat++;
        this.name =name;
       this.eat=eat;

    }

    @Override
    void run(int range) {
        if(range>200){
            System.out.println(name+" Не может бежать дальше 200м");
        }
        else {
            System.out.println(name+" Пробежал"+range+" м");
        }
    }

    @Override
    void swim(int range) {
        System.out.println("Кот не умеет плавать");
    }
    static int getCountcat(){
        return countcat;
    }
    void eat(int meal){
        if(meal<10){
            System.out.println(name+" не может есть");
        }
        else {
            System.out.println(name+" Съел "+meal);
        }

    }
    void satiety(int meal){
        if (meal>5){
            System.out.println(name+" Сыт");
        }
    }



}
