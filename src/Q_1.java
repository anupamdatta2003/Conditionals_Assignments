import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.println("Enter length:");
        length = sc.nextInt();
        int breadth;
        System.out.println("Enter breadth:");
        breadth = sc.nextInt();
        if(length == breadth){
            System.out.println("It is a square");
        }else{
            System.out.println("It is a rectangle");
        }
    }
}
