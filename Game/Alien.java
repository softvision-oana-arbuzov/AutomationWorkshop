public class Alien implements Character {
    private Integer health;
    private Integer energy;
    private boolean isDead;

    public Alien(Integer health, Integer energy) {
        this.health = health;
        this.energy = energy;
        this.isDead = false;
    }

    //Getters and Setters
    public Integer getHealthAlien() {
        return this.health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    @Override
    public Integer getHealth() {
        return getHealthAlien();
    }

    public Integer getEnergy() {
        return this.energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public Integer biteHuman(Human human) {
        Integer humanHealth = human.getHealth();
        if (this.energy <= 100 && this.energy >= 80) {
            humanHealth = humanHealth - 20;
            human.setHealth(humanHealth);
            this.energy = this.energy - 10;
            return humanHealth;
        } else if (this.energy < 80 && this.energy >= 50) {
            humanHealth = humanHealth - 10;
            human.setHealth(humanHealth);
            this.energy = this.energy - 10;
            return humanHealth;
        } else if (this.energy < 50 && this.energy >=10) {
            humanHealth = humanHealth - 5;
            human.setHealth(humanHealth);
            this.energy = this.energy - 10;
            return humanHealth;
        } else {
            human.isDead();
        }
        return humanHealth;
    }

    public boolean isDead() {
        if (this.health == 0) {
            System.out.println("Human is dead");
            return true;
        }
        return false;
    }

}
