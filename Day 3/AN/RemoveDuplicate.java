
import java.util.Scanner;

public class RemoveDuplicate {

    static int removeDuplicateArray(int[] arr) 
    {
        int count;
        if (arr.length==0) 
        {
            return 0;
        }

        count=1; 
        for (int i=1;i<arr.length; i++) 
        {
            if (arr[i]!=arr[i-1]) 
            {
                arr[count]=arr[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
         Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size=scanner.nextInt();
        int[] arr=new int[size];

        System.out.println("Enter the elements:");
        for (int i=0;i<size;i++) 
        {
            arr[i]=scanner.nextInt();
        }

        System.out.println("Number of unique elements: " + removeDuplicateArray(arr));
    }
}