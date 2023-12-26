package placement;
import java.util.Scanner;
public class program_2 {

    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        num1=sc.nextInt();
        System.out.println("Enter the number 2:");
        num2=sc.nextInt();
        System.out.println("Enter the operator:");
        char operation = sc.next().charAt(0);
        
        switch(operation){
            case '+':
                System.out.println("The addition of "+num1+" and "+num2+" is "+(num1+num2));
                break;
            case '-':
                System.out.println("The subtraction of "+num1+" and "+num2+" is "+(num1-num2));
                break;
            case '*':
                System.out.println("The multiplication of "+num1+" and "+num2+" is "+(num1*num2));
                break;
            case '/':
                if(num2==0){
                    System.out.println("The second number could not be zero for division");
                    break;
                }
                System.out.println("The division of "+num1+" and "+num2+" is "+(num1/num2));
                break;
            default:
                System.out.println("Error operation!!! try different operation");
        }
    }
    
}
