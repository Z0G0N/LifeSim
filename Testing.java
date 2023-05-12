import java.util.Scanner;

public class Testing {

    public String menu() {
        ColorText colorText = new ColorText();
        String menu = "";
        menu += ("\n 1. stats");
        menu += ("\n 2. furnature");
        menu += ("\n 3. homes");
        menu += ("\n 4. cars");
        menu += ("\n 5. player");
        menu += ("\n 6. scenario");
        menu += ("\n 7. sickness");
        return (colorText.Red() + menu + colorText.Reset());
    }

    public void commandArea(String testCMD, Player player) {
        if (testCMD.toLowerCase().equals("s") || testCMD.toLowerCase().equals("stats") || testCMD.toLowerCase().equals("1")) { stats(player); }
        if (testCMD.toLowerCase().equals("f") || testCMD.toLowerCase().equals("furnature") || testCMD.toLowerCase().equals("2")) { furnature(player); }
        if (testCMD.toLowerCase().equals("h") || testCMD.toLowerCase().equals("homes") || testCMD.toLowerCase().equals("3")) { homes(player); }
        if (testCMD.toLowerCase().equals("c") || testCMD.toLowerCase().equals("cars") || testCMD.toLowerCase().equals("4")) { cars(player); }
        if (testCMD.toLowerCase().equals("p") || testCMD.toLowerCase().equals("player") || testCMD.toLowerCase().equals("5")) { player(player); }
        if (testCMD.toLowerCase().equals("sc") || testCMD.toLowerCase().equals("scenario") || testCMD.toLowerCase().equals("6")) { scenario(player); }
        if (testCMD.toLowerCase().equals("si") || testCMD.toLowerCase().equals("sickness") || testCMD.toLowerCase().equals("7")) { sickness(player); }
    }
    // ----- Testing Functions ---- //
    public void stats(Player player) {
        Skills skills = new Skills();
        ColorText colorText = new ColorText();
        System.out.println(colorText.Clear());
        System.out.println(colorText.Red() + "Test - " + colorText.Reset() + "Hungerford Skill: " + colorText.Blue() + player.skills.getHungerfordSkill() + colorText.Reset());
        System.out.println(colorText.Red() + "Test - " + colorText.Reset() + "Social Skill: " + colorText.Blue() + player.skills.getSocialSkills() + colorText.Reset());
        System.out.println(colorText.Red() + "Test - " + colorText.Reset() + "Technical Skill: " + colorText.Blue() + player.skills.getTechnicalSkills() + colorText.Reset());
        System.out.println(colorText.Red() + "Test - " + colorText.Reset() + "Management Skill: " + colorText.Blue() + player.skills.getManagementSkills() + colorText.Reset());
        System.out.println(colorText.Red() + "Test - " + colorText.Reset() + "Research Skill: " + colorText.Blue() + player.skills.getResearchSkills() + colorText.Reset());
        System.out.println(colorText.Red() + "Test - " + colorText.Reset() + "Presentation Skill: " + colorText.Blue() + player.skills.getPresentationSkills() + colorText.Reset());
        System.out.println(colorText.Red() + "Test - " + colorText.Reset() + "Sales Skill: " + colorText.Blue() + player.skills.getSalesSkills() + colorText.Reset());
        System.out.println(colorText.Red() + "Test - " + colorText.Reset() + "Negotiation Skill: " + colorText.Blue() + player.skills.getNegotiationSkills() + colorText.Reset());
        System.out.println(colorText.Red() + "Test - " + colorText.Reset() + "Teaching Skill: " + colorText.Blue() + player.skills.getTeachingSkills() + colorText.Reset());
        System.out.println(colorText.Red() + "Test - " + colorText.Reset() + "Writing Skill: " + colorText.Blue() + player.skills.getWritingSkills() + colorText.Reset());
        System.out.println(colorText.Red() + "Test - " + colorText.Reset() + "Language Skill: " + colorText.Blue() + player.skills.getLanguageSkills() + colorText.Reset());
        System.out.println(colorText.Red() + "Test - " + colorText.Reset() + "Time Management Skill: " + colorText.Blue() + player.skills.getTimeManagementSkills() + colorText.Reset());
    }

    public void furnature(Player player) {
        
    }

    public void homes(Player player) {
        
    }

    public void cars(Player player) {
        
    }

    public void sickness(Player player) {
        player.setHealth(Player.HealthList[3]);
    }

    public void player(Player player) {
        ColorText colorText = new ColorText();
        System.out.println(colorText.Clear());
        System.out.println(colorText.Red() + player + colorText.Reset());
    }

    public void scenario(Player player) {
        Scanner scan = new Scanner(System.in);
        Scenario scenario = new Scenario();
        ColorText colorText = new ColorText();
        System.out.println(colorText.Clear());
        System.out.println(" ");
        System.out.print(colorText.Red() + "scenario: test: Type: ");
        Boolean day = scan.nextBoolean();
        if (day) {
            System.out.println(" ");
            System.out.println(scenario.DeliveryScenario(player, day));
        } else {
            System.out.println(colorText.Red() + "That's not a valid boolean!" + colorText.Reset());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
