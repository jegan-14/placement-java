import java.util.Scanner;
public class StringPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter the string:");
        str = sc.nextLine();
        int len = str.length();
        int n = (len+2)/3;
        for(int i=0;i<n;i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        for(int i=1;i<n-1;i++){
            int space = n-i-1;
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            System.out.println(str.charAt(n+i-1));
        }
        for(int i=0;i<n;i++){
            System.out.print(str.charAt(2*n+i-2));
        }
        System.out.println();
    }
    
}
