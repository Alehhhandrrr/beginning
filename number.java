import java.util.Scanner;

public class number {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        int n = in.nextInt();
        if (-10 < n && n < 10) {
            System.out.println("Одинаковые цифры");
        } else
        {
            while(true) {
                boolean a;
                a = (n % 10) == ((n / 10) % 10);
                if(!a){
                    System.out.print("Разные цифры");
                    break;
                }else{
                    System.out.print("Одинаковые цифры. Changed");
                    break;
                }
            }
        }
    }
}