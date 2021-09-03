import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
      Scanner read = new Scanner(System.in);

      String VideoGameName, Prize, Reason, Reason2;

      System.out.println("choose a VideoGameName");
      VideoGameName = read.nextLine();

      System.out.println("choose a Prize");
      Prize = read.nextLine();

      System.out.println("Why did you get the Prize");
      Reason = read.nextLine();

      System.out.println("what was is for");
      Reason2 = read.nextLine();

      System.out.println( "you have won a game of " + VideoGameName + " and got a " + Prize + " for " + Reason + " and for" + Reason2);

      



    }

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */
}