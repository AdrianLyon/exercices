package exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class exercicies {

    //reverse word

    public static String reverseWord (String word){
        String reversed = new StringBuilder(word).reverse().toString();
        return reversed;
    }

    public static String reverseWord2 (String word){
        char[] arr = word.toCharArray();
        String rr = ""; 
        for (int i = arr.length - 1; i >= 0; i--) {
            rr += arr[i]; 
        }

        return rr;
    }

    //is prime
    public static boolean isPrime(int number){
        return number % 2 == 0 ?  true: false;
    }
    public static boolean isPrime2(int number){
        if (number <= 1){
            return false;
        }

        if (number == 2){
            return true;
        }

        if (number % 2 == 0){
            return false;
        }

        for(int i = 3; i <= Math.sqrt(number); i +=2){
            if (number % i == 0){
                return false;
            }
        }

        return true ;
    }
    

    //is palindrome
    public static boolean isPalindrome(String word){
        String wordFormat = word.trim().replaceAll("\\s", "").toLowerCase();
        String w = "";
        char[] arr = wordFormat.toCharArray();
        for (int i = arr.length -1; i >=0; i--){
            w += arr[i];
        }
        return w.equals(wordFormat);
    }
    public static boolean isPalindrome2(String word) {
        word = word.toLowerCase().replaceAll("\\s", "");
        int i = 0, j = word.length() -1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    //ispalindrome with acent
    public static boolean isPalindromeWithLoop(String word){;
        word = Normalizer.normalize(word, Normalizer.Form.NFD).replaceAll("[\\p{InCombiningDiacriticalMarks}]", "").replaceAll("\\s", "").toLowerCase();

        int i = 0, j = word.length()-1;

        while(i<j){
            if (word.charAt(i) != word.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    //delete duplicate
    Integer[] arr = {1, 1, 3, 2, 4,4,5};
    List<Integer> deleteDuplicate = Arrays.asList(arr);
    
    Set<Integer> conjuntoSinDuplicados = new HashSet<>(deleteDuplicate);

    // Convertir de nuevo a lista
    List<Integer> listaSinDuplicados = new ArrayList<>(conjuntoSinDuplicados);

    //System.out.println("Lista sin duplicados: " + listaSinDuplicados);

    //edit missing number
    static int missingNumber(int n, int arr[]) {
        int result = n*(n+1)/2;
        int sum = 0;

        for (int i : arr){
            sum += i;
        }

        return result - sum;
    }
}
