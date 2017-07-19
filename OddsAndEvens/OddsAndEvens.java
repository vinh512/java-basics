import java.util.*;

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

    System.out.print("How many fingers do you put out? ");
    int userFingers = input.nextInt();

    Random rand = new Random();
    int compFingers = rand.nextInt(6);

    System.out.println("The computer plays " + compFingers + "!");
    System.out.println("------------------------------");

    int sum = userFingers + compFingers;
    String results = "";

    if (sum % 2 == 0) {
      results = "even";
    } else {
      results = "odd";
    }

    System.out.println(userFingers + " + " + compFingers + " = " + sum);
    System.out.println(sum + " is an " + results + " number!");

  }

}
