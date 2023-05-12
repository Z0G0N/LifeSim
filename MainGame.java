import java.util.Scanner;

class MainGame {
    private static String cmd = "cmd: ";

    // --- Tutorial --- //
    public static Boolean tutorial() {
        ColorText colorText = new ColorText();

        Scanner scan = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("You will be choose a job, and you will have to work to earn money.");
        System.out.println("You will have to manage your hunger, thirst, and sleep.");
        System.out.println("You will also have to manage your skills.");
        System.out.println(" ");
        System.out.println("You can do this by going to the store and buying food, drinks, and beds.");
        System.out.println(
                "You can also go to the to train your " + colorText.Purple() + "Skills" + colorText.Reset() + ".");
        System.out.println(" ");
        System.out.println(
                "You can also buy a " + colorText.Cyan() + "Car" + colorText.Reset() + ", " + colorText.Cyan() + "House"
                        + colorText.Reset() + ", and" + colorText.Cyan() + " Softwear" + colorText.Reset() + ".");
        System.out.println(" ");
        System.out.println("You can also have to go to the doctor if you get " + colorText.Red() + "Very Sick"
                + colorText.Reset() + " ");
        System.out.println(" ");
        System.out.println("You can also go to the " + colorText.Blue() + "bank" + colorText.Reset()
                + " to deposit and withdraw money.");
        System.out.println(" ");
        System.out.println("You will have something called " + colorText.Red() + "sanity" + colorText.Reset()
                + " if you are low on " + colorText.Red() + "sanity" + colorText.Reset()
                + " your life will become harder.");
        System.out.println(" ");
        System.out.println(
                "You will use the 'cmd:' for the commands. For example, if you want to go to the store, type 'store'.");
        System.out.println("Say cmd:'back' to go back to the main menu.");
        System.out.println(" ");
        System.out.print(colorText.Blue() + cmd + colorText.Reset());
        String command = scan.nextLine();
        if (command.equals("back")) {
            return true;
        } else {
            return false;
        }
    }

