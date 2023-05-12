import java.util.Random;

public class Scenario {
    
    private static String TypeOfDay;
    private static int DayNum;

    public static int Random(int range){
        if (range <= 0) {
            range = 0;
        }
        Random random = new Random();
        int randomNumber = random.nextInt(range);
        return randomNumber;
    }

    public void Type_of_Day(Boolean Day) {
        String[] typeOfDay = {
            "Bad",
            "Okay",
            "Good",
            "Great",
            "Awesome",
            "Amazing",
            "Fantastic",
            "Incredible",
            "Unbelievable",
            "Legendary",
            "Hungerford type day",
        };

        int rand = Random(100);
        DayNum = rand;
        if (rand < 3) {
            TypeOfDay = typeOfDay[0];
        }
        if (rand > 3 && rand < 20) {
            TypeOfDay = typeOfDay[1];
        }
        if (rand > 20 && rand < 40) {
            TypeOfDay = typeOfDay[2];
        }
        if (rand > 40 && rand < 65) {
            TypeOfDay = typeOfDay[3];
        }
        if (rand > 65 && rand < 70) {
            TypeOfDay = typeOfDay[4];
        }
        if (rand > 70 && rand < 80) {
            TypeOfDay = typeOfDay[5];
        }
        if (rand > 80 && rand < 85) {
            TypeOfDay = typeOfDay[6];
        }
        if (rand > 85 && rand < 90) {
            TypeOfDay = typeOfDay[7];
        }
        if (rand > 90 && rand < 97) {
            TypeOfDay = typeOfDay[8];
        }
        if (rand > 97 && rand < 99) {
            TypeOfDay = typeOfDay[9];
        }
        if (rand > 99) {
            TypeOfDay = typeOfDay[10];
        }
    }

    public String DeliveryScenario(Player player, Boolean day) {
        // Get the player's current state
        String action = "";
        Type_of_Day(day);
        String typeOfDay = TypeOfDay;
        double result = player.skills.getSocialSkills() * .25 + 
                        player.skills.getTimeManagementSkills() * .25 + 
                        DayNum * .25 +
                        player.getSanity() * .25;
        System.out.println(typeOfDay + " " + DayNum + " Result: " + result);
        
        return action;
    }
}
