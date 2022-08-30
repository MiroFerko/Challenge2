import java.util.Random;

//task - create 10 words from string - alphabet, 4 characters each
public class Words2 {
    public static void main(String[] args) {
        // loop to print randomWord 10 times, returned from creation
        for (int i = 0; i < 10; i++) {
            String randomWord = creation();
            System.out.println(randomWord);
        }
    }



    public static String creation() {
        //String of characters to use
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //empty string to fill
        String randomString = "";
        //length of word
        int length = 4;
        //new object
        Random ran = new Random();
        //empty array
        char[] text = new char[length];

        //loop to add random characters to array
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(ran.nextInt(characters.length()));
        }

        //feed the word from array into string
        for (char c : text) {
            randomString += c;
        }
        return randomString;
    }
}