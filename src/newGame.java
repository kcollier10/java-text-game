// include imports at beginning of program
import java.util.Scanner;

public class newGame {
    public static void main(String[] args) {

        newGame game;
        game = new newGame();
        game.playerSetUp();

    }

    // create a method for the player/user
    public void playerSetUp() {

        // set initial variables
        int playerSanity;
        String playerWeapon;
        String playerName;
        final int playerInsane = 0;

        playerSanity = 100;
        playerWeapon = "Old Shoe";

        // System.in means this scanner can scan keyboard input
        Scanner myScanner;
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
    }
}

// EXTRA GAME LOGIC:
// if Old Shoe/other weird item as starter, lower starting sanity
// send on some sort of path with dead ends at the end of 'wrong path' nodes
// have sanity pills to find
// include 'enter' key event
// System.out.println("Press [enter] to continue.");