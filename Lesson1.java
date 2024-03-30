package Lessons;

import java.util.Arrays;

public class Lesson1 {
    public static void main(String[] args) {
        PrintThreeWords();
        chekSumSign();
        printColor();
        compareNumbers();
        sravnenie(1, 10);
        polojit();
        sravTrue();
        visokos(2024);
        printName();
        massiv1();
        masSiv2(100);
        maSsiv3();
        masSiv4();
        massiv5();

    }


    public static void PrintThreeWords() {
        System.out.print("PrintThreeWords:");
        System.out.print("Apple.Banana,Orange");
        System.out.println();

    }

    public static void chekSumSign() {
        System.out.println("chekSumSign");
        int a = 10, b = 12;
        int c = a + b;
        if (c >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
        System.out.println();


    }

    public static void printColor() {
        System.out.println("printColor");
        int value = 5;
        if (value <= 0) System.out.println("Красный");
        else if (value > 0 && value <= 100) System.out.println("Желтый");
        if (value < 100) System.out.println("Зеленый");
        System.out.println();

    }

    public static void compareNumbers() {
        System.out.println("comparNnumbers;");
        int a = 6, b = 7;
        if (a >= b) System.out.println("a>=b");
        else System.out.println("a<b");
        System.out.println();
    }

   public static boolean sravnenie(int a, int b) {
        System.out.println("sravnenie:");
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);}
            return false;



    }



    
 public static boolean sravTrue(int a) {
        System.out.println("sravTrue:");
        if (a > 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        return false;
    }

    public static void polojit() {
        System.out.println("polojit:");
        int a = 10;
        if (a >= 0)
            System.out.println("Число положительное");
        else System.out.println("Число отрицательное");
        System.out.println();


    }


    public static void visokos(int year) {
        System.out.println("visokos");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }

    public static void printName() {
        System.out.println("printName");
        String username = "Dima";
        for (int a = 1; a <= 4; a++) {
            System.out.println(username);
        }
    }

    public static void massiv1() {
        System.out.println("massiv1");
        int[] massiv1 = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < massiv1.length; i++) {
            if (massiv1[i] == 0)
                massiv1[i]++;
            else massiv1[i]--;
        }
        System.out.println(Arrays.toString(massiv1));
    }

    public static void masSiv2(int size) {
        System.out.println("massiv2");
        int[] arr = new int[size];
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println(' ');


    }

    public static void maSsiv3() {
        System.out.println("massiv3");
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < 6)
                arr[i] = arr[i] *= 2;

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void masSiv4() {
        System.out.println("masSiv4");
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i==j){
                arr[i][i] = 1;
                System.out.println(arr[i][j] );
            }}
        }
    }

    public static void massiv5() {
        System.out.println("massiv5");
        int len=5; char initialValue = 0;
       int[] arr=new int[len];

        for(int i=0; i<arr.length; i++){
           arr[i]=initialValue;
            System.out.println(arr[i]);
       }


    }

}



