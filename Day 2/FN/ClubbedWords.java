
import java.util.*;


public class ClubbedWords {
    public static List<String> findClubbedWords(String[] words) {
        List<String> result = new ArrayList<>();

        Set<String> wordSet = new HashSet<>(Arrays.asList(words));

        for (String word : words) {
            wordSet.remove(word);
            if (isClubbedWord(word, wordSet)) {
                result.add(word);
            }
            wordSet.add(word); 
        }

        return result;
    }

    private static boolean isClubbedWord(String word, Set<String> wordSet) {
        if (word.isEmpty()) {
            return false;
        }

        int n = word.length();

        for (int i = 1; i <= n; i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);

            if (wordSet.contains(prefix) && (wordSet.contains(suffix) || isClubbedWord(suffix, wordSet))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the elements:");
        sc.nextLine();
        for(int i=0;i<n;i++){
           arr[i] = sc.nextLine();
        }
        List<String> clubbedWords = findClubbedWords(arr);

        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("Output: " + clubbedWords);
    }
}