    // ---- Jobs ---- //
    public static void Job(Player player) {
        Jobs jobs = new Jobs();
        Scanner scan = new Scanner(System.in);
        ColorText colorText = new ColorText();
        System.out.println(colorText.Clear());
        System.out.println(colorText.Cyan() + "[ -------- JOBS -------- ]");
        System.out.println("[       Delivery         ]");
        System.out.println("[       Uber             ]");
        System.out.println("[       Pizza Worker     ]");
        System.out.println("[       Fast Food Worker ]");
        System.out.println("[       Mail Man         ]");
        System.out.println("[       Teacher          ]");
        System.out.println("[       Developer        ]");
        System.out.println("[       Salesman         ]");
        System.out.println("[ ---------------------- ]" + colorText.Reset());
        System.out.println(" ");
        System.out.println(" ");
        System.out.print(colorText.Blue() + cmd + colorText.Reset());
        String command = scan.nextLine();
        if (command.toLowerCase().equals("delivery") || command.toLowerCase().equals("d") || command.toLowerCase().equals("1")) {
            jobs.Delivery(player);
        }
        else if (command.toLowerCase().equals("uber") || command.toLowerCase().equals("u") || command.toLowerCase().equals("2")) {
            jobs.Uber(player);
        }

        else if (command.toLowerCase().equals("pizza_worker") || command.toLowerCase().equals("pw") || command.toLowerCase().equals("3")) {
            jobs.Pizza_worker(player);
        }

        else if (command.toLowerCase().equals("fast_food_worker") || command.toLowerCase().equals("ffw") || command.toLowerCase().equals("4")) {
            jobs.Fast_Food_Worker(player);
        }

        else if (command.toLowerCase().equals("mail_man") || command.toLowerCase().equals("mm") || command.toLowerCase().equals("5")) {
            System.out.println(jobs.Mail_Man(player));
        }

        else if (command.toLowerCase().equals("teacher") || command.toLowerCase().equals("t") || command.toLowerCase().equals("6")) {
            System.out.println(jobs.Teacher(player));
        }

        else if (command.toLowerCase().equals("developer") || command.toLowerCase().equals("dev") || command.toLowerCase().equals("7")) {
            System.out.println(jobs.Developer(player));
        }

        else if (command.toLowerCase().equals("salesman") || command.toLowerCase().equals("s") || command.toLowerCase().equals("8")) {
            System.out.println(jobs.Salesman(player));
        }

        else {
            System.out.println(" ");
            System.out.println(colorText.Red() + "That is not a job!" + colorText.Reset());
            System.out.println(" ");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Game(player);
    }

    // ---- Game ---- //
    public static void Game(Player player) {
        ColorText colorText = new ColorText();
        Scanner scan = new Scanner(System.in);
        System.out.println(colorText.Reset());
        String Hunger, Thirtst, Health, LifePoints;
        // ---- Hunger ---- //
        if (player.getHunger() < 50) {
            Hunger = ("Hunger: " + colorText.Red() + player.getHunger() + colorText.Reset());
        } else {
            Hunger = ("Hunger: " + colorText.Green() + player.getHunger() + colorText.Reset());
        }
        // ---- Thirst ---- //
        if (player.getThirst() < 50) {
            Thirtst = (" / " + "Thirtst: " + colorText.Red() + player.getThirst() + colorText.Reset());
        } else {
            Thirtst = (" / " + "Thirtst: " + colorText.Green() + player.getThirst() + colorText.Reset());
        }
        // ---- Health ---- //
        if (player.getHealth() != "Healthy") {
            Health = (" / " + "Health: " + colorText.Red() + player.getHealth() + colorText.Reset());
        } else {
            Health = (" / " + "Health: " + colorText.Green() + player.getHealth() + colorText.Reset());
        }
        // ---- Life Points ---- //
        if (player.getLifePoints() < 50) {
            LifePoints = (" / " + "Life Points: " + colorText.Red() + player.getLifePoints() + colorText.Reset());
        } else {
            LifePoints = (" / " + "Life Points: " + colorText.Green() + player.getLifePoints() + colorText.Reset());
        }
        String Level = ("Level: " + colorText.Blue() + player.getLevel() + colorText.Reset());
        String Exp = (" / Exp: " + colorText.Blue() + player.getExp() + colorText.Reset());
        String Cash = (" / Cash: " + colorText.Blue() + player.getCash() + colorText.Reset());
        System.out.println("["  + Hunger + Thirtst + Health + LifePoints + "]" + "\n[" + Level + Exp + Cash + "]");
        System.out.println(" ");
        System.out.print(colorText.Blue() + cmd + colorText.Reset());
        String command = scan.nextLine();

        // [ ---- Jobs ----]

        if (command.toLowerCase().equals("jobs") || command.toLowerCase().equals("job")) {
            Job(player);
        }
                
        // [ ---- Store ----]

        if (command.toLowerCase().equals("store") || command.toLowerCase().equals("s") || command.toLowerCase().equals("buy")) {
            Store.dealership(player);
        }
                
        // [ ---- Other ----]


                
        // [ ---- Cheat ----]



        /// [ ---- Player ----]

        if (command.toLowerCase().equals("player") || command.toLowerCase().equals("plr")) {
            System.out.println(colorText.Clear());
            System.out.println(player);
            System.out.println(" ");
            Game(player);
        }

        if (command.toLowerCase().equals("test")) {
            Testing test = new Testing();
            System.out.println(test.menu());
            System.out.println(" ");
            System.out.print(colorText.Red() + "Test - " + cmd + colorText.Reset());
            String testCMD = scan.nextLine();
            test.commandArea(testCMD, player);
            Game(player);
        }
        // [ ---- Tutorial ----]

        else if (command.toLowerCase().equals("tutorial")) {
            tutorial();
            Game(player);
        }
        else if (command.toLowerCase().equals("5409")) {
            while (true) {
                CheatMenu cheatMenu = new CheatMenu();
                System.out.println(colorText.Yellow() + "Cheat Menu" + colorText.Reset());
                System.out.println(colorText.Yellow() + "Add / Subtract / Set - lifePoints \nAdd / Subtract / Set - Thirst \nAdd / Subtract / Set - Hunger \nAdd / Subtract / Set - Sanity \nAdd / Subtract / Set - level \nAdd / Subtract / Set - exp \nAdd / Subtract / Set - cash \nAdd / Subtract / Set - name \nAdd / Subtract / Set - car \nAdd / Subtract / Set - Hardwear \nAdd / Subtract / Set - Softwear \nAdd / Subtract / Set - health - Sickness \nAdd / Subtract / Set - sleep \nAdd / Subtract / Set - bedType \nAdd / Subtract / Set - house \nAdd / Subtract / Set - BrainStatus \nAdd / Subtract / Set - DriversLicence \n" + colorText.Reset());
                System.out.println(" ");
                System.out.print(colorText.Yellow() + "Cheat: " + cmd + colorText.Reset());
                String cheatCommand = scan.nextLine();
                if (cheatCommand.toLowerCase().equals("add - lifepoints")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.addLifePoints(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("subtract - lifepoints")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.subtractLifePoints(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("set - lifepoints")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.setLifePoints(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("add - thirst")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.addThirst(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("subtract - thirst")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.subtractThirst(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("set - thirst")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.setThirst(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("add - hunger")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.addHunger(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("subtract - hunger")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.subtractHunger(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("set - hunger")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.setHunger(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("add - sanity")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.addSanity(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("subtract - sanity")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.subtractSanity(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("set - sanity")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.setSanity(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("add - level")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.addLevel(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("subtract - level")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.subtractLevel(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("set - level")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.setLevel(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("add - exp")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.addExp(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("subtract - exp")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.subtractExp(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("set - exp")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.setExp(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("add - cash")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.addCash(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("subtract - cash")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.subtractCash(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("set - cash")) {
                    System.out.print(colorText.Yellow() + "Amount: " + colorText.Reset());
                    int amount = scan.nextInt();
                    CheatMenu.setCash(player, amount);
                }
                if (cheatCommand.toLowerCase().equals("player")) {
                    System.out.print(colorText.Clear());
                    System.out.print(colorText.Blue() + player + colorText.Reset());
                    System.out.println(" ");
                }
                if (cheatCommand.toLowerCase().equals("set - license")) {
                    System.out.print(colorText.Clear());
                    System.out.print(colorText.Blue() + cmd + colorText.Reset());
                    Boolean license = scan.nextBoolean();
                    player.setDriversLicence(license);
                    System.out.println(
                            colorText.Yellow() + "License: " + player.getDriversLicence() + colorText.Reset());
                }
                if (cheatCommand.toLowerCase().equals("clear")) {
                    System.out.print(colorText.Clear());
                }
                if (cheatCommand.toLowerCase().equals("back")) {
                    Game(player);
                    break;
                }
            }
        }
        else {
            System.out.println(colorText.Red() + "That is not a valid command!" + colorText.Reset());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(colorText.Clear());
            Game(player);
        }
    }

    // ---- Main ---- //
    public static void main(String[] args) {
        ColorText colorText = new ColorText();
        Scanner scan = new Scanner(System.in);

        // Start Game
        System.out.print(colorText.Clear());
        // Welcome Message
        System.out.println("Welcome to " + colorText.Green() + "Life Sim!" + colorText.Reset());
        System.out.print("Let's start with your name: " + colorText.Green());
        String name = scan.nextLine();
        System.out.print(colorText.Clear() + colorText.Reset());

        // Create Player
        Player player = new Player(name);

        System.out.println("Welcome " + colorText.Reset() + player.getName() + colorText.Reset() + "!");
        System.out.println(" ");
        System.out.println("If you need help at any time, type 'help'.");
        System.out.println("To see your stats, type 'stats'.");
        System.out.println("To see your skills, type 'skills'.");
        System.out.println(" ");
        System.out.println("Lets get started!");
        System.out.println(" ");
        System.out.println("Do you want a quick tutorial?" + colorText.Yellow() + " (y/n)" + colorText.Reset());
        System.out.print(colorText.Blue() + cmd + colorText.Reset());
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
        Game(player);
    }
}