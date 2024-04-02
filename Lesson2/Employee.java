package Lesson2;

public class Employee {

    public String name;
    public String post;
    public String Email;
    public String phone;
    public int salary;
    public int age;
    public Employee( String name, String post, String Email, String phone, int salary, int age ){
        this.name=name;
        this.post=post;
        this.Email=Email;
        this.phone=phone;
        this.salary=salary;
        this.age=age;
    }


    @Override
    public String toString() {
        return "Сотрудник-" +
                " ФИО: '" + name + '\'' +
                ", должность:  '" + post + '\'' +
                ", Email: '" + Email + '\'' +
                ", телефон:'" + phone + '\'' +
                ", зарплата: " + salary +
                ", возраст: " + age;
    }



    public static void main(String[] args) {
        Employee[] prsarray= new Employee[5];
        prsarray[0] = new Employee("Вячеслав Кобрин", "Генеральный директор", "vk@primer,ru", "+79996665544", 250000, 55);
        prsarray[1] = new Employee("Иван Зайцев", "Директор по развитию", "vz@primer,ru", "+79998884455", 127000, 42);
        prsarray[2] = new Employee("Дмитрий Медведев", "Охранник", "dm@primer,ru", "+79997771234", 19000, 21);
        prsarray[3] = new Employee("Олеся Лисина", "Ведущий разработчик", "ol@primer,ru", "+79995554789", 120000, 28);
        prsarray[4] = new Employee("Кристина Волкова", "Директор по работе с клиентами", "kv@primer,ru", "+79994445896", 138000, 48);

        }

}




