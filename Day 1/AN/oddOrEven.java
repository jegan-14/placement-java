import java.util.Scanner;
public class oddOrEven {

    public static void main(String[] args) {
       int n,oddCount=0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no of elements:");
       n = sc.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter the elements:");
       for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
           if(arr[i]%2!=0) oddCount++;
       }
       int[] odd =new int[oddCount];
       int[] even = new int[n-oddCount];
       
       int oddIdx=0,evenIdx=0;
       for(int num:arr){
           if(num%2==0) even[evenIdx++] = num;
           else odd[oddIdx++] = num;
       }
       System.out.println("Even array");
       for(int i:even){
           System.out.print(i+" ");
       }
       System.out.println("\nOdd Array");
       for(int i:odd){
           System.out.print(i+" ");
       }
    }
    
}
