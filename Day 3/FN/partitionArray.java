import java.util.*;
public class partitionArray {

    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the partition size:");
        int k = sc.nextInt();
        int partitionOrderSize;
        if(n%k==0) partitionOrderSize=n/k;
        else partitionOrderSize = (n/k)+1;
        int[] partitionOrder = new int[partitionOrderSize];
        System.out.println("Enter the order:");
        for(int i=0;i<partitionOrderSize;i++){
            partitionOrder[i] = sc.nextInt();
        }
        List<List<Integer>> list = partition(nums,k);
        int[] answer = mergePartition(list,partitionOrder,n);
        
        for(int i:answer){
            System.out.print(i+" ");
        }
        
    }
    static List<List<Integer>> partition(int[] nums,int partitionSize){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        int n = nums.length;
        for(int i=1;i<=n;i++){
            if(i%partitionSize==0){
                ds.add(nums[i-1]);
                result.add(new ArrayList<>(ds));
                ds.clear();
            }
            else{
                ds.add(nums[i-1]);
            }
        }
        result.add(new ArrayList<>(ds));
        return result;
    } 
    static int[] mergePartition(List<List<Integer>> list,int[] partitionOrder,int n){
        int[] result = new int[n];
        int idx=0;
        
        for(int i:partitionOrder){
            List<Integer> partition = list.get(i-1);
            int size = partition.size();
            for(int j=0;j<size;j++){
                result[idx++] = partition.get(j);
            }
        }
        return result;
    }
    
}
