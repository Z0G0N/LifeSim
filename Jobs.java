import java.beans.Statement;
import java.util.Random;

class Jobs {

    public int Random(int range){
        if (range <= 0) {
            range = 0;
        }
        Random random = new Random();
        int randomNumber = random.nextInt(range); // Generates a random number between 0 and 9
        return randomNumber;
    }

    public String Delivery(Player player) {
        String senerio;
        String Statement;

        String[] scenarios = {
            "You got lost and had trouble finding the delivery address.",
            "The customer was not home and you had to wait for them to come back.",
            "The food was spilled during transportation and you had to go back to the restaurant to get a new order.",
            "You accidentally delivered the wrong order to the customer and had to go back to correct the mistake.",
            "The customer gave you a generous tip for your excellent service.",
            "You encountered heavy traffic and the delivery took longer than expected.",
            "The customer complained that the food was cold and demanded a refund.",
            "You got a flat tire on the way to the delivery and had to change it.",
            "The customer was very friendly and made your delivery experience enjoyable.",
            "You got a parking ticket while making a delivery.",
            "The customer gave you a bad review online for no apparent reason.",
            "You had a small accident while making a delivery but nobody was hurt.",
            "The customer's dog got loose and chased after you while you were delivering the food.",
            "You had to deal with a difficult restaurant staff who were slow to prepare the food for delivery.",
            "The customer was very happy with your service and left you a glowing review online."
        };

        //----Check if player has a drivers license----//
        int rand = 0;
        if (player.skills.getSocialSkills() == 0 && player.getDriversLicence()) {
            int randomLuck = Random(100);
            if (randomLuck <= 50) {
                //---Bad Luck---//
                senerio = scenarios[Random(15)];
                rand = Random(10);
                player.addCash(rand);
                player.subtractHunger(-2);
                player.subtractThirst(-2);
                player.subtractSanity(-4);
                Statement = "Aww, you only made $" + rand + " delivering food. " + senerio;
            } else {    
                //---Good Luck---//
                rand = Random(20);
                player.addCash(rand);
                player.subtractHunger(-2);
                player.subtractThirst(-2);
                player.subtractSanity(-1);
                Statement = "You made $" + rand + " delivering food!";
            }
        } else {
            Statement = "You don't have a drivers license!";
        }

        return Statement;
    }

    public static int Uber(Player player) {
        //random money system
        //Uber: $15-$25 per hour, driver's license, reliable vehicle, navigation skills, good driving record, customer service skills
        return 1;
    }

    public static int Pizza_worker(Player player) {
        //random money system
        //Pizza_worker: $8-$12 per hour plus tips, basic math skills, good customer service skills, ability to work in a fast-paced environment
        return 1;
    }

    public static int Fast_Food_Worker(Player player) {
        //random money system
        //Fast_Food_Worker: $8-$12 per hour plus tips, basic math skills, good customer service skills, ability to work in a fast-paced environment
        return 1;
    }

    public static int Mail_Man(Player player) {
        //random money system
        //Mail_Man: $15-$25 per hour, driver's license, ability to lift and carry heavy packages, good time management skills, customer service skills
        return 1;
    }

    public static int Teacher(Player player) {
        //random money system
        //Teacher: $25-$50 per hour, Bachelor's degree in Education or related field, teaching certificate, excellent communication and organizational skills
        return 1;
    }
    
    public static int Professor(Player player) {
        //random money system
        //Professor: $50-$100 per hour, PhD in related field, teaching experience, excellent communication and organizational skills
        return 1;
    }

    public static int Engineer(Player player) {
        //random money system
        //Engineer: $60,000-$100,000 per year, Bachelor's degree in Engineering or related field, knowledge of relevant software and programming languages, excellent problem-solving and analytical skills
        return 1;
    }

    public static int Developer(Player player) {
        //random money system
        //Developer: $60,000-$120,000 per year, Bachelor's degree in Computer Science or related field, knowledge of relevant software and programming languages, excellent problem-solving and analytical skills
        return 1;
    }
    
    public static int Salesman(Player player) {
        //random money system
        //Salesman: $30,000-$80,000 per year plus commission, excellent communication and interpersonal skills, ability to negotiate and close deals, good time management and organizational skills
        return 1;
    }

    public static int Lawyer(Player player) {
        //random money system
        //Lawyer: $80,000-$150,000 per year, Juris Doctor degree, passed the bar exam, excellent communication and analytical skills, ability to research and interpret laws and regulations
        return 1;
    }

    public static int Doctor(Player player) {
        //random money system
        //Doctor: $200,000-$500,000 per year, Medical degree, residency and licensure, excellent medical knowledge and diagnostic skills, ability to communicate with patients and collaborate with other medical professionals
        return 1;
    }

    public static int Astronaut(Player player) {
        //random money system
        //Astronaut: $66,000-$144,000 per year, Bachelor's degree in a STEM field, excellent physical health and fitness, ability to work in confined spaces and under pressure, experience in aviation or space-related fields
        return 1;
    }
}