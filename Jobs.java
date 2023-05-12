import java.util.Random;

public class Jobs {

    public int Random(int range){
        if (range <= 0) {
            range = 0;
        }
        Random random = new Random();
        int randomNumber = random.nextInt(range);
        return randomNumber;
    }

    public void Delivery(Player player) {
        ColorText colorText = new ColorText();
        if (player.getDriversLicence()) {
            int randomLuck = Random(100);
            Boolean Day;

            if (randomLuck <= 50) {
                Day = false;
            } else {
                Day = true;
            }

            if (Day) {
                // --- Good Day ---
                int randomCash = Random(20);
                player.addCash(randomCash);
                player.addSanity(12);
                System.out.println("You earned a total of " + colorText.Green() +  "$" + randomCash + colorText.Reset() + "and gained 12 sanity points.");

            } else {
                // --- Bad Day ---
                int randomCash = Random(10);
                player.addCash(randomCash);
                player.subtractSanity(-2);
                System.out.println("You earned a total of " + colorText.Green() +  "$" + randomCash + colorText.Reset() + "and lost 2 sanity points.");
            }
        } else {
            System.out.println("You need a drivers licence to be a delivery driver.");
        }
        
    }

    public void Uber(Player player) {
        //Uber: $15-$25 per hour, driver's license, reliable vehicle, navigation skills, good driving record, customer service skills
        ColorText colorText = new ColorText();
        if (player.getDriversLicence()) {
            int randomLuck = Random(100);
            Boolean Day;

            if (randomLuck <= 50) {
                Day = false;
            } else {
                Day = true;
            }

            if (Day) {
                // --- Good Day ---
                int randomCash = Random(25);
                player.addCash(randomCash);
                if (player.getSanity() >= 100) {
                    player.setSanity(100);
                } else {
                    player.addSanity(12);
                }
                player.subtractThirst(5);
                player.subtractLifePoints(5);
                player.subtractHunger(5);
                System.out.println("You earned a total of " + colorText.Green() +  "$" + randomCash + colorText.Reset());

            } else {
                // --- Bad Day ---
                int randomCash = Random(15);
                player.addCash(randomCash);
                if (player.getSanity() <= 0) {
                    player.setSanity(0);
                } else {
                    player.subtractSanity(-2);
                }
                player.subtractThirst(5);
                player.subtractLifePoints(5);
                player.subtractHunger(5);
                System.out.println("You earned a total of " + colorText.Green() +  "$" + randomCash + colorText.Reset());
            }
        } else {
            System.out.println("You need a drivers licence to be an Uber driver.");
        }
    }

    public void Pizza_worker(Player player) {
        //Pizza_worker: $8-$12 per hour plus tips, basic math skills, good customer service skills, ability to work in a fast-paced environment
        ColorText colorText = new ColorText();
        int randomLuck = Random(100);
        Boolean Day;
        if (randomLuck <= 50) {
            Day = false;
        } else {
            Day = true;
        }

        if (Day) {  
            // --- Good Day ---
            int randomCash = Random(12);
            player.addCash(randomCash);
            if (player.getSanity() >= 100) {
                player.setSanity(100);
            } else {
                player.addSanity(12);
            }
            player.subtractThirst(5);
            player.subtractLifePoints(5);
            player.subtractHunger(5);
            System.out.println("You earned a total of " + colorText.Green() +  "$" + randomCash + colorText.Reset());

        } else {
            // --- Bad Day ---
            int randomCash = Random(8);
            player.addCash(randomCash);
            if (player.getSanity() <= 0) {
                player.setSanity(0);
            } else {
                player.addSanity(-2);
            }
            player.subtractThirst(5);
            player.subtractLifePoints(5);
            player.subtractHunger(5);
            System.out.println("You earned a total of " + colorText.Green() +  "$" + randomCash + colorText.Reset());
        }
    }

    public void Fast_Food_Worker(Player player) {
        //Fast_Food_Worker: $8-$12 per hour plus tips, basic math skills, good customer service skills, ability to work in a fast-paced environment
        ColorText colorText = new ColorText();
        int randomLuck = Random(100);
        Boolean Day;
        
        if (randomLuck <= 50) {
            Day = false;
        } else {
            Day = true;
        }

        if (Day) {
            // --- Good Day ---
            int randomCash = Random(12);
            int tips = Random(5);
            player.addCash(randomCash + tips);
            if (player.getSanity() >= 100) {
                player.setSanity(100);
            } else {
                player.addSanity(12);
            }
            player.subtractThirst(5);
            player.subtractLifePoints(5);
            player.subtractHunger(5);
            System.out.println("You earned a total of " + colorText.Green() +  "$" + randomCash + colorText.Reset() + " and $" + tips + " in tips");

        } else {
            // --- Bad Day ---
            int randomCash = Random(8);
            player.addCash(randomCash);
            if (player.getSanity() <= 0) {
                player.setSanity(0);
            } else {
                player.addSanity(-2);
            }
            player.subtractThirst(5);
            player.subtractLifePoints(5);
            player.subtractHunger(5);
            System.out.println("You earned a total of " + colorText.Green() +  "$" + randomCash + colorText.Reset());
        }
    }

    public int Mail_Man(Player player) {
        //Mail_Man: $15-$25 per hour, driver's license, ability to lift and carry heavy packages, good time management skills, customer service skills
        return 1;
    }

    public int Teacher(Player player) {
        //Teacher: $25-$50 per hour, Bachelor's degree in Education or related field, teaching certificate, excellent communication and organizational skills
        return 1;
    }
    
    public int Professor(Player player) {
        //Professor: $50-$100 per hour, PhD in related field, teaching experience, excellent communication and organizational skills
        return 1;
    }

    public int Engineer(Player player) {
        //Engineer: $60,000-$100,000 per year, Bachelor's degree in Engineering or related field, knowledge of relevant software and programming languages, excellent problem-solving and analytical skills
        return 1;
    }

    public int Developer(Player player) {
        //Developer: $60,000-$120,000 per year, Bachelor's degree in Computer Science or related field, knowledge of relevant software and programming languages, excellent problem-solving and analytical skills
        return 1;
    }
    
    public int Salesman(Player player) {
        //Salesman: $30,000-$80,000 per year plus commission, excellent communication and interpersonal skills, ability to negotiate and close deals, good time management and organizational skills
        return 1;
    }

    public int Lawyer(Player player) {
        //Lawyer: $80,000-$150,000 per year, Juris Doctor degree, passed the bar exam, excellent communication and analytical skills, ability to research and interpret laws and regulations
        return 1;
    }

    public int Doctor(Player player) {
        //Doctor: $200,000-$500,000 per year, Medical degree, residency and licensure, excellent medical knowledge and diagnostic skills, ability to communicate with patients and collaborate with other medical professionals
        return 1;
    }

    public int Astronaut(Player player) {
        //Astronaut: $66,000-$144,000 per year, Bachelor's degree in a STEM field, excellent physical health and fitness, ability to work in confined spaces and under pressure, experience in aviation or space-related fields
        return 1;
    }
}