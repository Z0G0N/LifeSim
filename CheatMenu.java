public class CheatMenu {
    public static void setCash(Player player, int cash) {
        player.setCash(cash);
    }

    public static void setExp(Player player, int exp) {
        player.setExp(exp);
    }

    public static void setLevel(Player player, int level) {
        player.setLevel(level);
    }

    public static void setLifePoints(Player player, int lifePoints) {
        player.setLifePoints(lifePoints);
    }

    public static void setThirst(Player player, int thirst) {
        player.setThirst(thirst);
    }

    public static void setHunger(Player player, int hunger) {
        player.setHunger(hunger);
    }

    public static void setSanity(Player player, int sanity) {
        player.setSanity(sanity);
    }

    public static void setHardwear(Player player, String hardwear) {
        player.setHardwear(hardwear);
    }

    public static void setCar(Player player, String car) {
        player.setCar(car);
    }

    public static void setDriversLicence(Player player, Boolean driversLicence) {
        player.setDriversLicence(driversLicence);
    }

    public static void setSocialSkills(Skills skills, int socialSkills) {
        skills.setSocialSkills(socialSkills);
    }

    public static void setTechnicalSkills(Skills skills, int technicalSkills) {
        skills.setTechnicalSkills(technicalSkills);
    }

    public static void setManagementSkills(Skills skills, int managementSkills) {
        skills.setManagementSkills(managementSkills);
    }

    public static void setResearchSkills(Skills skills, int researchSkills) {
        skills.setResearchSkills(researchSkills);
    }

    public static void setPresentationSkills(Skills skills, int presentationSkills) {
        skills.setPresentationSkills(presentationSkills);
    }

    public static void setSalesSkills(Skills skills, int salesSkills) {
        skills.setSalesSkills(salesSkills);
    }

    public static void setNegotiationSkills(Skills skills, int negotiationSkills) {
        skills.setNegotiationSkills(negotiationSkills);
    }

    public static void setTeachingSkills(Skills skills, int teachingSkills) {
        skills.setTeachingSkills(teachingSkills);
    }

    public static void setWritingSkills(Skills skills, int writingSkills) {
        skills.setWritingSkills(writingSkills);
    }

    // ------ Adders ------ //

    public static void addCash(Player player, int cash) {
        player.addCash(cash);
    }

    public static void addExp(Player player, int exp) {
        player.addExp(exp);
    }

    public static void addLevel(Player player, int level) {
        player.addLevel(level);
    }

    public static void addLifePoints(Player player, int lifePoints) {
        player.addLifePoints(lifePoints);
    }

    public static void addThirst(Player player, int thirst) {
        player.addThirst(thirst);
    }

    public static void addHunger(Player player, int hunger) {
        player.addHunger(hunger);
    }

    public static void addSanity(Player player, int sanity) {
        player.addSanity(sanity);
    }

    public static void addSocialSkills(Skills skills, int socialSkills) {
        skills.setSocialSkills(skills.getSocialSkills() + socialSkills);
    }

    public static void addTechnicalSkills(Skills skills, int technicalSkills) {
        skills.setTechnicalSkills(skills.getTechnicalSkills() + technicalSkills);
    }

    public static void addManagementSkills(Skills skills, int managementSkills) {
        skills.setManagementSkills(skills.getManagementSkills() + managementSkills);
    }

    public static void addResearchSkills(Skills skills, int researchSkills) {
        skills.setResearchSkills(skills.getResearchSkills() + researchSkills);
    }

    public static void addPresentationSkills(Skills skills, int presentationSkills) {
        skills.setPresentationSkills(skills.getPresentationSkills() + presentationSkills);
    }

    public static void addSalesSkills(Skills skills, int salesSkills) {
        skills.setSalesSkills(skills.getSalesSkills() + salesSkills);
    }

    public static void addNegotiationSkills(Skills skills, int negotiationSkills) {
        skills.setNegotiationSkills(skills.getNegotiationSkills() + negotiationSkills);
    }

    public static void addTeachingSkills(Skills skills, int teachingSkills) {
        skills.setTeachingSkills(skills.getTeachingSkills() + teachingSkills);
    }

    public static void addWritingSkills(Skills skills, int writingSkills) {
        skills.setWritingSkills(skills.getWritingSkills() + writingSkills);
    }

    // ------ Subtractors ------ //

    public static void subtractCash(Player player, int cash) {
        player.subtractCash(cash);
    }

    public static void subtractExp(Player player, int exp) {
        player.setExp(player.getExp() - exp);
    }

    public static void subtractLevel(Player player, int level) {
        player.setLevel(player.getLevel() - level);
    }

    public static void subtractLifePoints(Player player, int lifePoints) {
        player.subtractLifePoints(lifePoints);
    }

    public static void subtractThirst(Player player, int thirst) {
        player.subtractThirst(thirst);
    }

    public static void subtractHunger(Player player, int hunger) {
        player.subtractHunger(hunger);
    }

    public static void subtractSanity(Player player, int sanity) {
        player.subtractSanity(sanity);
    }

    public static void subtractSocialSkills(Skills skills, int socialSkills) {
        skills.setSocialSkills(skills.getSocialSkills() - socialSkills);
    }

    public static void subtractTechnicalSkills(Skills skills, int technicalSkills) {
        skills.setTechnicalSkills(skills.getTechnicalSkills() - technicalSkills);
    }

    public static void subtractManagementSkills(Skills skills, int managementSkills) {
        skills.setManagementSkills(skills.getManagementSkills() - managementSkills);
    }

    public static void subtractResearchSkills(Skills skills, int researchSkills) {
        skills.setResearchSkills(skills.getResearchSkills() - researchSkills);
    }

    public static void subtractPresentationSkills(Skills skills, int presentationSkills) {
        skills.setPresentationSkills(skills.getPresentationSkills() - presentationSkills);
    }

    public static void subtractSalesSkills(Skills skills, int salesSkills) {
        skills.setSalesSkills(skills.getSalesSkills() - salesSkills);
    }

    public static void subtractNegotiationSkills(Skills skills, int negotiationSkills) {
        skills.setNegotiationSkills(skills.getNegotiationSkills() - negotiationSkills);
    }

    public static void subtractTeachingSkills(Skills skills, int teachingSkills) {
        skills.setTeachingSkills(skills.getTeachingSkills() - teachingSkills);
    }

    public static void subtractWritingSkills(Skills skills, int writingSkills) {
        skills.setWritingSkills(skills.getWritingSkills() - writingSkills);
    }

    // ------ Getters ------ //

    public static String getCar(Player player) {
        return player.getCar();
    }

    public static int getCash(Player player) {
        return player.getCash();
    }

    public static int getExp(Player player) {
        return player.getExp();
    }

    public static int getLevel(Player player) {
        return player.getLevel();
    }

    public static int getLifePoints(Player player) {
        return player.getLifePoints();
    }

    public static int getThirst(Player player) {
        return player.getThirst();
    }

    public static int getHunger(Player player) {
        return player.getHunger();
    }

    public static int getSanity(Player player) {
        return player.getSanity();
    }

    public static int getSocialSkills(Skills skills) {
        return skills.getSocialSkills();
    }

    public static int getTechnicalSkills(Skills skills) {
        return skills.getTechnicalSkills();
    }

    public static int getManagementSkills(Skills skills) {
        return skills.getManagementSkills();
    }

    public static int getResearchSkills(Skills skills) {
        return skills.getResearchSkills();
    }

    public static int getPresentationSkills(Skills skills) {
        return skills.getPresentationSkills();
    }

    public static int getSalesSkills(Skills skills) {
        return skills.getSalesSkills();
    }

    public static int getNegotiationSkills(Skills skills) {
        return skills.getNegotiationSkills();
    }

    public static int getTeachingSkills(Skills skills) {
        return skills.getTeachingSkills();
    }

    public static int getWritingSkills(Skills skills) {
        return skills.getWritingSkills();
    }



}
