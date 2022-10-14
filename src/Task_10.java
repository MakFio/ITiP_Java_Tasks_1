public class Task_10 {

    public static void main (String args[]){    //вводим значения параметров
        abcmath(5, 2, 1);// true
        abcmath(1, 2, 3);// false
    }

    static void abcmath(double a, double b, double c){
        System.out.println(((a*(Math.pow(2,b)))%c)==0);    //сравниваем остаток от деления A, умноженного на 2 в степени B, на C с нулем
    }
}
