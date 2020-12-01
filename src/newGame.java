// include imports at beginning of program
import java.util.Scanner;

public class newGame {

    // set initial variables
    Scanner myScanner;
    int playerSanity;
    String playerWeapon;
    String playerName;

    public static void main(String[] args) {

        newGame game;
        game = new newGame();
        game.playerSetUp();
        game.startingField();

    }

    // create a method for the player/user
    public void playerSetUp() {

        final int playerInsane = 0;

        playerSanity = 100;
        playerWeapon = "Old Shoe";

        // System.in means this scanner can scan keyboard input
        myScanner = new Scanner(System.in);

        System.out.println("You wake in the middle of a field. You are unsure how you arrived here. Things are beginning to feel cliche, but you keep in mind to keep an open mind.");
        System.out.println("...");
        System.out.println("...");
        System.out.println("First things first, what is your name?");
        playerName = myScanner.nextLine();


        System.out.println("Well hey there, " + playerName + ", I hope you're ready for an adventure!");
        System.out.println("Here are your current stats: ");
        System.out.println("Your current sanity level is: " + playerSanity);
        System.out.println("Your current weapon is: " + playerWeapon);
        System.out.println("Let's go!");
        System.out.println("------------------------");


    }

    public void startingField(){

        System.out.println("You see you have a couple options from your spot in the field. You can keep walking through the tall grass, head towards the forest, or venture through the bog.");
        System.out.println("1: Keep walking through the field.");
        System.out.println("2: Go through the forest.");
        System.out.println("3: Head into the bog.");

        int choice;
        choice = myScanner.nextInt();

        if(choice == 1) {
            System.out.println("You head into the swaying grass and hope for the best.");
        }
        if(choice == 2) {
            System.out.println("You head into the thick brush and hope for the best.");
        }
        if(choice == 3) {
            System.out.println("You step into a blanket of humidity and hope for the best.");
        }



        // if in field, do below code:
        // System.out.println("You look around the grassy plains and notice they look familiar. Where have you seen these before?");
        // movie, dream, or book

    }
}

// EXTRA GAME LOGIC:
// if Old Shoe/other weird item as starter, lower starting sanity
// send on some sort of path with dead ends at the end of 'wrong path' nodes
// have sanity pills to find
// include 'enter' key event
// System.out.println("Press [enter] to continue.");