import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        char op;
        Double num1;
        Double num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an operator(+,-,*,/):");
        op = sc.next().charAt(0);
        System.out.println("Enter first number:");
        num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        num2 = sc.nextDouble();
        switch (op){
            case '+':
                Double p = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + p);
                break;
            case '-':
                Double q = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" +q);
                break;
            case '*':
                Double r = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" +r);
                break;
            case '/':
                Double s = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" +s);
                break;
            default:
                System.out.println("Error");

        }
    }
}
