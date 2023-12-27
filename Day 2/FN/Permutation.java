import java.util.*;
public class Permutation {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
       int n;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no of elements:");
       n = sc.nextInt();
       int[] nums = new int[n];
       System.out.println("Enter the elements:");
       for(int i=0;i<n;i++){
           nums[i] = sc.nextInt();
       }
        boolean[] map = new boolean[n];
        backtrack(result,list,map,nums,n);
        System.out.println(result);
    }
    static void backtrack(ArrayList<ArrayList<Integer>> result,ArrayList<Integer> list,boolean[] map,int[] nums,int n){
        if(list.size()==n){
            result.add(new ArrayList<>(list));
            return;
        }
        else{
            for(int i=0;i<n;i++){
                if(!map[i]){
                    list.add(nums[i]);
                    map[i] = true;
                    backtrack(result,list,map,nums,n);
                    map[i] = false;
                    list.remove(list.size()-1);
                }
            }
        }
    }
}
