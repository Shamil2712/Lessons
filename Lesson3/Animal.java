package Lesson3;

public class Animal {
    static int countAnimals=0;
    Animal(){
    countAnimals++;
    }

      void run(int range){
          System.out.println("Живоьтное бежит"+range+"m");
      }
      void swim(int range){
          System.out.println("Животное плывет"+range+"m");
      }

    public static int getCountAnimals(){
        return countAnimals;

    }

}
