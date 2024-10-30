package strings;



public class TextProcessor {

    public static void main (String[] args) {
        // countWords("I love Java");
        reverseString("Hello World");
    }

    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("You text contains %d words", numberOfWords);
        System.out.println(message);

        for(String word: words) {
            System.out.println(word);
        }

    }

    public static void reverseString(String text) {
        for (var i = text.length()-1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
