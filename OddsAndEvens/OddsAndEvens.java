import java.util.Scanner;

class OddsAndEvens {

  public static void main(String[] args) {
    System.out.println("Lets play a game called \"Odds and Evens\"");
    System.out.print("What is your name? ");

    Scanner input = new Scanner(System.in);
    String name = input.nextLine();

    System.out.print("Hi " + name + ", which do you prefer? (O)dds or (E)vens? ");
    String choice = input.next();
    choice = choice.toLowerCase();

    if (choice.equals("o") || choice.equals("odds")) {
      System.out.println(name + " has chosen Odds so the computer will be Evens.");
    } else if (choice.equals("e") || choice.equals("evens")) {
      System.out.println(name + " has chosen Evens so the computer will be Odd.");
    }
    System.out.println("------------------------------");
  }

}
