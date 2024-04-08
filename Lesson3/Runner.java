package Lesson3;


public class Runner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Animal();
        Cat barsik = new Cat("Barsik");
        Cat murzik = new Cat("Murzik");
        Dog tuzik = new Dog("Tuzik");
        Dog sharik = new Dog("Sharik");
        barsik.run(100);
        murzik.run(250);
        barsik.swim(100);
        murzik.swim(10);
        tuzik.run(300);
        tuzik.swim(5);
        sharik.run(100);
        sharik.swim(5);
        barsik.eat(12);
        murzik.eat(6);
        barsik.satiety(2);
        murzik.satiety(7);
        System.out.println("Все животные: " + Animal.getCountAnimals());
        System.out.println("Все коты: " + Cat.getCountcat());
        System.out.println("Все собаки: " + Dog.getCountDog());
        Cat[] cat=new Cat[2];


    }
    public class Main {
        public int eat = 10;
        public int i;


        public int main(String[] args) {
            Cat[] cats = new Cat[2];
            cats[0] = new Cat("barsik " + i);
            cats[1] = new Cat("Murzik " + i);
            for (i = 0; i < cats.length; i++) {
                if (eat > 10) {
                    System.out.println(cats + " Покушал");
                } else {
                    System.out.println(cats + " Остался голодным");
                }
            }
            return eat;
        }
    }

    


}







