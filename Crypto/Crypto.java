/* For this project you will be writing methods of encripting and decrypting text. */

public class Crypto {

  public static void main(String[] args) {

    System.out.println(normalizeText("This is some \"really\" great. (Text)!?"));
  }

  /* Removes all the spaces from your text
     Remove any punctuation (. , : ; ’ ” ! ? ( ) )
     Turn all lower-case letters into upper-case letters
     Return the result. */
  public static String normalizeText(String str) {
    str = str.replace(" ", "").replaceAll("[^a-zA-Z ]", "").toUpperCase();
    return str;
  }


}
