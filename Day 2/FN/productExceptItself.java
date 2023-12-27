import java.util.Scanner;
public class productExceptItself {

    public static void main(String[] args) {
        int n;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no of elements:");
       n = sc.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter the elements:");
       for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
       }
       int[] res = helper(arr,n);
       for(int i=0;i<n;i++){
           System.out.print(res[i]+" ");
       }
    }
    static int[] helper(int[] arr,int n){
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        int[] answer = new int[n];
        int left=1,right=1;
        for(int i=0;i<n;i++){
            leftProduct[i] = left;
            left*=arr[i];
        }
        for(int i=n-1;i>=0;i--){
            rightProduct[i] = right;
            right*=arr[i];
        }
        for(int i=0;i<n;i++){
            answer[i] = leftProduct[i]*rightProduct[i];
        }
        return answer;
    }
    
}
