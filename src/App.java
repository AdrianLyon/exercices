public class App {
    public static void main(String[] args) throws Exception {
        String word ="A man a plan a canal Panama";
        System.out.println(isPalindrome2(word));
    }

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
}
