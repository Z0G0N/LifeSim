import java.util.Random;

class Scenario {
    
    private static String TypeOfDay;

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
            "Bad", //                 < 3
            "Okay",//                 > 4 < 9
            "Good",//                 > 10 < 19
            "Great",//                > 20 < 29
            "Awesome",//              > 30 < 39
            "Amazing",//              > 40 < 49
            "Fantastic",//            > 50 < 59
            "Incredible",//           > 60 < 69
            "Unbelievable",//         > 70 < 79
            "Legendary",//            > 80 < 98
            "Hungerford type day",//  > 99
        };

        int rand = Random(100);

        if (rand < 3) {
            TypeOfDay = typeOfDay[0];
        }
        if (rand > 4 && rand < 9) {
            TypeOfDay = typeOfDay[1];
        }
        if (rand > 10 && rand < 19) {
            TypeOfDay = typeOfDay[2];
        }
        if (rand > 20 && rand < 29) {
            TypeOfDay = typeOfDay[3];
        }
        if (rand > 30 && rand < 39) {
            TypeOfDay = typeOfDay[4];
        }
        if (rand > 40 && rand < 49) {
            TypeOfDay = typeOfDay[5];
        }
        if (rand > 50 && rand < 59) {
            TypeOfDay = typeOfDay[6];
        }
        if (rand > 60 && rand < 69) {
            TypeOfDay = typeOfDay[7];
        }
        if (rand > 70 && rand < 79) {
            TypeOfDay = typeOfDay[8];
        }
        if (rand > 80 && rand < 98) {
            TypeOfDay = typeOfDay[9];
        }
        if (rand > 99) {
            TypeOfDay = typeOfDay[10];
        }
    }

    public String DeliveryScenario(Player player, Boolean day) {
        // Get the player's current state
        String action = "";
        int social = player.skills.getSocialSkills();
        int timeM = player.skills.getTimeManagementSkills();
        int sanity = player.getSanity();
        Type_of_Day(day);
        String typeOfDay = TypeOfDay;
        
        if (social < 5) {
            if (timeM < 5) {
                if (sanity < 5) {
                    action = "You got lost and had trouble finding the delivery address and your was fustraded.";
                } else {
                    action = "You encountered heavy traffic and the delivery took longer than expected.";
                }
            } else {
                if (sanity < 5) {
                    if (player.getSanity() <= 0) {
                        player.setSanity(0);
                    } else {
                        player.subtractSanity(1);
                    }
                    int randomCash = Random(15);
                    action = "The food was spilled during transportation and you had to go back to the restaurant to get a new order.";
                    action += "\nYou earned " + randomCash + "and gained 12 sanity points.";
                } else {
                    if (player.getSanity() >= 100) {
                        player.setSanity(100);
                    } else {
                        player.addSanity(12);
                    }
                    int randomCash = Random(15);
                    player.addCash(randomCash);
                    action = "You delivered on time! The customer was very happy with your service and left you a glowing review online.";
                    action += "\nYou earned " + randomCash + "and gained 12 sanity points.";
                }
            } 
        }
        
        return action;
    }
}
