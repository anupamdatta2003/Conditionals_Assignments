import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter an integer:");
        num = sc.nextInt();
        if(num>0){
            System.out.println("The number is positive");
        }else{
            System.out.println("The number is negative and skipped");
        }
    }
}
