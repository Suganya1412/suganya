package String;

public class ReverseOddWordsInAString {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
        String[] words = test.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) { // Check for odd index
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        
        for (String word : words) {
            System.out.print(word + " ");
        }

	}

}
