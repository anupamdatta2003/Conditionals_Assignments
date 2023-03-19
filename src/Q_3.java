import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cp;
        System.out.println("Enter cost price:");
        cp = sc.nextInt();
        int sp;
        System.out.println("Enter selling price:");
        sp = sc.nextInt();
        int profit;
        profit = sp - cp;
        int loss;
        loss = cp - sp;
        if(profit > 0){
            System.out.println("Profit:" + profit);
        }else{
            System.out.println("Loss:" + loss);
        }
    }
}
