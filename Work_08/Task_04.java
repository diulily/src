package Work_08;

public class Task_04 {
    public static void main(String[] args) {
        String str = "This is a sample text containing some words som you doo.";
        String[] words = str.split("\\s+|\\.");

        for (String word : words) {
            if (word.length() == 3) {
                System.out.println(word);
            }
        }
    }
}
