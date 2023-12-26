package placement;
import java.util.Scanner;
public class program_1b {

    public static void main(String[] args) {
        float num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        num1 = sc.nextFloat();
        System.out.println("Enter the number 2:");
        num2 = sc.nextFloat();
        float avg = (num1+num2)/2;
        System.out.println("The average of the two numbers :");
        System.out.printf("%.2f\n",avg);
    }
    
}
