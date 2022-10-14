public class Task_5 {

    public static void main (String args[]){    //вводим значения параметров
        operation(24, 15, 9);// "added"
        operation(24, 26, 2);// "subtracted"
        operation(15, 11, 11);// "none"
        operation(49, 7,7);// "multiplied"
        operation(7,91,13);// "divided"
    }

    static void operation(double x, double y, double z){   //вводим несколько условий для проверки
        if ((y+z)==x)   //если y+z=x, то два последних числа должны быть сложены
            System.out.println("added");
        else if ((y-z)==x) //если y-z=x, то два последних числа должны быть вычтены
            System.out.println("subtracted");
        else if ((y*z)==x)  //если y*z=x, то два последних числа должны быть перемножены
            System.out.println("multiplied");
        else if ((y/z)==x)    //если y/z=x, то два последних числа должны быть поделены
            System.out.println("divided");
        else
            System.out.println("none"); //если предыдущие условия ни к чему не привели, тони одна из операции ничего не даст
    }
}
