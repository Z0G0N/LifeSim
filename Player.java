//Player Class
public class Player {
    private int lifePoints;
    private int Thirst;
    private int Hunger;
    private int Sanity;
    private int level;
    private int exp;
    private int cash;
    private String name;
    private String car;
    private String Hardwear;
    private String Softwear;
    private String health; //Sicknesses
    private String sleep;
    private String bedType;
    private String house;
    private String BrainStatus;
    Skills skills;

    public Player(String name) {
        this.level = 1;
        this.exp = 0;
        this.cash = 50;
        this.name = name;
        this.car = "No";
        this.lifePoints = 100;
        this.Thirst = 100;
        this.Hunger = 100;
        this.Sanity = 100;
        this.Hardwear = "No";
        this.Softwear = "No";
        this.health = "Healthy";
        this.sleep = "Awake";
        this.bedType = "No";
        this.house = "No";
        this.BrainStatus = "Smooth brain";
        this.skills = new Skills();
        skills.setSocialSkills(0);
        skills.setTechnicalSkills(0);
        skills.setManagementSkills(0);
        skills.setResearchSkills(0);
        skills.setPresentationSkills(0);
        skills.setSalesSkills(0);
        skills.setNegotiationSkills(0);
        skills.setTeachingSkills(0);
        skills.setWritingSkills(0);
        skills.setLanguageSkills(0);
        skills.setTimeManagementSkills(0);
        skills.setHungerfordSkill(0);
    }

    // ------ Getters ------
    public int getLevel() {
        return this.level;
    }

    public String getSoftwear() {
        return this.Softwear;
    }

    public String getHealth() {
        return this.health;
    }

    public String getSleep() {
        return this.sleep;
    }

    public String getBedType() {
        return this.bedType;
    }

    public String getHouse() {
        return this.house;
    }

    public String getBrainStatus() {
        return this.BrainStatus;
    }

    public int getExp() {
        return this.exp;
    }

    public int getCash() {
        return this.cash;
    }

    public String getName() {
        return this.name;
    }

    public String getCar() {
        return this.car;
    }

    public int getLifePoints() {
        return this.lifePoints;
    }

    public int getThirst() {
        return this.Thirst;
    }

    public int getHunger() {
        return this.Hunger;
    }

    public int getSanity() {
        return this.Sanity;
    }

    public String getHardwear() {
        return this.Hardwear;
    }

    // ------ Setters ------

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setThirst(int Thirst) {
        this.Thirst = Thirst;
    }

    public void setHunger(int Hunger) {
        this.Hunger = Hunger;
    }

    public void setSanity(int Sanity) {
        this.Sanity = Sanity;
    }

    public void setHardwear(String Hardwear) {
        this.Hardwear = Hardwear;
    }

    // ------ Methods ------

    public void addExp(int exp) {
        this.exp += exp;
    }

    public void addCash(int cash) {
        this.cash += cash;
    }

    public void addLevel(int level) {
        this.level += level;
    }

    public void addCar(String car) {
        this.car = car;
    }

    public String toString() {
        return "Player: " + this.name + "\nLevel: " + this.level + "\nExp: " + this.exp + "\nCash: " + this.cash + "\nCar: " + this.car;
    }

}

