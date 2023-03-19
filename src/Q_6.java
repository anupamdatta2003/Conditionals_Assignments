import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.println("Enter Your Marks:");
        marks = sc.nextInt();
        if(marks>=90){
            System.out.println("Your Grade is A+");
        } else if (marks>=80) {
            System.out.println("Your Grade is A");
        } else if (marks>=70) {
            System.out.println("Your Grade is B+");
        } else if (marks>=60) {
            System.out.println("Your Grade is B");
        } else if (marks>=50) {
            System.out.println("Your Grade is C");
        } else if (marks>=40) {
            System.out.println("Your Grade is D");
        } else if (marks>=30) {
            System.out.println("your Grade is E");
        } else if (marks>=0) {
            System.out.println("Your Grade is F");
        }
    }
}
