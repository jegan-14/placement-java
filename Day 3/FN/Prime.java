import java.util.*;
public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements :");
        n = sc.nextInt();
       PalPrime[] arr = new PalPrime[n];
       System.out.println("Enter the elements:");
       for(int i=0;i<n;i++){
           int num = sc.nextInt();
           arr[i] = new PalPrime(num,"");
       }
    }
    
}
class PalPrime{
    int number;
    String message;
    PalPrime(int num,String message){
        this.number = num;
        if(isPrime(number) && isPalindrome(number)){
            this.message = "PalPrime";
        }
        if(!isPrime(number) && isPalindrome(number)){
            this.message = "Palindrome";
        }
        if(isPrime(number) && !isPalindrome(number)){
            this.message = "Prime";
        }
        if(!isPrime(number) && !isPalindrome(number)){
            this.message = "Neither palindrome not prime";
        }
                
        System.out.println("Number "+number+ " is "+this.message);
    }
    static boolean isPrime(int n){
        if(n==1 || n==0) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    static boolean isPalindrome(int n){
        int reverse=0;
        int a=n;
        while(a>0){
            int b = a%10;
            reverse = reverse*10 + b;
            a/=10;
        }
        if(reverse==n) return true;
        return false;
    }
}
