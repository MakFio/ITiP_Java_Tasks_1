public class Task_4 {

    public static void main (String args[]){    //вводим значения параметров
        profitableGamble(0.2, 50, 9);// true
        profitableGamble(0.9, 1, 2);// false
    }

    static void profitableGamble(double prob, double prize, double pay){
        System.out.println((prize*prob)>pay);    //выводим результат, сравнивая произведение prob, prize и pay
    }
}
