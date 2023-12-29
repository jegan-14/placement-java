
import java.util.Scanner;

public class CalculatorProgram {

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        Scanner sc =new Scanner(System.in);
        int num1,num2;
        double n1,n2,n3;
        System.out.println("MULTIPLICATION OF TWO INT");
        System.out.println("Enter the number 1");
        num1 = sc.nextInt();
        System.out.println("Enter the number 2");
        num2 = sc.nextInt();
        System.out.println(num1+"*"+num2+" = "+obj.multiply(num1, num2));
        
        System.out.println("MULTIPLICATION OF THREE DOUBLE");
        System.out.println("Enter the number 1");
        n1 = sc.nextDouble();
        System.out.println("Enter the number 2");
        n2 = sc.nextDouble();
        System.out.println("Enter the number 3");
        n3 = sc.nextDouble();
        System.out.println(n1+"*"+n2+"*"+n3+" = "+obj.multiply(n1, n2,n3));
        
    }
    
}
class Calculator{
    int multiply(int num1,int num2){
        return num1*num2;
    }
    
    double multiply(double num1,double num2,double num3){
        return num1*num2*num3;
    }
}