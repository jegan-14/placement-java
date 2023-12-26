import java.util.Scanner;
public class StringCompression {
    public static void main(String[] args) {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        str = sc.nextLine();
        System.out.println(compressString(str));
    }
    static String compressString(String str){
        int n = str.length();
        StringBuilder string = new StringBuilder("");
        char current = str.charAt(0);
        int count=1;
        for(int i=1;i<n;i++){
            if(str.charAt(i) != current){
                string.append(current);
                if(count!=1)
                string.append(count);
                current = str.charAt(i);
                count=1;
            }
            else{
                count++;
            }
        }
        string.append(current);
        if(count!=1)
        string.append(count);
        return string.toString();
    }
    
}
