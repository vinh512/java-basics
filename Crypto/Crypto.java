/* For this project you will be writing methods of encripting and decrypting text. */

public class Crypto {

  public static void main(String[] args) {
    String str = "This is some \"really\" great. (Text)!?";
    str = normalizeText(str);
    str = obify(str);
    System.out.println(str);
  }

  /* Removes all the spaces from your text
     Remove any punctuation (. , : ; ’ ” ! ? ( ) )
     Turn all lower-case letters into upper-case letters
     Return the result. */
  public static String normalizeText(String str) {
    str = str.replace(" ", "").replaceAll("[^a-zA-Z ]", "").toUpperCase();
    return str;
  }

  public static String obify(String str) {

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'E') {
        str.insert(i, "OB");
      }
    }
    return str;
  }

  // public static String obify(String str) {
  //   String[] strArr = str.split("");
  //   for (int i = 0; i < strArr.length; i++) {
  //     if (strArr[i].equals("E")) {
  //       System.out.println("found an e;");
  //       str.insert(i, "OB");
  //     }
  //   }
  //   return str;
  // }

}
