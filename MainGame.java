import java.util.Scanner;

class MainGame {
    private static String cmd = "cmd: ";
    private static String Clear = "\033[H\033[2J";

    public static Boolean tutorial() {
        String Black = "\033[0;30m";   // BLACK
        String Red = "\033[0;31m";     // RED
        String Green = "\033[0;32m";   // GREEN
        String Yellow = "\033[0;33m";  // YELLOW
        String Blue = "\033[0;34m";    // BLUE
        String Purple = "\033[0;35m";  // PURPLE
        String Cyan = "\033[0;36m";    // CYAN
        String White = "\033[0;37m";   // WHITE
        String Reset = "\033[0m";  // Text Reset

        Scanner scan = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("You will be choose a job, and you will have to work to earn money.");
        System.out.println("You will have to manage your hunger, thirst, and sleep.");
        System.out.println("You will also have to manage your skills.");
        System.out.println(" ");
        System.out.println("You can do this by going to the store and buying food, drinks, and beds.");
        System.out.println("You can also go to the to train your "  + Purple + "Skills" + Reset + ".");
        System.out.println(" ");
        System.out.println("You can also buy a "  + Cyan + "Car" + Reset + ", "  + Cyan + "House" + Reset + ", and"  + Cyan + " Softwear" + Reset + ".");
        System.out.println(" ");
        System.out.println("You can also have to go to the doctor if you get " + Red + "Very Sick" + Reset + " ");
        System.out.println(" ");
        System.out.println("You can also go to the " + Blue + "bank" + Reset + " to deposit and withdraw money.");
        System.out.println(" ");
        System.out.println("You will have something called " + Red + "sanity" + Reset + " if you are low on " + Red + "sanity" + Reset + " your life will become harder.");
        System.out.println(" ");
        System.out.println("You will use the 'cmd:' for the commands. For example, if you want to go to the store, type 'store'.");
        System.out.println("Say cmd:'back' to go back to the main menu.");
        System.out.println(" ");
        System.out.print(cmd);
        String command = scan.nextLine();
        if (command.equals("back")) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        // Colors
        String Black = "\033[0;30m";   // BLACK
        String Red = "\033[0;31m";     // RED
        String Green = "\033[0;32m";   // GREEN
        String Yellow = "\033[0;33m";  // YELLOW
        String Blue = "\033[0;34m";    // BLUE
        String Purple = "\033[0;35m";  // PURPLE
        String Cyan = "\033[0;36m";    // CYAN
        String White = "\033[0;37m";   // WHITE
        String Reset = "\033[0m";  // Text Reset

        Scanner scan = new Scanner(System.in);

        //Start Game
        System.out.print(Clear);

        System.out.println("Welcome to Life Sim!");
        System.out.print("Let's start with your name: " + Green);
        String name = scan.nextLine();
        System.out.print(Clear + Reset);

        // Create Player
        Player player = new Player(name);

        System.out.println("Welcome " + Green + player.getName() + Reset +"!");
        System.out.println(" ");
        System.out.println("If you need help at any time, type 'help'.");
        System.out.println("To see your stats, type 'stats'.");
        System.out.println("To see your skills, type 'skills'.");
        System.out.println(" ");
        System.out.println("Lets get started!");
        System.out.println(" ");
        System.out.println("Do you want a quick tutorial? (y/n)");
        String tutorial = scan.nextLine();
        if (tutorial.equals("y")) {
            Boolean TutDone = tutorial();
            if (TutDone) {
                System.out.println(" ");
                System.out.println("You went through the tutorial! Great job!");
                System.out.println(" ");
            }
        }
    }
}