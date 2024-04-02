package Lesson2;

public class Park {
    public static class Attractions{
        private String name;
        private String time;
        private int cost;

        public Attractions(String name, String time, int cost) {
            this.name = name;
            this.time = time;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }
    }
    public static class park{
        public static void main(String[] args) {
            Park park=new Park();
            Park.Attractions attraction1=new Park.Attractions("Карусель","10:00-19:00",100);
            Park.Attractions attraction2=new Park.Attractions("Американские горки","10:00-19:00",250);
            Park.Attractions attraction3=new Park.Attractions("Железная дорога","10:00-16:00",150);
        }

    }
}
