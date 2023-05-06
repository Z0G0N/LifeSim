import java.util.Scanner;

import javax.print.attribute.standard.JobImpressions;

class MainGame {
    private static String cmd = "cmd: ";

    public static Boolean tutorial() {
        ColorText colorText = new ColorText();

        Scanner scan = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("You will be choose a job, and you will have to work to earn money.");
        System.out.println("You will have to manage your hunger, thirst, and sleep.");
        System.out.println("You will also have to manage your skills.");
        System.out.println(" ");
        System.out.println("You can do this by going to the store and buying food, drinks, and beds.");
        System.out.println("You can also go to the to train your "  + colorText.Purple() + "Skills" + colorText.Reset() + ".");
        System.out.println(" ");
        System.out.println("You can also buy a "  + colorText.Cyan() + "Car" + colorText.Reset() + ", "  + colorText.Cyan() + "House" + colorText.Reset() + ", and"  + colorText.Cyan() + " Softwear" + colorText.Reset() + ".");
        System.out.println(" ");
        System.out.println("You can also have to go to the doctor if you get " + colorText.Red() + "Very Sick" + colorText.Reset() + " ");
        System.out.println(" ");
        System.out.println("You can also go to the " + colorText.Blue() + "bank" + colorText.Reset() + " to deposit and withdraw money.");
        System.out.println(" ");
        System.out.println("You will have something called " + colorText.Red() + "sanity" + colorText.Reset() + " if you are low on " + colorText.Red() + "sanity" + colorText.Reset() + " your life will become harder.");
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

    public static void Job(Player player) {
        Jobs jobs = new Jobs();
        Scanner scan = new Scanner(System.in);
        ColorText colorText = new ColorText();

        System.out.println(" ");
        System.out.println("You can choose from these jobs:");
        System.out.println(" ");
        System.out.println(" ");
        System.out.print(cmd + colorText.Reset());
        String command = scan.nextLine();
        if (command.toLowerCase().equals("delivery")) {
            System.out.println(jobs.Delivery(player));
        } else {
            System.out.println(" ");
            System.out.println("That is not a job!");
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        ColorText colorText = new ColorText();
        Scanner scan = new Scanner(System.in);

        //Start Game
        System.out.print(colorText.Clear());

        System.out.println("Welcome to Life Sim!");
        System.out.print("Let's start with your name: " + colorText.Green());
        String name = scan.nextLine();
        System.out.print(colorText.Clear() + colorText.Reset());

        // Create Player
        Player player = new Player(name);

        System.out.println("Welcome " + colorText.Reset() + player.getName() + colorText.Reset() +"!");
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
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(colorText.Clear() + colorText.Reset());
        System.out.print(cmd);
        String command = scan.nextLine();
        if (command.toLowerCase().equals("jobs") || command.toLowerCase().equals("job")) {
            Job(player);
        }
    }
}