public class Main {
    public char maxOccuringChar(String str) {
        int[] freq = new int[256]; 
        int maxFreq = 0;
        char maxChar = '\0';

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            freq[c]++;
            
            if (freq[c] > maxFreq) {
                maxFreq = freq[c];
                maxChar = c;
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        String input = "Doselect";
        System.out.println(sol.maxOccuringChar(input)); 
    }
}