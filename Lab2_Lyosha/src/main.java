import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть 6-значний номер Вашого квитка: ");
        int number = in.nextInt();

        int first = (number/100000) + ((number%100000)/10000) + ((number%10000)/1000);
        int second = ((number%1000)/100) + ((number%100)/10) + (number%10);

        if (first == second){
            System.out.println("Квиток щасливий!");
        }
        else {
            System.out.println("Квиток нещасливий!");
        }

    }
}
