import java.util.Scanner;
// include imports at beginning of program

public class newGame {
    public static void main(String[] args) {


        Scanner myScanner;
        myScanner = new Scanner(System.in);
        // System.in means this scanner can scan keyboard input

        // set initial variables
        String playerName;
        String playerWeapon;
        int playerSanity;
        int currentHealth;
        playerWeapon = "Old Shoe";
        playerSanity = 100;
        playerName = myScanner.nextLine();



        System.out.println("You wake in the middle of a field. You are unsure how you arrived here. Things are beginning to feel cliche, but you keep in mind to keep an open mind.");
        System.out.println("Press [enter] to continue.");

        // include 'enter' key event
        System.out.println("What is your name?");

        System.out.println("Hello, " + playerName + ". Here are your current stats:");
        System.out.println("You have one weapon at your disposal: " + playerWeapon);
        System.out.println("Your current sanity level is: " + playerSanity);
        System.out.println("Press [enter] to continue.");

        // EXTRA GAME LOGIC:
        // if Old Shoe/other weird item as starter, lower starting sanity
        // send on some sort of path with dead ends at the end of 'wrong path' nodes
        // have sanity pills to find
    }
}
