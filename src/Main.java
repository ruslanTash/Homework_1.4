import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека " + age + " или более, то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
    public static void task2(){
        System.out.println("Задача 2");
        double temp = 20;
        if(temp >= 5){
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        }
        if(temp < 5){
            System.out.println("На улице " + temp + " градусов, нужно одеть шапку.");
        }
    }
    public static void task3(){
        System.out.println("Задача 3");
        double speed = 70;
        if(speed <= 60){
            System.out.println("Если скорость " + speed + "км/ч, то можно ездить спокойно.");
        }
        else {
            System.out.println("Если скорость " + speed + "км/ч, то придётся заплатить штраф");
        }
    }
    public static void task4(){
        System.out.println("Задача 4");
        int age = 34;
        if(age >= 2 && age <= 6){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        else if(age >= 7 && age <= 18){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        else if(age > 18 && age <= 24){
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
        }
        else if(age > 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }
    public static void task5(){
        System.out.println("Задача 5");
        int age = 1;
        if(age < 5){
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        else if(age >= 5 && age < 14){
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6(){
        System.out.println("Задача 7");
        int seatingPlace = 60;
        int totalPlace = 102;
        int standingPlace = totalPlace - seatingPlace;
        int totalPassenger = 120;
        if(totalPassenger < seatingPlace){
            System.out.println("Если количество пассажиров равно " + totalPassenger + ", то в вагоне ещё есть сидечие и стоячие места");
        }
        else if(totalPassenger >= seatingPlace && totalPassenger < totalPlace){
            System.out.println("Если количество пассажиров равно " + totalPassenger + ", то в вагоне осталиь только стоячие места");
        }
        else if(totalPassenger >= totalPlace){
            System.out.println("Если количество пассажиров равно " + totalPassenger + ", то в вагоне уже нет мест");
        }
    }
    public static void task7(){
        System.out.println("Задача 7");
        int one, two, three;
        one = 58; two = 75; three = 45;
        if(one > two && one > three){
            System.out.println("Из трёх чисел " + one + ", " + two + " и " + three + " самым большим является " + one);
        }
        else if(two > one && two > three){
            System.out.println("Из трёх чисел " + one + ", " + two + " и " + three + " самым большим является " + two);
        }
        else if(three > two && three > one){
            System.out.println("Из трёх чисел " + one + ", " + two + " и " + three + " самым большим является " + three);
        }
    }
}