public class Task_2 {

    public static void main (String args[]){ //вводим значения параметров
        triArea(3, 2);// 3
        triArea(7, 4);// 14
        triArea(10, 10);// 50
    }

    static void triArea(double x, double y){
        System.out.println(x*0.5*y);   //выводим результат по формуле 1/2 * a * b (a=x, b=y)
    }
}