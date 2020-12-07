// include imports at beginning of program
import java.util.Scanner;
import java.util.ArrayList;

public class newGame {

    // set initial variables
    Scanner myScanner;
    int playerSanity;
    String playerWeapon;
    String playerName;
    String gameOver = "------ZERO SANITY: GAME OVER------";
    // end game screen?
//    final int playerInsane = 0;


    public static void main(String[] args) {

        newGame game;
        game = new newGame();
        game.playerSetUp();
        game.startingField();

    }

    // create a method for the player/user
    public void playerSetUp() {


        playerSanity = 100;





        // System.in means this scanner can scan keyboard input
        myScanner = new Scanner(System.in);

        System.out.println("You wake in the middle of a field. You are unsure how you arrived here. Things are beginning to feel cliche, but you keep in mind to keep an open mind.");
        System.out.println("...");
        System.out.println("...");
        System.out.println("First things first, what is your name?");
        playerName = myScanner.nextLine();
        System.out.println("Well hey there, " + playerName + ", I hope you're ready for an adventure!");
        System.out.println("-----------------------");
        System.out.println("You get to choose your first weapon! Choose wisely:");
//        System.out.println("Available weapons: nerf gun, feather, old shoe, tophat, spaghetti.");
        ArrayList<String> WeaponArray = new ArrayList<String>();
        WeaponArray.add("nerf gun");
        WeaponArray.add("feather");
        WeaponArray.add("old shoe");
        WeaponArray.add("tophat");
        WeaponArray.add("spaghetti");
        System.out.println(WeaponArray);

        // figure out how to use strings here instead of numbers
        // string is an object, so we can't compare it to an int/anything in primitive type
        // String hello = "hello";
        // System.out.println(hello.equalsIgnoreCase("HeLlO"));

        String choice;
        choice = myScanner.nextLine();

        switch (choice) {
            case "nerf gun":
                playerWeapon = "nerf gun";
                playerSanity += 3;
                System.out.println("Sanity level increased by 3. Current sanity level = " + playerSanity);
                break;
            case "feather":
                playerWeapon = "feather";
                playerSanity -= 1;
                System.out.println("Sanity level decreased by 1. Current sanity level = " + playerSanity);
                break;
            case "old shoe":
                playerWeapon = "old shoe";
                playerSanity += 20;
                System.out.println("You chose the golden item! Sanity level increased by 20! Current sanity level = " + playerSanity);
                break;
            case "tophat":
                playerWeapon = "tophat";
                playerSanity -= 5;
                System.out.println("Sanity level decreased by 5. Class will cost you! Current sanity level = " + playerSanity);
                break;
            case "spaghetti":
                playerWeapon = "spaghetti";
                playerSanity += 3;
                System.out.println("Sanity increased by 3 for being patient enough to carry around loose spaghetti. Current sanity level = " + playerSanity);
                break;
        }

//        WeaponArray.remove(new String(choice));
        WeaponArray.remove(choice);
        System.out.println(WeaponArray);
        System.out.println();

        System.out.println("Your current weapon is: " + playerWeapon);
        System.out.println("Your current sanity level is: " + playerSanity);
        System.out.println("Let's go!");
        System.out.println("------------------------");
    }

    public void startingField(){

        System.out.println("You see you have a couple options from your spot in the field. You can keep walking through the tall grass, head towards the forest, or venture through the bog.");
        System.out.println("1: Keep walking through the field.");
        System.out.println("2: Go through the forest.");
        System.out.println("3: Head into the bog.");
        System.out.println("4: Stay put.");

        int choice;
        choice = myScanner.nextInt();

        switch (choice) {
            case 1:
                choiceField();
                break;
            case 2:
                choiceForest();
                break;
            case 3:
                choiceBog();
                break;
            case 4:
                playerSanity = playerSanity -1;
                System.out.println("You rock back and forth in place. -1 SANITY");
                System.out.println("Your current sanity is: ." + playerSanity);
                System.out.println("-----------------------------------------");
                startingField();
                break;
        }

    }

    public void choiceField() {

        System.out.println("You head into the swaying grass and hope for the best.");
        System.out.println("Things are calm until you hear a rustling sound to the side of you.");
        System.out.println("The rustling gets closer. What do you do?");
        System.out.println("1: Stand still.");
        System.out.println("2: Walk slowly.");
        System.out.println("3: Sprint.");

        int choice;
        choice = myScanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You remember from Jurassic Park that a T-rex's vision is based on movement and apply that logic to whatever is in the bushes.");
                System.out.println("The rustling gets closer.");
                System.out.println("It turns out you forgot the most important part of Jurassic Park fields - velociraptors.");
                System.out.println("By the time you realize your mistake, it's too late. CHOMP.");
                playerSanity = 0;
                System.out.println(gameOver);
                break;
            case 2:
                System.out.println("You know you don't want to be here anymore, but you don't want to startle whatever is making that noise.");
                System.out.println("When you realize the noise is a velociraptor gang, you pick up the pace. Unfortunately, you received a minor chomp for waiting.");
                playerSanity = playerSanity - (playerSanity/2);
                System.out.printf("Your sanity is now %d.", playerSanity);
                break;
            case 3:
                System.out.println("GTFO. You escape the field with your sanity only mildly reduced.");
                playerSanity = playerSanity - 5;
                System.out.printf("Current sanity is %d.", playerSanity);

        }
    }

    public void choiceForest() {

        System.out.println("You head into the thick brush and hope for the best.");
    }

    public void choiceBog() {

        System.out.println("You step into a blanket of humidity and hope for the best.");


    }

}

// EXTRA GAME LOGIC:
// if Old Shoe/other weird item as starter, lower starting sanity
// send on some sort of path with dead ends at the end of 'wrong path' nodes
// have sanity pills to find
// include 'enter' key event
// System.out.println("Press [enter] to continue.");
// program in the use of weapon chosen and ability to choose a different one