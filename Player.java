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
    private Object health; //Sicknesses
    private String sleep;
    private String bedType;
    private String house;
    private String BrainStatus;
    private Boolean DriversLicence;
    public static String[] HealthList = { "Healthy","Cold","Flu","Covid","Pneumonia","Asthma","Allergies","Migraine","Stomach flu","Food poisoning"};
    Skills skills;

    public Player(String name) {
        this.level = 0;
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
        this.health = HealthList[0];
        this.sleep = "Awake";
        this.bedType = "No";
        this.house = "No";
        this.BrainStatus = "Smooth brain";
        this.DriversLicence = false;
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

    // ------ exp ------

    public void addExp() {
        if (this.exp >= this.level * 15) {
            addLevel(1);;
            this.exp = 0;
        } else {
            this.exp += 15;
        }
    }

    // ------ Getters ------
    public int getLevel() {
        return this.level;
    }

    public String getSoftwear() {
        return this.Softwear;
    }

    public Object getHealth() {
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

    public Boolean getDriversLicence() {
        return this.DriversLicence;
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

    public void setSoftwear(String Softwear) {
        this.Softwear = Softwear;
    }

    public void setHealth(Object object) {
        this.health = object;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setBrainStatus(String BrainStatus) {
        this.BrainStatus = BrainStatus;
    }

    public void setDriversLicence(Boolean DriversLicence) {
        this.DriversLicence = DriversLicence;
    }

    // ------ Add ------

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

    public void addLifePoints(int lifePoints) {
        this.lifePoints += lifePoints;
    }

    public void addThirst(int Thirst) {
        this.Thirst += Thirst;
    }

    public void addHunger(int Hunger) {
        this.Hunger += Hunger;
    }

    public void addSanity(int Sanity) {
        this.Sanity += Sanity;
    }

    public void addHardwear(String Hardwear) {
        this.Hardwear = Hardwear;
    }

    public void addSoftwear(String Softwear) {
        this.Softwear = Softwear;
    }

    // ------ Subtract ------

    public void subtractCash(int cash) {
        this.cash -= cash;
    }

    public void subtractLifePoints(int lifePoints) {
        this.lifePoints -= lifePoints;
    }

    public void subtractThirst(int Thirst) {
        this.Thirst -= Thirst;
    }

    public void subtractHunger(int Hunger) {
        this.Hunger -= Hunger;
    }

    public void subtractSanity(int Sanity) {
        this.Sanity -= Sanity;
    }

    // ------ Other ------

    public String toString() {
        return "Player: " + this.name + "\nLevel: " + this.level + "\nExp: " + this.exp + "\nCash: " + this.cash + "\nCar: " + this.car + "\nLife Points: " + this.lifePoints + "\nThirst: " + this.Thirst + "\nHunger: " + this.Hunger + "\nSanity: " + this.Sanity + "\nHardwear: " + this.Hardwear + "\nSoftwear: " + this.Softwear + "\nHealth: " + this.health + "\nSleep: " + this.sleep + "\nBed Type: " + this.bedType + "\nHouse: " + this.house + "\nBrain Status: " + this.BrainStatus + "\nDrivers Licence: " + this.DriversLicence;
    }

}

